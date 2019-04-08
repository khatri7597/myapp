package com.myapp.myapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestTest {
	public Integer count = 0;
	public Integer ecount = 0;
	public Integer ocount = 0;
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getEcount() {
		return ecount;
	}
	public void setEcount(Integer ecount) {
		this.ecount = ecount;
	}
	public Integer getOcount() {
		return ocount;
	}
	public void setOcount(Integer ocount) {
		this.ocount = ocount;
	}
	
}

public class ArraySum {
	
	

	public static void sumArray(int[] arr) {
		int count=0, ecount=0,ocount=0;
		for(int a : arr) {
			if(a%2 == 0)
				ecount += a;
			else
				ocount += a;
			count += a;
		}
		System.out.println(count);
		System.out.println(ecount);
		System.out.println(ocount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer count=0;
		Integer ecount=0;
		final Integer ocount=0;
		TestTest t = new TestTest();
		Integer[] ar = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list = Arrays.asList(ar);
		list.forEach(a ->{
			if(a%2 == 0)
				t.ecount += a;
			else
				t.ocount += a;
			t.count += a;
				
		});
		
		System.out.println(t.count);
		System.out.println(t.ecount);
		System.out.println(t.ocount);
		

	}

}
