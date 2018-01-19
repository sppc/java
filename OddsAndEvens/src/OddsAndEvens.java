import java.util.Scanner;
import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game calls 'Odds and Evens'!");
        System.out.println("What's your name?");
        String name = input.next();
        System.out.println("Hi "+name+" which do you choose? (O)dds or (E)vens?");
        String letter = input.next();
        if (letter.equals("O")){
            System.out.println(name+" picked odds! The computer will be evens.");
        }
        else if (letter.equals("E")) {
            System.out.println(name+" picked evens! The computer will be odds.");
        }
        else {
            System.out.println("You only should pick O or E!");
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println("How much 'fingers' do you put out?");
        int userNumber = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        int sum = userNumber + computer;
        System.out.println("The computer plays "+sum+" 'fingers'.");
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println(userNumber+" + "+computer+" = "+sum);
        if(sum%2 == 0) {
            System.out.println(sum+" is ...odd!");
            if(letter.equals("O")){
                System.out.println("That means "+name+" wins! :)");
            }
            else {
                System.out.println("That means computer wins! :)");
            }
        }
        else {
            System.out.println(sum+" is ...even!");
            if(letter.equals("E")){
                System.out.println("That means "+name+" wins! :)");
            }
            else {
                System.out.println("That means computer wins! :)");
            }
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print("-");
            }
            System.out.println();
        }


    }
}
