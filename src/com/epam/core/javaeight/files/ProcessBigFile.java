package com.epam.core.javaeight.files;

import java.io.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ProcessBigFile {

    public static void main(String[] args) throws IOException {


      //  writeFile();
        LocalDateTime start =  LocalDateTime.now();
        readFileWithOutBatch();
        LocalDateTime end =  LocalDateTime.now();
        System.out.println("Time to read file - "+  Duration.between(start, end));
    }

    public static void readFile(){
        String path = "C:\\git\\nayanravankar\\generated.csv";
        String line="";
        Integer batchSize = 1000;
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<String> batch = new ArrayList<>();
            while ( (line = br.readLine()) != null){
                batch.add(line);
                if (batch.size() == batchSize){
                    // store in DB
                    batch.forEach(
                            s -> {
                                String []str = s.split(",");
                                System.out.println(Arrays.stream(str).toList());
                            }
                    );
                    batch.clear();
                }

            }
            if (!batch.isEmpty()){
                // store in DB
                batch.forEach(
                        s -> {
                            String []str = s.split(",");
                            System.out.println(Arrays.stream(str).toList());
                        }
                );
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //will take same time as batch as we are not performing any DB related operations
    public static void readFileWithOutBatch(){
        String path = "C:\\git\\nayanravankar\\generated.csv";
        String line="";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            while ( (line = br.readLine()) != null){
                    // store in DB
                String []str = line.split(",");
                System.out.println(Arrays.stream(str).toList());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void writeFile() throws IOException {
        String path = "C:\\git\\nayanravankar\\generated.csv";

        try (FileWriter fileWriter = new FileWriter(path)){

            IntStream.range(0,10000000)
                    .forEach(
                            value -> {
                                try {
                                    fileWriter.write(value+", dummyname, datadob, dummyage,dummyaddress, dummymobile; \n");
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                    );

        };



    }
}
