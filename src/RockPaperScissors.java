import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner UserMove = new Scanner(System.in);
        String[] options = {"Rock", "Paper", "Scissors"};

        String UserChoice;
        String ComputerMove = options[new Random().nextInt(options.length)];

        System.out.println("Welcome to the Rock, Paper, Scissors game");

        while(true){
            System.out.println("Please select one of the following options(Rock, Paper, Scissors)");
            UserChoice = UserMove.nextLine();

            if(UserChoice.equals("Rock") || UserChoice.equals("Paper") || UserChoice.equals("Scissors")){
                break;
            }else{
                System.out.println(UserChoice + " is not a valid choice");
            }
        }

        if (UserChoice.equals(ComputerMove)) {
            System.out.println("You chose " + UserChoice);
            System.out.println("Computer chose " + ComputerMove);
            System.out.println("Its a tie");

        }else if(UserChoice.equals("Rock") && ComputerMove.equals("Paper")){
            System.out.println("You chose " + UserChoice);
            System.out.println("Computer chose " + ComputerMove);
            System.out.println("Computer wins");

        }else if(UserChoice.equals("Paper") && ComputerMove.equals("Rock")){
            System.out.println("You chose " + UserChoice);
            System.out.println("Computer chose " + ComputerMove);
            System.out.println("You win");

        }else if(UserChoice.equals("Rock") && ComputerMove.equals("Scissors")){
            System.out.println("You chose " + UserChoice);
            System.out.println("Computer chose " + ComputerMove);
            System.out.println("You win");

        }else if(UserChoice.equals("Scissors") && ComputerMove.equals("Rock")){
            System.out.println("You chose " + UserChoice);
            System.out.println("Computer chose " + ComputerMove);
            System.out.println("Computer Wins");

        }else if(UserChoice.equals("Paper") && ComputerMove.equals("Scissors")){
            System.out.println("You chose " + UserChoice);
            System.out.println("Computer chose " + ComputerMove);
            System.out.println("Computer Wins");

        }else{
            System.out.println("You chose " + UserChoice);
            System.out.println("Computer chose " + ComputerMove);
            System.out.println("You win");
        }
        UserMove.close();
    }
}
