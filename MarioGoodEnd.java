import java.util.Scanner;

public class MarioGoodEnd{
    static Scanner input = new Scanner(System.in);

    // This is main method don't move it.
    public static void main(String[] args){
        boolean princessSafe = false;
        int marioLives = 2;
        int bowserHP = 100;

        getGameSummary(marioLives, bowserHP, princessSafe); 
    }

    static void getGameSummary(int marioLives, int bowserHP, boolean princessSafe){
        System.out.println("+ GAME SUMMARY +");
        System.out.println("Mario Lives: " + marioLives);
        System.out.println("Bowser HP: " + bowserHP);
        System.out.println("Princess rescue = " + princessSafe);
    }
}