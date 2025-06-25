import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;

public class Mario
{
    static Scanner input = new Scanner(System.in);  
   
    // This is main method don't fucking move it (This message is for me). 
    public static void main(String[] args)
    {
        openGame();        
    }

    static void game() 
    {
        System.out.println("Use w, a, s, d for move, Use spacebar for jump, Use q for exit.");

        JFrame frame = new JFrame("Click this window to give it focus");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(new Dimension(300, 100));
        frame.setVisible(true);

        frame.addKeyListener(new KeyListener() 
        {
            @Override
            public void keyPressed(KeyEvent e) 
            {
                char key = e.getKeyChar();
                switch (key) 
                {
                    case 'w': System.out.println("move up"); break;
                    case 'a': System.out.println("move left"); break;
                    case 's': System.out.println("move down"); break;
                    case 'd': System.out.println("move right"); break;
                    case ' ': System.out.println("jump"); break;
                    case 'q':
                        try 
                        {
                            closeGame();
                            System.exit(0);
                        } 
                        catch (InterruptedException ex) 
                        {
                            ex.printStackTrace();
                        }
                        break;
                    default: break;
                }
            }
            @Override public void keyReleased(KeyEvent e) {}
            @Override public void keyTyped(KeyEvent e) {}
        });

        frame.setFocusable(true);
        frame.requestFocusInWindow();

        // The while(true) loop is still needed to keep the app alive.
        while (true) 
        {
            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }   
    static void bringToGame() throws InterruptedException
    {
        long startTime = System.currentTimeMillis();  
        String baseText = "Loading game";
        String dot = "";    
 
        // This loop wait for 3 seconds. 
        while(System.currentTimeMillis() - startTime < 3000)
        {
            for(int i = 1 ; i <= 3 ; i++)
            {
                dot = ".".repeat(i);
                // "\r" is mean return cursor to start. 
                System.out.print("\r" + baseText + " " + dot + "   "); 
                // Delay for 0.5 seconds. 
                Thread.sleep(500);
            }
        }
        System.out. println(); 
        
        game(); 
    }
 
    static void closeGame() throws InterruptedException
    {
        long startTime = System.currentTimeMillis();  
        String baseText = "Stopping game";
        String dot = "";    
 
        // This loop wait for 3 seconds. 
        while(System.currentTimeMillis() - startTime < 3000)
        {
            for(int i = 1 ; i <= 3 ; i++)
            {
                dot = ".".repeat(i);
                // "\r" is mean return cursor to start. 
                System.out.print("\r" + baseText + " " + dot + "   "); 
                // Delay for 0.5 seconds. 
                Thread.sleep(500);
            }
        }
        // Move to new line after animations.
        System.out. println(); 
    } 
 
    static void startGame()
    {
        boolean checkInput = false; 
        do
        {
            System.out.printf("Start [Y/n] : ");
            String start = input.nextLine().trim().toLowerCase();
            if (start.equals("y"))
            {
                 try 
                {
                    bringToGame();
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
                checkInput = true; 
            }
            else if(start.equals("n"))
            {
                try 
                {
                    closeGame();
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
                checkInput = true;
            } 
            else 
            {
                System.out.println("Incorrect input. Please enter only 'y' or 'n'.");
            } 
        }while(!checkInput); 
    } 
     
    static void openGame()
    {
        System.out.printf("Hello!!!, Welcome to MarioDump game...\n");
        startGame(); 
    }  
}
// อยากเขียนเยอะกว่านี้ แต่พี่ต้องตรวจหลายคน ผมกลัววพี่ตรวจไม่ไหว
// กรุงโรมไม่ได้สร้างเสร็จในวันเดียว แต่ถ้าพี่บอกว่าพรุ่งนี้กรุงโรมต้องเสร็จ พรุ่งนี้กรุงโรมก็ต้องเสร็จ

