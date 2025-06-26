import java.util.Scanner;
import java.util.Random;

public class CallRunFire{
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    // This is main method don't fucking move it (Tell my self ><).
    public static void main(String[] args){
        int round = 1, bowserHP = 200, countOfFirework = 10;
        boolean princessSafe = false, firework = false; 

        // Below this line is start game.
        System.out.println("-----------Tutorial------------\n");
        System.out.println("You have 10 chances to shoot fireballs, " +  
        "and each shot you can shoot as many fireballs as you want, but the game will " + 
        "randomly decide whether you have firework or not that round. If you don't have " + 
        "firework, you will lose the fireball for free.\n");
        System.out.println("Help the princess\n");
        while(!princessSafe){
            System.out.printf("-----------ROUND %d-----------\n", round); 
            
            firework = random.nextBoolean();  

            int shootFireball = getShootFireBall(countOfFirework);

            do{
                if(shootFireball > countOfFirework){
                    System.out.println("You can shoot fireball more than you have.");
                    shootFireball = getShootFireBall(countOfFirework); 
                }
                else{
                    break;
                }
            } while(true);

            countOfFirework -= shootFireball; 
            if(countOfFirework <= 0){ 
                System.out.println("You loss!!"); 
                break; 
            }
            bowserHP = attack(bowserHP, firework, shootFireball); 
            
            if(bowserHP > 0){
                System.out.println("Bowser HP is " + bowserHP);
                System.out.println("Princess : Func ฉันหน่อย ช่วยฉันด้วย"); 
                System.out.printf("princessSafe = false\n");
                getLine(); 
            }
            else if(bowserHP <= 0){
                System.out.println("Bowser HP is 0");
                System.out.println("Princess is now safe. Thank you Mario!"); 
                System.out.printf("princessSafe = true\n");
                getLine();
                break; 
            }
            round++; 
        }
    }

    static int attack(int bowserHP, boolean firework, int shootFireball){
        if(firework){
            for(int i = 0 ; i < shootFireball ; i++){
                System.out.println("Mario shoots a fireball!");
            } 
            int damage = 50 * shootFireball;
            bowserHP -= damage; 
            return bowserHP; 
        }
        else{
            System.out.println("Mario can't shoot without a Fire Flower.");
            return bowserHP;
        } 
    }

    static int getShootFireBall(int countOfFirework){
        System.out.printf("How many fireball you want to shoot? (%d) ---> ", countOfFirework); 
        int shootFireball = input.nextInt(); 
        return shootFireball;
    }

    static void getLine(){
        System.out.println("-----------------------------");
    } 
}