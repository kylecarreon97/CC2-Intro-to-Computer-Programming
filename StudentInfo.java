import java.util.Scanner; 

public class StudentInfo
{ 
    public static void main(String[] args) 
    { 
 
        Scanner sc = new Scanner(System.in);
 
   	System.out.println("Enter your Name: ");
 	String name = sc.nextLine(); 
	System.out.println("Enter your Gender: ");
        char gender = sc.next().charAt(0);
	System.out.println("Enter your Age: "); 
        int age = sc.nextInt(); 
	System.out.println("Enter the Value of PI: "); 
        double PI = sc.nextDouble(); 
       
 	System.out.println("=========================");
        System.out.println("Name: " + name); 
	System.out.println("Age: " + age + " yrs. Old"); 
        System.out.println("Gender: " + gender); 
        System.out.println("Value of PI: " + PI); 
    } 
} 