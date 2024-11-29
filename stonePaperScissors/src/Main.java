import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter r for rock, p for paper, s for scissors");

        boolean gameOn=true;

        while (gameOn){
            String userInput= input.nextLine().toUpperCase(Locale.ROOT);
            String comp=computerChoice();
            int result=computerWins(userInput,comp);
            if(result==2){
                System.out.printf("Computer chose %s, Computer wins\n",comp);
                gameOn=false;
            }else if(result==3){
                System.out.printf("Computer chose %s, Player wins\n",comp);
                gameOn=false;
            } else if (result==-1) {
                System.out.println("Invalid input");
            }else {
                System.out.printf("Computer chose %s, Draw, try again\n",comp);
            }
        }


    }

    public static String computerChoice(){
        String[] options = {"Rock","Paper","Scissors"};
        Random random = new Random();
        int index = random.nextInt(options.length);
        return options[index];
    }

    public static int computerWins(String playerChoice,String computerChoice){
        if(playerChoice.charAt(0)==computerChoice.charAt(0)){
            return 1;
        }else if(playerChoice.equals("R")){
            if(computerChoice.equals("Paper")){
                return 2;
            }else{
                return 3;
            }
        }else if(playerChoice.equals("P")){
            if(computerChoice.equals("Scissors")){
                return 2;
            }else{
                return 3;
            }
        }else if(playerChoice.equals("S")){
            if(computerChoice.equals("Rock")){
                return 2;
            }else{
                return 3;
            }
        }
        return -1;
    }
}
