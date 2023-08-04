package com.sai;

public class GcExample {
	static GcExample s_new = new GcExample();
	static GcExample s_new1 = new GcExample();
	static GcExample s_new2 = new GcExample();
	static GcExample s_new3 = new GcExample();
	static GcExample s_new4 = new GcExample();
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		System.out.println(r.freeMemory());
		s_new =null;
		s_new1 =null;
		s_new2 = null;
		s_new3= null;
		s_new4 =null;
		r.gc();
		Thread.sleep(3000);
		System.out.println(r.freeMemory());
	}

	public void finalize() {
		System.out.println("finalize method called");
	}

}
