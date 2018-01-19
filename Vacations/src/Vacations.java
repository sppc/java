import java.text.ParseException;
import java.util.Scanner;
import java.text.DateFormat;
import java.util.Date;
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
public class Vacations {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Vacation Planner!");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name + ", where are you travelling to?");
        String city = input.nextLine();
        System.out.println("Great! "+city + " sounds like a great trip");
        System.out.println("***********");
        System.out.println();
        System.out.println();
        System.out.println("How many days are you going to spend travelling?");
        int days= input.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip?");
        double money = input.nextDouble();
        System.out.println("What is the three letter currency symbol for your travel destination?");
        String currency = input.next();
        System.out.println("How many "+currency+" are there in 1 USD?");
        String money1 = input.next();
        double coin = Double.parseDouble(money1);
        int hours_day = days*24;
        int seconds = days*24*60;
        double d_money = (money/days)*100;
        int money2 = (int)d_money;
        double money3 = money2/100.0;
        double budget= coin*money;
        double budget_day = (coin*money/days)*100;
        int double1 = (int)budget_day;
        double double2 = double1/100.0;
        System.out.println("If you are travelling for "+days+" that is the same as " +hours_day+" hours or "+seconds+" minutes");
        System.out.println("If you are going to spend "+money+" USD that means per day you can spend up to "+money3+" USD");
        System.out.println("Your total budget in "+currency+" is "+budget+" "+currency+", wich per day is "+double2+" "+currency);
        System.out.println("***********");
        System.out.println();
        System.out.println();
        System.out.println("What is the time difference, in hours, between your home and your destination?");
        double hourString = input.nextDouble();
        // vamos converter para segundos primeiro, e arredondando um pouco para evitar alguns problemas esquisitos
        long s  = Math.round (hourString * 3600);
        // Agora vamos calcular horas, minutos e segundos
        long h = s / 3600;
        long m = (s - 3600 * h) / 60;
        //vamos converter para horas pm
        long hour = h%24;
        //vamos converter para horas am
        long hours = (12+h)%24;
        DecimalFormat dt = new DecimalFormat("00");
        System.out.println("That means that when it is midnight at home it will be "+hour+":"+dt.format(m)+" in your travel destination and" +
                " when it is noon at home it will be "+hours+":"+dt.format(m) );
        System.out.println("***********");
        System.out.println();
        System.out.println();
        System.out.println("What is the sqaure area of your destination country in km2?");
        double area = input.nextDouble();
        double miles = 0.386102*area*100;
        int distance = (int) miles;
        double dist = distance/100.0;
        System.out.println("In miles2 that is "+dist);

    }
}
