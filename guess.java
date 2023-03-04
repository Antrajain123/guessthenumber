import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Game
{
    int num;
    public Game()
    {
        Random rand = new Random();
        num = rand.nextInt(100);
        System.out.println("Guess the number between 1 to 100");
    }
    public int computerNo()
    {
        return num;
    }
}
public class guess
{
    static int input()
    {
        int user;
        System.out.println("enter no:");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user; 
    }
    static void correctnumber(int i , int j)
    {
        if(i==j)
        {
            System.out.println("Correct number guess");
        }
        else if(i>j)
        {
            System.out.println("your number is greater than system number");
        }
        else 
        {
            System.out.println("your number is smaller than computer number");
        }
    }
    public static void main(String[] args)
    {
        int user=0,num=0,itteration=0;
        Game g = new Game();
        do{
            user = input();
            num = g.computerNo();
            correctnumber(user,num);
            itteration++;
        }
        while(user != num);
        System.out.println("you guess number in "+itteration +"itteration");
        
    }
}    

