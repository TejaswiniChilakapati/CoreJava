package example.Interface;

@FunctionalInterface
 interface Sum {
	int add(int i,int j);
}

public class AdditionofIntegers {

	public static void main(String[] args) {
		Sum a=(i,j)->i+j;
		 
		 int i=a.add(10, 80);
		 System.out.println(i);

	}

}
