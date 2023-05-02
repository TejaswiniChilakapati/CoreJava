package example.CustomException;

public class Main extends Exception {

	public static void main(String[] args) {
		try {
			
		      throw new CustomException("This is a custom exception.");
		    } catch (CustomException e) {
		      System.out.print(e.getMessage());
		    }
		}

	}


