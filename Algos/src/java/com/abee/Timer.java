package com.abee;

public class Timer {
	
	public static long t =0;
	public static void timer(){
		if(t == 0){
			t = System.currentTimeMillis();
		}else{
			System.out.println(System.currentTimeMillis() - t);
			t = 0;
		}
	}
}
