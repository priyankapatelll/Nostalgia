package org.example;

import java.util.Scanner;


public class MagicEightBall {
    //A classic Magic 8 Ball includes a 20-sided dice with 10 positive responses,
    //5 non-committal/vague responses, & 5 negative responses

    public static void main(String[] args) {
        //creating a new scanner object
        Scanner keyboard = new Scanner(System.in);

        //tell the user to ask a question
        System.out.println("");
        System.out.println("                                        .   .   .   .   .   ~*  Magic 8 Ball  *~   .   .   .   .   .  ");
        System.out.println("");
        System.out.println("                                                       ...has been waiting for you...              ");
        System.out.println("");
        System.out.println("                                        . . . ________ type in your (yes/no) question ________ . . .");
        System.out.println("");


        //user can type in question & hit enter
        String userQuestion = keyboard.nextLine();

        //as soon as "enter" is hit, it reads the user input & immediately prints a random response from below

        //generates random number between 0-20
        double number = Math.random();
        number = number * 20;
        int randomResponse = (int) number;

        //runs code in main, prints out the randomly decided fortune-telling response
        switch (randomResponse) {
            //positive responses
            case 1:
                System.out.println("Absolutely");
                break;
            case 2:
                System.out.println("Without a doubt");
                break;
            case 3:
                System.out.println("Yes");
                break;
            case 4:
                System.out.println("The ancestors told me, yes");
                break;
            case 5:
                System.out.println("Most likely");
                break;
            case 6:
                System.out.println("Hell yeah!");
                break;
            case 7:
                System.out.println("Fosho!");
                break;
            case 8:
                System.out.println("Definitely");
                break;
            case 9:
                System.out.println("Even a blind squirrel finds a nut eventually");
                break;
            case 10:
                System.out.println("Yes, break out the champagne!");
                break;

            //non-committal/vague responses
            case 11:
                System.out.println("Huh?");
                break;
            case 12:
                System.out.println("Got dizzy, shake later");
                break;
            case 13:
                System.out.println("Sure, maybe");
                break;
            case 14:
                System.out.println("Who cares?");
                break;
            case 15:
                System.out.println("How should I know?");
                break;

            //negative responses
            case 16:
                System.out.println("Forget about it!");
                break;
            case 17:
                System.out.println("The voices told me no");
                break;
            case 18:
                System.out.println("No");
                break;
            case 19:
                System.out.println("Nah, that's not a good idea");
                break;
            case 20:
                System.out.println("Very unlikely");
                break;
        }

    }

}

