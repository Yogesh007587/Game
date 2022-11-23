package com.company;
import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor_game {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select:-\n0:-\tFor Rock\n1:-\tFor Paper\n2:-\tFor Scissors");
        for(int i=0;i<=5;i++){
        System.out.print("Enter your choice:- ");
        int c = sc.nextInt();


        System.out.println("Let the computer make it's choice");
        int cc = ran.nextInt(3);
        System.out.println(cc);


            if (c == cc) {
                System.out.println("Tie.!");
            } else if (c == 0 && cc == 1) {
                System.out.println("Computer won the match.");
            } else if (c == 0 && cc == 2) {
                System.out.println("Hurrah.! You won the match.");
            } else if (c == 1 && cc == 0) {
                System.out.println("Hurrah.! You won the match.");
            } else if (c == 1 && cc == 2) {
                System.out.println("Computer won the match.");
            } else if (c == 2 && cc == 0) {
                System.out.println("Computer won the match.");
            } else if (c == 2 && cc == 1) {
                System.out.println("Hurrah.! You won the match.");
            }
        }
    }
}

