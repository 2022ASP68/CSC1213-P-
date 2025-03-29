import java.util.Scanner;
public class Hw01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int Num = sc.nextInt();
		
		if (Num%5==0 && Num%10==0)
		{
			System.out.println("Number is divisible by 5 and 10 numbers ");
		}else
		{
			System.out.println("Number is not divisible by 5 and 10 numbers");
		}
	}
}