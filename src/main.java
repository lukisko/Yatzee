import java.util.Scanner;

public class main
{
  public static void main(String[] args)
  {
    Player p1 = new Player();
    Scanner in = new Scanner(System.in);
    System.out.println("Hi, let's play a game!");
    while (true){
      System.out.println("type r to roll");
      String input = in.nextLine();
      if (input.equals("r")){
        p1.roll();
        Dice[] dices = p1.getDices();
        for (int i = 0; i < 6; i++)
        {
          System.out.println("cube #"+i+ " : "+ dices[i].getValue());
        }
      }
    }
  }
}
