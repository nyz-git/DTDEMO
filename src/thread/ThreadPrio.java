package com.nyz.thread;

public class ThreadPrio extends Thread {

	public void run(){ 
		String name = Thread.currentThread().getName();
		   System.out.println("Thread name is:"+Thread.currentThread().getName());  
		   System.out.println("Thread priority of "+ name+ ":  "+Thread.currentThread().getPriority());  
		  
		  }  
		 public static void main(String args[]){  
			 ThreadPrio m1=new ThreadPrio();  
			 ThreadPrio m2=new ThreadPrio(); 
			 ThreadPrio m3=new ThreadPrio(); 
		  
		  m1.setPriority(MIN_PRIORITY);  
		  m1.start();  
		 
		  m2.setPriority(MAX_PRIORITY);  
		  m2.start();
		  
		  m3.setPriority(NORM_PRIORITY);  
		  m3.start();
		   
		  
		 }  
		}     
