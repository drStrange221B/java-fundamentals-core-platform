package b;

import java.io.*;

public class AddParameterArgument {

    public static void main(String[] args) {

        if(args.length<=0){
            System.out.println("There are not argument !");
        }else{

            for(String word: args){
                System.out.println(word);
            }
        }

    }

}
