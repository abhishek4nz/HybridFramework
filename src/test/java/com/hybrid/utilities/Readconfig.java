package com.hybrid.utilities;

import com.hybrid.testCases.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig  {

    //CREATE A PROPERTIES OBJECT TO USE THE PROPERTIES FILE
    Properties property;

    //CREATE A CONSTRUCTOR TO READ AND LOAD THE DATA FROM THE PROPERTIES FILE
    public Readconfig() {

        //LOCATE THE PATH OF THE PROPERTIES FILE IN CONFIGURATION DIRECTORY
        File src= new File("./Configuration/config.properties");

        try{
            //READ THE PROPERTIES FILE FROM PATH
            FileInputStream fis = new FileInputStream(src);
            //INITIALIZE PROPERTY OBJECT
            property = new Properties();
            //LOAD THE PROPERTIES
            property.load(fis);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //CREATE METHODS TO FETCH EACH VARIABLE FROM PROPERTIES FILE
    public String getURL()  {
        //FETCH AND RETURN THE VALUE OF THE VARIABLE IN PROPERTIES FILE
        return property.getProperty("baseURL");
    }
    public String getUserName() {
        return property.getProperty("username");
    }
    public String getPassword() {
        return property.getProperty("password");
    }
}
