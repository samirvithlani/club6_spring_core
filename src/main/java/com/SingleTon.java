package com;

public class SingleTon {

	static SingleTon sinngleTon = null;

	public static SingleTon getInstance() {

		if (sinngleTon == null) {
			sinngleTon = new SingleTon();
		}

		return sinngleTon;

	}

	public static void main(String[] args) {

//		SingleTon s1 = new SingleTon();
//		SingleTon s2 = new SingleTon();
//		SingleTon s3 = new SingleTon();
//	

		SingleTon s1 = getInstance();
		SingleTon s2 = getInstance();
		SingleTon s3 = getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}
