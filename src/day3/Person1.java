package day3;

import java.util.Scanner;

public class Person1 {
        
	private String name;
	private int age;
	
   public String getName() {
		return name;
   }
   public void setName(String name) {
	   this.name=name;
   }
   public int getAge() {
	   return age;
   }
   public void setAge(int age) {
	   this.age=age;
   }
	public static void main(String[] args) {
		 
		Person1 person=new Person1();
		
		person.setName("Sarthak");
		person.setAge(20);
		
		System.out.println("Name:"+person.getName());
		System.out.println("Age:"+person.getAge());
	}

}
