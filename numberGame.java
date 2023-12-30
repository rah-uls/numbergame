import java.util.Scanner;
public class numberGame {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int chance=10;
        int finals=0;
        boolean playAgain=true;
        System.out.println("::DEAR USER YOU HAVE ONLY  " +chance+ "  CHANCES TO COMPLETE THE GAME::");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chance;i++){
                System.out.println("::CHANCE  "+(i+1)+"  ENTER YOUR GEUSS THE NUMBER::");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("YEAH! YOU WON THE MATCH");
                    break;
                }
                else if(user>rand){
                    System.out.println("TOO HIGH");
                }
                else{
                    System.out.println("TOO LOW");
                }
            }
            if(guess==false){
                System.out.println("::OOPS! YOU LOST THE ALL GAME::");
            }
                System.out.println("::YOUR SCORE::  "+(finals+1));
                System.out.println("DO YOU WANT TO PLAYAGAIN THE GAME-> (y/n)");
                String pA=sc.next();
                playAgain=pA.equalsIgnoreCase("y");
        } 
    }
    public static int getrandN(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
}
