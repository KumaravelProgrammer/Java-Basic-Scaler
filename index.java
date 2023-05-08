import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		
		 
		
		System.out.println("Hello");
		System.out.println("Hello World");
		
		// Integer Data Type
		
		int marks = 80;
		
		System.out.println("marks" + marks+1);
		System.out.println("marks" + (marks+1));
		System.out.println( marks + 1 + "marks" );
		
		int a =10;
		int b=a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		// Long Data Type  
		
		long distance = 124663662193233437L; // Long Should terminate with L 
		int dist = (int)distance; // Explicit Typecasting 
		System.out.println(distance);
		System.out.println(dist);
		
		short red = 212;
		short blue = 423;
		
		System.out.println(red);
		System.out.println(blue);
		
		byte age = 20;
        System.out.println(age);

      // Float and Double 
	  // By Default Java Treats Everything as Double 
	  
	  double price = 34.3636636373737;
	  
	  // Floating Points Should End with f
	   float cost = 32.92f;
	   cost = (float)price;
	   System.out.println(cost);


    // Char 
	
	  char letter = 'A'; //  Characters are written in Single Quotes 
	  System.out.println(letter);
	  System.out.println((int)letter);// converting char to int
      
	  int number = (int)letter; // Typecast  char to Integer
	  System.out.println(number);
	  
	  char ch = (char) 66 ;

      System.out.println(ch);
	  
	  
	  
	  char cha = (char) 97 ;

      System.out.println(cha);

      System.out.println((int)'a');

    //  char c = "F";
	 
	//  System.out.println(c);  
	
	// Add Chars 
	
	System.out.println('A'+'B'); // 131 Because of Addition 
	System.out.println("A"+"B");// AB Concatenation 
	
	// Boolean true or False 
	
	
	boolean x; // Creating a Variable
	x=true ; // Assigning a Variable 
	
	boolean y = false; // Initiasation (Creating + Assigning Value)
	
	System.out.println(x);
	System.out.println(y);

    // Arithmetic Operators 
	
	System.out.println(5+4);//9
	System.out.println(5-4); //1
	System.out.println(10/3); // 3 (int/int = Integer)
	System.out.println((float) 10/3 );
	System.out.println(10.0/3);

	
	System.out.println(17 % 3);
	
	// Build A Scanner 
	
	
	  Scanner sc = new Scanner(System.in); // Magical Line (remember) 
	
	// Use Scanner to Read input Data 
	

	int x1  = sc.nextInt();
	int x2  = sc.nextInt();

	System.out.println(x1+x2);
	
	long money = sc.nextLong();
	System.out.println("Money " + money);
	
	// String 
	
	String name = sc.nextLine();
	
    System.out.println("Hello " + name);
	
	
	
	
	


	}
	
}

