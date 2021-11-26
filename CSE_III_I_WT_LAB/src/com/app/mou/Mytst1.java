package com.app.mou;

public class Mytst1 {

	public static int add(int a,int b){
		if(a>2){
			if(b>2){
				return a+b+add(a+1,b-5);
			}
		}
		
		return a-b;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=add(4,6);
		System.out.println(c);
		
		
	}

}
