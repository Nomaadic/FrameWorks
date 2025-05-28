package com.AutomationFramework.Utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader
{
    // read data from data.properties

    public static String readKey(String key)
    {
        Properties p = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"src/main/resources/data.properties");
            p = new Properties();
            p.load(fileInputStream);
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return p.getProperty(key);
    }


}
