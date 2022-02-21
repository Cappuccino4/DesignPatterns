import java.util.Random;
import java.util.Scanner;

/** 
     * Written by Austin Cappuccio
     */

public class MathGame {
    
    // Variables
    static MathGame mathGame;
    int score;
    Random rand;
    Scanner reader;
    String[] operands = {"+", "-", "*", "/"};

    /**
     * Constructor for the math game
     */
    MathGame() {
        rand = new Random();
        reader = new Scanner(System.in);
        score = 0;
        System.out.println("Lets have fun with math!");
    }

    
    /** 
     * Gets an instance of a game if it exists and if it doesnt, make a new one
     * @return MathGame returns an instance of the game
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    /**
     * The actual gameloop that is run for every round and will keep score
     */
    public void play() {
        boolean run = true;
        while(run) {
            System.out.println("(P)lay or (Q)uit:");
            String userInput = reader.next();
            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!\nYour score was " + score);
                run = false; 
            } else if (userInput.equalsIgnoreCase("p")) {
                if(playRound()) {
                    score++;
                }
            } else {
                System.out.println("Please enter either a P or a Q");
            }
        }
    }

    
    /** 
     * The math game itself
     * @return boolean Weather or not the user got the answer right
     */
    public boolean playRound() {
        int numOne = rand.nextInt(100) + 1;
        int numTwo = rand.nextInt(100) + 1;
        int pickOperand = rand.nextInt(4);
        System.out.println(numOne + " " + operands[pickOperand] + " " + numTwo + " = ?");
        double userIn = reader.nextDouble();
        double answer = getAnswer(numOne, numTwo, pickOperand);
        if (userIn == answer) {
            System.out.println("Good Job!");
            return true;
        } else {
            System.out.println("Sorry the answer was " + answer);
            return false;
        }
    }

    
    /** 
     * Supplement class that does the math for the numbers selected
     * @param numOne First number   
     * @param numTwo Second number selected
     * @param pickOperand The index for what operand to use 
     * @return double the answer for the question
     */
    double getAnswer(int numOne, int numTwo, int pickOperand) {
        if (pickOperand == 0) {
            return numOne + numTwo;
        } else if (pickOperand == 1) {
            return numOne - numTwo;
        } else if (pickOperand == 2) {
            return numOne * numTwo;
        } else {
            return numOne / numTwo;
        }
    }
}