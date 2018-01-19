import java.util.Scanner;
public class if_statement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //System.out.println("What is your overall grade percentage?");
        //int grade = input.nextInt();
        /*if (grade > 60){
            System.out.println("Admitted!");
        }
        else if(grade > 40) {
            System.out.println("You have been wait listed!");
        }
        else {
            System.out.println("Please apply again!");
        }*/

        System.out.println("Does player one, rock, paper or scissors?");
        String playerOne = input.next();
        System.out.println("Does player two, rock, paper or scissors?");
        String playerTwo = input.next();

        if ((playerOne.equals("rock") && playerTwo.equals("scissors")) || (playerOne.equals("scissors")&& playerTwo.equals("paper"))
                || (playerOne.equals("paper")&& playerTwo.equals("rock"))){
            System.out.println("player one wins!");
        }
        else if((playerOne.equals("rock") && playerTwo.equals("paper")) || (playerOne.equals("scissors")&& playerTwo.equals("rock"))
                || (playerOne.equals("paper")&& playerTwo.equals("scissors"))) {
            System.out.println("player two wins!");
        }
        else {
            System.out.println("tie!");
        }

        /*if (playerOne.equals("rock")){
            if (playerTwo.equals("scissors")){
                System.out.println("player one wins!");
            } else if (playerTwo.equals("paper")){
                System.out.println("player two wins!");
            }
            else {
                System.out.println("tie!");
            }
        }
        else if(playerOne.equals("scissors")){
            if (playerTwo.equals("scissors")){
                System.out.println("tie!");
            } else if (playerTwo.equals("rock")){
                System.out.println("player two wins!");
            }
            else {
                System.out.println("palyer one wins!");
            }
        }
        else {
            if (playerTwo.equals("scissors")){
                System.out.println("player two wins!");
            } else if (playerTwo.equals("paper")){
                System.out.println("tie!");
            }
            else {
                System.out.println("player one wins!");
            }
        }*/

        //loops
        for(int i = 1; i <= 4; i++){
            System.out.println(i+ " squared = "+(i*i));
        }
        System.out.println("Loop finished!");

        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
        }*/
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < 4; i++) {
            for(int j=4; j>i; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("*----*----*----*");
        for (int i = 0; i < 4; i++){
            System.out.println("|    |    |    |");
            System.out.println("*----*----*----*");
        }


    }
}
