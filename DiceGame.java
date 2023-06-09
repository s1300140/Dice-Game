import java.util.Random;
class DiceGame{
    public static void main(String[] args)
    {
	Random rand=new Random();
	System.out.println("Rolling dice...");
	int dice1 = rand.nextInt(6) + 1;
	int dice2 = rand.nextInt(6) + 1;
	System.out.println("Die 1: "+dice1);
	System.out.println("Die 2: "+dice2);
	int sum=dice1+dice2;
	System.out.println("Total value: "+sum);
    }
}
		
	
	
