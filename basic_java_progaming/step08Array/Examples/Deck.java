package basic_java_progaming.step08Array.Examples;

public class Deck {
    public static void main(String[] args){
        int[] deck=new int[52];
        String[] suits= {"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        for(int i=0;i<deck.length;i++){
            deck[i]=i;
        }
        for(int i=0;i<deck.length;i++){
            int index= (int)(Math.random()*(deck.length));
            deck[i]=index;
            
        }
        for(int i=0;i<=4;i++){
            String suit=suits[deck[i]/13];
            String rank=ranks[deck[i]%13];
            System.out.println("card number "+deck[i]+" : "+ rank +" of "+ suit );
        }
    }
    
}
