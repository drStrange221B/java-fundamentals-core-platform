package com.emrys.core.platform.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddFileParameterAsArugument {

    public static void main(String[] args){
        boolean check = false;

        if(args.length==0){

            System.out.println("Please pass file name argument");
            return;
        }
        Path file = Paths.get(".//Resources//" + args[0]);
        if(Files.exists(file)){

            readFile(file);
        }


    }

    private static void readFile(Path fileName){


        try(BufferedReader bufferedReader = Files.newBufferedReader(fileName)){
            String line = null;
          while( (line = bufferedReader.readLine() )!=null){

              System.out.println(line);
          }

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }


}
