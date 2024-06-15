package com.devbrat2k.java.memory;

public class PassByReferenceDemo {

	/**
	 * Please try to calculate the output before running and seeing the output.
	 * @param args
	 */
	public static void main(String... args) {
		PassByReferenceDemo main = new PassByReferenceDemo();
		main.start();
	}
	
	public void start() {
		String last = "Z";
		Container container = new Container();
		container.setInitial("C");
		another(container,last);
		System.out.print(container.getInitial());  // 3rd
	}
	
	public void another(Container initialHolder, String newInitial) {
		newInitial.toLowerCase();
		initialHolder.setInitial("B");
		Container initial2 = new Container();
		initialHolder=initial2;
		System.out.print(initialHolder.getInitial()); //1st
		System.out.print(newInitial);//2nd
	}
}
