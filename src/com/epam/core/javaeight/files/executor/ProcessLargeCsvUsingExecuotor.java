package com.epam.core.javaeight.files.executor;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

public class ProcessLargeCsvUsingExecuotor {

    public static void main(String[] args) {

        String path = "C:\\git\\nayanravankar\\generated.csv";
        String outPath = "C:\\git\\nayanravankar\\output.csv";

        readAndWriteFile(path,outPath);

    }

    public static void readAndWriteFile(String path, String outPath){
        String line="";
        Integer batchSize = 1000;

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List< Future<List<String>>> futures = new ArrayList<>();
        AtomicLong atomicLong = new AtomicLong(0);

        try(BufferedReader br = new BufferedReader(new FileReader(path));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))){
            List<String> batch = new ArrayList<>();
            while ( (line = br.readLine()) != null){
                batch.add(line);
                if (batch.size() == batchSize){
                    // store in DB
                    futures.add(submitExecutorTask(executorService, batch, atomicLong));
                    batch.clear();
                }
            }
            if (!batch.isEmpty()){
                // store in DB
                futures.add(submitExecutorTask(executorService, batch, atomicLong));
            }
            System.out.println(atomicLong);

            for (Future<List<String>> future : futures) {
                List<String> processedChunk = future.get();
                for (String processedLine : processedChunk) {
                    bw.write(processedLine + "\n");
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private static Future<List<String>> submitExecutorTask(ExecutorService executorService, List<String> batch, AtomicLong atomicLong) {
        return executorService.submit(()->{
                List<String> chunk = new ArrayList<>(batch.size());
            for (String line :batch) {
                String []str = line.split(",");
               // str[1] = str[1]+" lastname";
                chunk.add(str.toString());

            }
            atomicLong.addAndGet(chunk.size());
            return chunk;
        });

    }
}
