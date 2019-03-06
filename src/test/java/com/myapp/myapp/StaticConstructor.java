package com.myapp.myapp;

interface I1
{
    default String getGreeting() {
        return "Good Morning!";
    }
}

interface I2
{
    default String getGreeting() {
        return "Good Afternoon!";
    }
}

public class StaticConstructor implements I1, I2 {
	
	public StaticConstructor() {
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		StaticConstructor s = new StaticConstructor();
		System.out.println(s.getGreeting());
	}

	@Override
	public String getGreeting() {
		return I2.super.getGreeting()+" "+I1.super.getGreeting();
	}

	

}
