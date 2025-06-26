import java.util.Scanner;

public class Marun{
    static Scanner input = new Scanner(System.in);
   
    // This is main method don't move it.
    public static void main(String[] args){
        System.out.print("How many times do you want Mario to walk? ---> ");
        int walkCount = input.nextInt();
       
        walk(walkCount);       
        jump();
        jump();
    }

    static void walk(int walkCount){
        for(int i = 0 ; i < walkCount ; i++){
            System.out.println("Mario walks forward");
        }
    }

    static void jump(){
        System.out.println("Mario jumps");
    }
}