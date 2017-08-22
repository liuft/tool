package com.lft.secretgarden.link;

import com.lft.secretgarden.common.UserVo;

public class SigleLinked<T> {
	private Linked nt = null;
	
	public void insert(Object t){
		Linked line = new Linked();
		line.setData(t);
		line.setNext(nt);
		nt = line;
		
	}
	public T getLast(){
		return (T) nt.getData();
	}
	public void removeLast(){
		if(nt != null){
			Linked nnt = (Linked) nt.next;
			nt = nnt;
		}
	}
	
	
	private class Linked<T>{
		private T data;
		private T next;
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public T getNext() {
			return next;
		}
		public void setNext(T next) {
			this.next = next;
		}
		
		
	}
}
