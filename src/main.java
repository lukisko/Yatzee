import java.util.Scanner;

public class main
{
  public static void main(String[] args)
  {
    Player p1 = new Player();
    Scanner in = new Scanner(System.in);
    System.out.println("Hi, let's play a game!");
    //System.out.println("type nr to roll");
    System.out.println("type rr to re-roll");
    System.out.println("type wd to write down to some row and to roll");

    p1.roll();
    Dice[] dices = p1.getDices();
    for (int i = 0; i < 5; i++)
    {
      System.out.println("cube #"+i+ " : "+ dices[i].getValue());
    }

    while (true){
      String input = in.nextLine();
        if (input.equals("rr")){
        System.out.println("type how many dices you want to re-roll and than the indexes divided by space: ");
        int number = in.nextInt();
        int[] toReroll = new int[number];
        for (int j = 0; j < number; j++)
        {
          toReroll[j] = in.nextInt();
        }
        p1.reRoll(toReroll);
        dices = p1.getDices();
        for (int i = 0; i < 5; i++)
        {
          System.out.println("cube #"+i+ " : "+ dices[i].getValue());
        }
      } else if (input.equals("wd")){
          System.out.println("1: 1\n" + "2: 2\n" + "3: 3\n" + "4: 4\n"
              + "5: 5\n" + "6: 6\n"
              + "7: 3 of the kind\n" + "8: 4 of the kind\n" + "9: full house\n"
              + "10: low straight\n" + "11: high straight\n" + "12: yatzee\n"
              + "13: chance\n");
          System.out.println("to what row do you want to write it down?");
          int row = in.nextInt();
          if(row<6){
            row++;
          }
          if (p1.fillRow(row))
          {
            p1.roll();
            dices = p1.getDices();
            System.out.println("next round");
            for (int i = 0; i < 5; i++)
            {
              System.out.println("cube #" + i + " : " + dices[i].getValue());
            }
          }
        } else if (input.equals("end")){
          System.out.println(p1.getTotalScore());
          break;
        }
    }
  }
}
