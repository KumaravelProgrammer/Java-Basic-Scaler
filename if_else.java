import java.util.Scanner;


class Main {
  
  public static void main(String args[]) {
    
    int questions = 4;
    
    if(questions>3) {
      
      System.out.println("Great job !!! ");
      
    } if(questions>1) {
      
      System.out.println("Keep Doing Well ");
 
      
    }
  
      else {
        System.out.println("Work Hard");
      }
      
      // Live Assignments 
      //  Given A and B , find the Largest Number
    
     int num1 = 30;
     int num2 = 20;
     
     if(num1>num2) {
       System.out.println("First Number is Greater ");
     }
     else {
       System.out.println("Second Number is Graeter");
     }
    
   // Another Method 
   
    Scanner input = new Scanner(System.in);
    
    int  a = input.nextInt();
    int  b = input.nextInt();

    // if else condition 
    
    if(a>b) {
      System.out.println( a + " is Greater Number"); 
    }
      else {
        System.out.println(b + " is Greater Number");
      }
      
      
      // Given a number check it is Even number
      
      if(a%2==0) {
        System.out.println(" Even Number");
        
      } else {
        System.out.println("It is A Odd Number");
      }
      
       // Number is Divisible by 7
       
       if(a%7==0) {
        System.out.println(" Divisible By 7");
        
       } else 
       {
        System.out.println("Number is Not Divisible by 7 ");
      }
      
      // Last Digits Divisible by 4
      
      if(a%10==4) {
        System.out.println("Last Digit is Divisible by 4");
      }
      else {
        
        System.out.println("Last Digit is Not Divisible by 4");
        
      }
      
      
  }
  
  
}



