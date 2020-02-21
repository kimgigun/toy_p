package com.myproject.web.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class test {

	   public static void main(String[] args) { 

	      try{ 
	    	  
	         URL url = new URL("https://www.naver.com/"); 

	         HttpURLConnection con = (HttpURLConnection) url.openConnection(); 

	         //con.connect(); 

	         BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream())); 

	         String temp;
	         
	         int rank = 0;
	         
	         while((temp = br.readLine()) != null){
	        	 
	        	 if(temp.contains("class=\"ah_k\"") && rank < 20){
	        		 System.out.println(++rank + "위:" + temp.split(">")[1].split("<")[0]);
	        		 
	        	 }
	         }
	        	 
        	 con.disconnect();
        	 br.close();
        	 
	      }catch(Exception e) {
	    	  System.out.println("error");
	    	  System.out.println("에러");
	      }
	   }

}
