package com.sai.standard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {

	int age;
	int sal;
	String name;

	public Employee(int age, int sal, String name) {
		this.age = age;
		this.sal = sal;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public int getSal() {
		return sal;
	}

	public String getName() {
		return name;
	}

}

public class SerExampleObj {

	public static void main(String[] args) throws Exception {
		Employee emp = new Employee(29, 1500, "sai");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("d://Employee.ser")));
		out.writeObject(emp);
		out.flush();
		out.close();

		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("d://Employee.ser"));
		Employee emp1 = (Employee) oin.readObject();
		System.out.println(emp1.getSal());
	}

}
