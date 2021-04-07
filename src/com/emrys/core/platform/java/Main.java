package com.emrys.core.platform.java;

import java.io.*;

public class Main {

    public static void main(String[] args) {

//        doTryCatchFinally();
        doCloseThing();

    }

    public static void doTryCatchFinally(){
        try(Reader reader = new InputStreamReader(new FileInputStream(".//Resources//test-data.txt"));
            Writer writer = new OutputStreamWriter(new FileOutputStream(".//Resources//test-insert-data.txt"))
        )
        {
            int length;
            char[] charArray = new char[5];
            while ((length = reader.read(charArray))>=0){
                System.out.println(length);
                writer.write(charArray,0,length);

            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void doCloseThing(){
        try(MyAutoClosable myAutoClosable = new MyAutoClosable()){
            myAutoClosable.saySomething();
        }catch (Exception e){
            System.out.println(e.getMessage());

            for(Throwable ex: e.getSuppressed()){
                System.out.println(ex.getMessage());

            }
        }
    }

}
