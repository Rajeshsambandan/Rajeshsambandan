package javabasics;

	class lion {
		 void lion_Details() {
		  System.out.println("lion Details...");
		 }
		}

		class kid extends lion {
		 void kid_Details() {
		  System.out.println("kid Detail...");
		 }
		}

		 public class Inheritance {

		 public static void main(String args[]) {
		  kid k = new kid();
		  k.lion_Details();
		  k.kid_Details();
		 }
		}

