package day3;

public class Person2 {
       private String name;
       private int age;
      
 public String getName() 
 {
     return name;
 }
 public int getAge() {
	 return age;
 }     
	public Person2 (String name,int age) {
		this.name=name;
		this.age=age;
	}
	public static void main(String [] args) {
		
		Person2 person=new Person2("Radhika",25);
		
		System.out.println("Name:"+person.getName());
		System.out.println("Age:"+person.getAge());

	}
	
}
