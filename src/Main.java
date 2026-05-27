import java.util.Scanner;

public class Main {
    public static void printBoard(char[] board ) {

        System.out.println(board[0] + "|" + board[1] + "|" +board[2]); //board[] - first position in array
        System.out.println(board[3] + "|" + board[4] + "|" +board[5]);
        System.out.println(board[6] + "|" + board[7] + "|" +board[8]);

}
public static void main (String[] args){  //Where code runs
    Scanner input = new Scanner(System.in); // Allows the user to type input

    char[] board = {'1', '2', '3', '4', '5', '6' ,'7','8','9'}; //Used an array .Arrays are used to store multiple values in a single variable.
    char currentPlayer = 'X';
    boolean gameRunning = true;

    while (gameRunning) { // While loop keep running the game until I stop it
        printBoard(board); // method
        System.out.println("Player" + currentPlayer + "choose position (1-9):");
        int position = input.nextInt();

        //convert 1-9 to 0-8
        position = position -1;

        //place X or O
        if (board[position] != 'X' && board[position] != '0') {
            board[position] = currentPlayer;

            //Switch player
            if (currentPlayer == 'X'){
                currentPlayer = 'O';

            } else {
                currentPlayer = 'X';

            }

          } else {

                    System.out.println("Spot Taken!");
          }

       }

    }

}
