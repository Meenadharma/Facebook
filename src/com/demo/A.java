package com.demo;

public class A {

	public static void main(String[] args) {
		
		System.out.println("Start");
		System.out.println("1");
		
		
		try {
			System.out.println(2/0);   
		
		} catch (NullPointerException e) {
			System.out.println("Not possible");
		}
		
		catch (Exception e) {
			System.out.println("Not Accepted");
		}
		
		finally {
			System.out.println("Print the value");
		}
		System.out.println(3);
		System.out.println("End");
		
			
		
	}
	
	
}
