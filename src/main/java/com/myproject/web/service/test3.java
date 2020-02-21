package com.myproject.web.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test3 {
	
	
	 public static void main(String[] args) throws IOException {
		
		
		test3 t3 = new test3();
		
		t3.getData();
	 }
	 
	 private void getData() {
		 
		 String url  = "https://datalab.naver.com/keyword/realtimeList.naver";
		 int ranking = 1;
		 
		 try {
			 
			Document doc = Jsoup.connect(url).get();
			Elements els = doc.select(".ranking_list .ranking_item .item_title");
			
			for(Element el : els) {
				
				if( ranking < 11) System.out.println( ranking++ + " " + el.text());
					
			}
		
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
			
	}


}
