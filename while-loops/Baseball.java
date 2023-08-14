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
}