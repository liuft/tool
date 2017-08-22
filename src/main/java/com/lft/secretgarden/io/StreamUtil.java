package com.lft.secretgarden.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class StreamUtil {
	public static void main(String[] args){
		 new StreamUtil().testInputStream();
	}

	void testInputStream(){
		InputStream ist;
		try {
			ist = new FileInputStream(new File("/opt/sun.3gpp"));
			BufferedInputStream bis = new BufferedInputStream(ist);
			byte[] bb = new byte[1024];
			int i = 0;
			while(bis.read(bb) != -1){
				
				for(byte b : bb){
					System.out.print(b+"...");
				}
				System.out.println("");
				i++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
