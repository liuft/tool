package com.lft.secretgarden.common;

import com.lft.secretgarden.link.LinkedVo;
import com.lft.secretgarden.link.SigleLinked;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestUtill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestUtill.minstack();
		//SigleLinked<UserVo> suv = new SigleLinked<UserVo>();
		
//		UserVo uv = new UserVo();
//		uv.setUserage(100);
//		uv.setUsername("lft");
//		//suv.insert(uv);
//
//		UserVo vv = new UserVo();
//		vv.setUserage(100);
//		vv.setUsername("lft");
//		String a = "ab";
//		String b = "a";
//		a = b;
//		b = "c";
//		System.out.println(a);
//
//		Map hashmap = new LinkedHashMap();
//		hashmap.entrySet().iterator();
//		Map conreentmap = new ConcurrentHashMap();
		//suv.insert(vv);
		
//		suv.removeLast();
//		System.out.println(suv.getLast().getUsername());
	}
	public static void minstack(){
		StackStick st = new StackStick();
		st.push(9);
		st.push(13);
		st.push(5);
		st.push(99);
		st.push(-1);

		System.out.println(st.min());
		st.pop();
		System.out.println(st.min());
	}

	/**
	 * 最大连续字串
	 */
	public static void maxarry(){
		int[] array = new int[6];
		array[0] = 120;
		array[1] = 10;
		array[2] = 20;
		array[3] = 1;
		array[4] = 100;
		array[5] = 34;

		int maxsum = 0;
		int masvalue = 0;

		for(int i=0,c=array.length;i<c;i++){
			if(array[i] > 0){
				maxsum+=array[i];
			}else if(array[i] < 0){
				if(maxsum > masvalue){
					masvalue = maxsum;
				}
				maxsum = 0;
			}

			if(maxsum > masvalue){
				masvalue = maxsum;
			}
		}
		System.out.println(masvalue);
	}

	/**
	 * 单向链表倒排
	 */
	public  static  void tranceLinkedlist(){
		List<LinkedVo> vlist = new ArrayList<LinkedVo>();
		LinkedVo a1 = new LinkedVo();
		LinkedVo a2 = new LinkedVo();
		LinkedVo a3 = new LinkedVo();
		a1.setName("liu");
		a1.setNext(a2);
		a2.setName("gao");
		a2.setNext(a3);
		a3.setName("yichen");

		vlist.add(a1);
		vlist.add(a2);
		vlist.add(a3);

		LinkedVo temp = new LinkedVo();
		LinkedVo begin = vlist.get(0);
		LinkedVo after = null;

		while (begin != null){
			temp = begin;
			begin = temp.getNext();
			temp.setNext(after);
			after = temp;
		}


	}

	
}
