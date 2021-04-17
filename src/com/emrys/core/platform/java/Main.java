package com.emrys.core.platform.java;

public class Main {


    public static void main(String[] var0) {
        if (var0.length <= 0) {
            System.out.println("There are not argument !");
        } else {
            String[] var1 = var0;
            int var2 = var0.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                String var4 = var1[var3];
                System.out.println(var4);
            }
        }
    }
}
