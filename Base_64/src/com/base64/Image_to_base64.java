package com.base64;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;

public class Image_to_base64 
{
	 public static void main(String[] args) throws Exception{
		 
		 // encoding

       //  File f =  new File("C:\\Users\\Dayal\\Desktop\\PS Screenshot\\crop signatuer.PNG");
       //  File store =  new File("C:\\Users\\Dayal\\Desktop\\PS Screenshot\\New folder\\crop signatuer.PNG");
        
         File f =  new File("C:\\Users\\Dayal\\Desktop\\PS Screenshot\\Copy of Mortgage Payments User Stories (003).xlsx");
         File store =  new File("C:\\Users\\Dayal\\Desktop\\PS Screenshot\\New folder\\Copy of Mortgage Payments User Stories (003).xlsx");
       
         
         
           String encodstring = encodeFileToBase64Binary(f);
           System.out.println(encodstring);
           
           decodeFileToBase64Binary(store, encodstring);
           
           
           //decode
           
     }
	 
	 

     private static String encodeFileToBase64Binary(File file) throws Exception{
          FileInputStream fileInputStreamReader = new FileInputStream(file);
          byte[] bytes = new byte[(int)file.length()];
          fileInputStreamReader.read(bytes);
          return new String(Base64.getEncoder().encodeToString(bytes));
      }
     
     private static void decodeFileToBase64Binary(File store,String img) throws Exception
     {
    	 FileOutputStream imageOutFile = new FileOutputStream(store) ;
    		    // Converting a Base64 String into Image byte array
    		    byte[] imageByteArray = Base64.getDecoder().decode(img);
    		    imageOutFile.write(imageByteArray);
}}
