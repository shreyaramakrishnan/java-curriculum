import java.util.*;

public class Baseball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        baseball(console);
    }
    /*
     * Write a static method named baseball that takes a Scanner representing the console
     * as a parameter and plays an interactive baseball scoring game with the user, returning 
     * an integer representing which team won the game.
     * 
     * Baseball is a sport where teams play a series of innings against each other. 
     * Each team scores a certain number of runs (points) in each inning. 
     * A baseball game ends when one of the following conditions is met:
     * 
     * After 9 innings are finished, if one team has more total runs than the other, 
     * the team with more runs wins.
     * 
     * After 9 innings are finished, if the teams are tied (if they have the 
     * same number of total runs), we keep playing one more full inning at a
     * time until the teams are not tied any more.
     * 
     * After any inning, if one team is ahead by 10 or more runs, the game is called 
     * and the team with more runs wins.
     * 
     * Your method should repeatedly prompt the user, once per inning, to enter the 
     * number of runs that each team scored during each inning. The user will type in 
     * the first team's runs for that inning, followed by the second team's runs for that 
     * inning, separated by whitespace. Your method should stop prompting once one or more 
     * of the above bulleted conditions are met, causing the game to end. At the end of 
     * the game, you should print the final score.
     * 
     * You may assume that the user enters valid non-negative integers whenever prompted,
     *  and you may assume that the game will eventually end (it won't go on forever).
     */
     public static void baseball(Scanner scan) {
        System.out.println("This is an interactive baseball game. Enter two numbers that represent how much team 1, and team two have scored in the first inning. Please write each Team 1 and Team 2 seperated with a space.");
        int total = 0;
        int total2 = 0;
        int innings = 0;
        while  (innings < 9 && total <= 10 && total2 <= 10) {
            innings = innings + 1;
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            total = num1 + total;
            total2 = num2 + total2;
            System.out.println("Team one has; " + total + " points" + " and Team two has; " + total2 + " points." + " We are on inning " + innings);
            System.out.println("Please enter another set of two numbers seperated with a space.");
            // num1 = scan.nextInt();
            // num2 = scan.nextInt();
        }
         
        if (total == total2) { 
            System.out.println("The game has ended in a tie. We'll play one more round until the teams are not tied anymore.");
            while  (total == total2) {
            innings = innings + 1;
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            total = num1 + total;
            total2 = num2 + total2;
            System.out.println("We are still at a tie. Team one has; " + total + " points" + " and Team two has; " + total2 + " points." + " We are on inning " + innings);
            System.out.println("Please enter another set of two numbers seperated with a space.");
    
        }
     } else if (total > total2) {
        System.out.println("The game is now over, the team that won was Team One, with " + total + " runs.");
     } else {
        System.out.println("The game is now over. The team that won was Team Two was " + total2 + " runs.");
     }


    }
}
// first ask user to enter number or runs scored during each innings ; sepereated by a space
     // variable outside for innings 
     // while !team 1 or team 2 > 10 || innings = 9 
     // innings = innigs + 1 
     // print how much the teams are at as of now 
     // ask the user to input the two teams runs scored again 
     // at the end of while loop; print out the total amount for both teams 
     // if tie, ask user again and continue to loop until not ended in a tie