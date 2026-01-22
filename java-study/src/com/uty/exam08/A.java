package com.uty.exam08;

public class A {
	public void method1(final int arg) {
		final int var=1;
		
		class B {
			void method2() {
			
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
				
//				arg =3;
//				var =100;
			}
		}
		B b = new B();
		b.method2();
		
//		arg =3;
//		var =100;
	}
	 
	
}
