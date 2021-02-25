import java.util.Scanner;

public class main
{
  public static void main(String[] args)
  {
    Player p1 = new Player();
    Scanner in = new Scanner(System.in);
    System.out.println("Hi, let's play a game!");
    System.out.println("type r to roll");
    System.out.println("type rr to re-roll");
    while (true){
      String input = in.nextLine();
      if (input.equals("r")){
        p1.roll();
        Dice[] dices = p1.getDices();
        for (int i = 0; i < 5; i++)
        {
          System.out.println("cube #"+i+ " : "+ dices[i].getValue());
        }
      } else if (input.equals("rr")){
        System.out.println("type how many dices you want to re-roll and than the indexes: ");
        int number = in.nextInt();
        int[] toReroll = new int[number];
        for (int j = 0; j < number; j++)
        {
          toReroll[j] = in.nextInt();
        }
        p1.reRoll(toReroll);
        Dice[] dices = p1.getDices();
        for (int i = 0; i < 5; i++)
        {
          System.out.println("cube #"+i+ " : "+ dices[i].getValue());
        }
      }
    }
  }
}
