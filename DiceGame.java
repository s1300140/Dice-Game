import java.util.Scanner;
import java.util.Random;
class DiceGame{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("What is your name?");
	String name=sc.nextLine();
	System.out.println("Hello, "+name+"!");
	Random rand=new Random();
	System.out.println("Rolling dice...");
	int dice1 = rand.nextInt(6) + 1;
	int dice2 = rand.nextInt(6) + 1;
	System.out.println("Die 1: "+dice1);
	System.out.println("Die 2: "+dice2);
	int sum=dice1+dice2;
	System.out.println("Total value: "+sum);
	if(sum>=7)
	    System.out.println(name+" won!");
	else
	    System.out.println(name+" loss");
    }
}
		
	
	
