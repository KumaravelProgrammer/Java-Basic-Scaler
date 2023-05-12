import java.util.Scanner;

class Main {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int marks = sc.nextInt();

    char grade ;
    
    if(marks>80) {
      grade = 'A';
    }
    else if (marks>60) {
      grade= 'B';
    }
    else if (marks>40) {
      grade='C';
    }
    
    else {
      grade='D';
    }
    
   System.out.println(" Grade is " + grade);
    

  }

}