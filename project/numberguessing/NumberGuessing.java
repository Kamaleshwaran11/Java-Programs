package com.project.numberguessing;
import java.util.*;
public class NumberGuessing {
public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int systemnum = 1 + (int) (100 * Math.random());

    System.out.println("Welcome to the number guessing game");
    System.out.println("user will choose the number between 1 to 100");

    System.out.println("Number given by user:");
    int numberguess;

    while (true) {
        numberguess = sc.nextInt();

        if (systemnum == numberguess) {
            System.out.println("Congrats , you are guessed the right one !" + systemnum + "==" + numberguess);
            break;
        } else if (systemnum > numberguess) {
            System.out.println("Too lesser comparing system num so try again:");
        } else if (systemnum < numberguess) {
            System.out.println("Too higher comparing System num so try again");
        }
    }
    sc.close();
}

}

