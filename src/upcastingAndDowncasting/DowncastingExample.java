package upcastingAndDowncasting;

public class DowncastingExample {

	public static void main(String[] args) {
		Animal animal=new Cat();
		animal.makeSound();

	
	if(animal instanceof Cat) {
		
		Cat cat=(Cat)animal;
		cat.scratch();
	}

}
}