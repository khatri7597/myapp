package com.myapp.myapp;

import java.io.FileNotFoundException;

public class ClassLoaderExample {
	public static void main(String[] args) {

		System.out.println("class loader for HashMap: " + java.util.HashMap.class.getClassLoader());
		System.out.println("class loader for DNSNameService: "
				+ sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
		System.out.println("class loader for this class: " + ClassLoaderExample.class.getClassLoader());

		System.out.println(CollectionImpl.class.getClassLoader());
		String str="knowledge";
		String s = str;
		
		str = str.concat("base");
		System.out.println(str);
		System.out.println(s);
		
		

	}
}