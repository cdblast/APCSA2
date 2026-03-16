/**
 * Project 2.2.11
 *
 * GameRunner Class for the Game of Nim 
*/
import java.util.Scanner;

public class GameRunner
{
  public static void main(String[] args)
  {
      boolean playing = true;
      String response = null;
      Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the Game of Nim!");

    while (playing){
      Board.populate(); 
  
      Game nim = new Game(); 
      nim.play(); 
      
      playing = false;

      while (response == null){
        System.out.println("Do you want to play again? (Y/N) ");
        response = input.nextLine();
        System.out.println(response);

        if((response.equals("Y")) || response.equals("y")){
          playing = true;
        }
        else if((response.equals("N")) || response.equals("n")){
          playing = false;
        }
        else{
          System.out.println("Your response was invalid.");
          response = null;
        }
      
      }
      response = null;
    }

  }
}