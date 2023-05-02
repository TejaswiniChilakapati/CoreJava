package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File("fileName");
        
		try{ 
			Scanner scanner=new Scanner(file);
			while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file " + file.getName() + " could not be found.");
            e.printStackTrace();
		 }
		
		
	}

}
