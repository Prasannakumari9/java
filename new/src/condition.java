import java.util.Scanner;

public class condition {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		
		if(age<18)
		{
			System.out.println("You are still a minor,Please grow up and then think of marriage");
		}
		else if(age>65)
		{
			System.out.println("you are a senior citizen.Stop expecting too much");
		}
		else {
			System.out.println("Your are perfect groom/bride");
		}
	}
}
		


