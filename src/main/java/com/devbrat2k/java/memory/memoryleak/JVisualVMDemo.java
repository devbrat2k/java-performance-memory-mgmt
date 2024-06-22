package com.devbrat2k.java.memory.memoryleak;

public class JVisualVMDemo {
	public static void main(String[] args) {
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			System.out.println("Exception");
		}
	}
}
