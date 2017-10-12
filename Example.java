package differentpackage;
//created another different package name as differentpackage
import java.io.IOException;
import different.ExampleDemo;
//this import statement will import the different package of different class
public class Example extends ExampleDemo{ //created main class which extends the subclass of different package
	
//created main  method 
	public static void main(String[] args)throws IOException {
		
		ExampleDemo Demo=new ExampleDemo();//taking an object
	
		Demo.display();
		
	//here it is accepting the object class 
	}


}
