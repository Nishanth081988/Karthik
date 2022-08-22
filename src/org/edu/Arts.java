package org.edu;

public class Arts extends Education {
	public void bSc() {
		System.out.println("B.sc....");
	}
	public void bEd() {
		System.out.println("B.Ed....");
	}
	public void bA() {
		System.out.println("B.A....");
	}
	public void bBA() {
		System.out.println("BBA....");
	}
	@Override
	public void ug() {
		System.out.println("not UG...");;
	}
	public void pg() {
		System.out.println("PG...");
	}
	
	public static void main(String[] args) {
		Arts a = new Arts();
		a.bSc();
		a.bEd();
		a.bA();
		a.bBA();
		a.ug();
		a.pg();
	}
}
