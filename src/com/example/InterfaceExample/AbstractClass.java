package com.example.InterfaceExample;

public abstract class AbstractClass {
	public AbstractClass() {
		System.out.println("inside abstract constructor");
	}
	void print() {
		System.out.println("insise print() in abstractclass");
	}
	public abstract void display();
	public final void show() {
		System.out.println("Insise show()");
	}
	public static void main(String[] args) {
		AbstractChildClass ab=new AbstractChildClass();
		ab.display();
		ab.display();
		ab.show();
		result();
	}
}
