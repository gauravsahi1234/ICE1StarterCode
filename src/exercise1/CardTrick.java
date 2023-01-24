package exercise1;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        
        for (int i=0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(1+Math.random()*13));
            card.setSuit(Card.SUITS[(int)(0+Math.random()*3)]);
            hand[i]= card;
                    
            System.out.println(hand[i].getSuit()+" "+hand[i].getValue());
        }
        Scanner Sc=new Scanner(System.in);
        
        System.out.println("Enter card number");
        int value=Sc.nextInt();
        
        System.out.println("Enter suit");
        String suit=Sc.next();
        
         boolean flag=true;
        for(int i=0;i<hand.length;i++){
            if((value==hand[i].getValue()) && (suit.equalsIgnoreCase(hand[i].getSuit())))
            {
               printInfo();
               flag=false;
            }
            else
            {
                flag=true;
            }      
        }
        if(flag==true){
            System.out.println("Not matched");
        }
    }
    
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Gaurav, but you can call me ");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("Programmer");
        System.out.println("Manager of company");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Watching anime");
        System.out.println("Skating");
        System.out.println("Working out");
        System.out.println("Helping the ones who are in trouble");

        System.out.println();
    }
}