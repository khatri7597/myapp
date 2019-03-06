package com.myapp.myapp;

import java.io.FileNotFoundException;
import java.io.IOException;

class GenException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GenException(String s) {
		super(s);
	}
}

public class MyException {
	
	@SuppressWarnings("finally")
	public static int check() {
		try {
			return 0;
		}finally {
			return 1;
		} 
	}

	public static void main(String[] args) {
		System.out.println(check());
	}
	
}
