import java.util.Scanner;
class Handson1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>0) System.out.print("Positive");
		else if(n<0) System.out.print("Negative");
		else System.out.print("Zero");
	}
}
