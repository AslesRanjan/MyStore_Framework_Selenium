package com.mystore.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
   Properties properties;
   
   String path="C:\\Users\\ashis\\Downloads\\MyStores\\Configuration\\config.properties";
   
   public ReadConfig() 
   {
	   try 
	   {
	   properties =new Properties();
	   
		FileInputStream fis=new FileInputStream(path);
			properties.load(fis);
		}
		 catch (IOException e) 
	   {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
   public String getBaseUrl()
   {
	   String value=properties.getProperty("baseUrl");
	   if (value!=null)
	    return value;
	   else
		   throw new RuntimeException("Url Not Found");
	}
   public String getBrowser()
   {
	   String value=properties.getProperty("browser");
	   if (value!=null)
	    return value;
	   else
		   throw new RuntimeException("browser is incorrect");
	}
	   
   }
   

