package javabasics;

public class RSthreading extends Thread {
	  public static void main(String[] args) {
	    RSthreading thread = new RSthreading();
	    thread.start();
	    System.out.println("This code is outside of the thread");
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }
	}
