package JWD;
import java.util.Scanner;

public class HCT {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		char choice; 
		do { 
			   System.out.print("Enter Hardness: ");
		double H=s.nextDouble();
		System.out.print("Enter Carbon Content: ");
		double C=s.nextDouble();
		System.out.print("Enter Carbon Content: ");
		double T=s.nextDouble();
		boolean c1=(H>50),c2=(C<0.7),c3=(T>5600);
		int grade;
	
		if (c1&c2&c3) {
			grade=10;}
			else if(c1&c2) {
				grade=9;}
	else if(c2&c3) {
		grade=8;}
	else if(c1&c3) {
		grade=7;}
	else if (c1||c2||c3) {
		grade=6;}
	else{
			grade=5;
	   
		}
        System.out.println("Steel Grade: " + grade);
        System.out.println("Enter Y or y");
        
      
        choice = s.next().charAt(0);

        } while (choice == 'y' || choice == 'Y'); 

        System.out.println("Program Ended.");
        
		
		
		
		
		

	}

}
