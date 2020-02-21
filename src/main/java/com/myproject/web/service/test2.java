package com.myproject.web.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class test2 {
	
	 public static void main(String[] args) throws IOException, InterruptedException {
	        
	       // URL url = new URL("http://javaking75.blog.me/rss");
	        URL url = new URL("https://datalab.naver.com/keyword/realtimeList.naver");
	        
	        // 문자열로 URL 표현
	        System.out.println("URL :" + url.toExternalForm());
	        
	        // HTTP Connection 구하기 
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        
	        // 요청 방식 설정 ( GET or POST or .. 별도로 설정하지않으면 GET 방식 )
	        conn.setRequestMethod("GET"); 
	        
	        // 연결 타임아웃 설정 
	        conn.setConnectTimeout(3000); // 3초 
	        // 읽기 타임아웃 설정 
	        conn.setReadTimeout(3000); // 3초 
	        
	        Thread.sleep(3000);
	        
	        // 요청 방식 구하기
	        System.out.println("getRequestMethod():" + conn.getRequestMethod());
	        // 응답 콘텐츠 유형 구하기
	        System.out.println("getContentType():" + conn.getContentType());
	        // 응답 코드 구하기
	        System.out.println("getResponseCode():"    + conn.getResponseCode());
	        // 응답 메시지 구하기
	        System.out.println("getResponseMessage():" + conn.getResponseMessage());
	        
	        
	        // 응답 헤더의 정보를 모두 출력
	        for (Map.Entry<String, List<String>> header : conn.getHeaderFields().entrySet()) {
	            for (String value : header.getValue()) {
	                System.out.println(header.getKey() + " : " + value);
	            }
	        }
	        
	        // 응답 내용(BODY) 구하기        
	        StringBuffer sb = new StringBuffer();
	        
	        try (
	        		InputStream in = conn.getInputStream();
	                ByteArrayOutputStream out = new ByteArrayOutputStream()) {
	            
	            byte[] buf = new byte[1024 * 8];
	            int length = 0;
	            while ((length = in.read(buf)) != -1) {
	                out.write(buf, 0, length);
	            }
	            
	            sb.append(new String(out.toByteArray(), "UTF-8"));
	           
	            //System.out.println(new String(out.toByteArray(), "UTF-8"));            
	        }
	        
//	        BufferedReader br = null;
//	        String d = "";
//	        
//	        try {
//				
//	        	br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//	        	
//	        	while((d = br.readLine())  != null) {
//	        		sb.append(d);
//	        		
//	        		if(d.contains("class=\"ah_k\"")){
//		        		 System.out.println( d.split(">")[1].split("<")[0]);
//		        		 
//		        	 }
//	        		
//	        	}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
	        
	        System.out.println(sb);
	        
//	        System.out.println(str);
//	        
//	        int rank = 0;
//	        
//	        while((temp = br.readLine()) != null){
//	        	 
//	        	 if(temp.contains("class=\"ah_k\"") && rank < 20){
//	        		 System.out.println(++rank + "위:" + temp.split(">")[1].split("<")[0]);
//	        		 
//	        	 }
//	         }
	        
	        // 접속 해제
	        conn.disconnect();
	    }


}
