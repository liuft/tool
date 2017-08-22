package com.lft.secretgarden.hash;

public class HashUtils {
	public static void main(String[] args){
		
//		ObjectT objectT = new ObjectT();
//		objectT.setStrabc("hello world !");
//		ObjectT oc = objectT;
//		System.out.println(objectT.getStrabc());
//		oc.setStrabc("你好，世界！");
//		System.out.println(objectT.getStrabc());
//		System.out.println(objectT == oc);
//		ObjectT od = new ObjectT();
//		od.setStrabc("你好，世界！");
//		System.out.println(od.equals(oc));
		
		String abc = "abc";
		String str = "abc";
		String tt = new String("abc");

		tt.hashCode();

		System.out.println(abc == str);
		System.out.println(abc == tt);
		System.out.println(abc.equals(tt));
		
	}

	
}
class ObjectT{
	
	private   String strabc;

	public String getStrabc() {
		return strabc;
	}

	public void setStrabc(String strabc) {
		this.strabc = strabc;
	}
	
}