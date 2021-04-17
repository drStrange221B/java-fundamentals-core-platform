package com.emrys.core.platform.java;

import sun.jvm.hotspot.debugger.win32.coff.TestDebugInfo;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class SettingDefaultProperties {

    public static void main(String[] args) {

        Properties defaultProperties = new Properties();

        try (InputStream inputStream = AddFileParameterAsArugument
                .class.getResourceAsStream("MyDefaultValues.xml")) {
            defaultProperties.loadFromXML(inputStream);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Properties properties = new Properties(defaultProperties);

        System.out.println(properties.getProperty("welcomeMessage"));
        try {
            loadUserPorps(properties);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(properties.getProperty("welcomeMessage"));

    }

    private static void loadUserPorps(Properties userProps) throws IOException{

        Path userFile = Paths.get(".//Resources//user.xml");

        if(Files.exists(userFile)){
            try(InputStream inputStream = Files.newInputStream(userFile)){
                userProps.loadFromXML(inputStream);
            }
        }

    }
}
