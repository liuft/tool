package com.lft.secretgarden.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class IOutils {
	public static void main(String[] args){
		
		topdata();
	}
	public static void testBufferStream(){
		BufferedInputStream bsi = null;
		BufferedOutputStream bso = null;
		
		byte[] b = new byte[1024];
		try {
			bsi = new BufferedInputStream(new FileInputStream("/users/liufeitian/Documents/sun.3gpp"));
			bso = new BufferedOutputStream(new FileOutputStream("/opt/sun.3gpp"));
			int temp = 0;
			while( (temp = bsi.read(b)) != -1){
				System.out.println(temp);
				bso.write(b, 0, temp);
			}
			bso.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void topdata(){
		BufferedReader bsi = null;
		BufferedWriter bso = null;
		
		try {
			bsi = new BufferedReader(new FileReader(new File("/Users/liufeitian/lvzheng_pc.monitor.log.2016-09-13")));
			bso = new BufferedWriter(new FileWriter(new File("/opt/mdetail-13")));
			String str = "";
			
			while( (str = bsi.readLine()) != null){
				if(str.contains("request\":\"www.lvzheng.com/commondetail/detail/")){
					bso.write(str);
					bso.write("\n");
				}
				//bso.write(b, 0, temp);
			}
			bso.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static  void clearnglog(){
		System.out.println("it begin clear log "+new Date().getTime());
		BufferedReader bsi = null;
		BufferedWriter bso = null;
		//byte[] b = new byte[1024];
		try {
			bsi = new BufferedReader(new FileReader(new File("/opt/access.log")));
			bso = new BufferedWriter(new FileWriter(new File("/opt/newlog.log")));
			String str = "";
			
			while( (str = bsi.readLine()) != null){
				if(str.contains(" 403 ")){
					
				}else{
					bso.write(str);
					bso.write("\n");
				}
				//bso.write(b, 0, temp);
			}
			bso.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("it end clear log "+new Date().getTime());
	}

}
