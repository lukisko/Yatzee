public class Player
{
  private int rollsRemain;
  private Dice[] dices;

  public Player(){
    dices = new Dice[5];
    for (int i = 0; i < 6; i++)
    {
      dices[i] = new Dice();
    }
    rollsRemain= 3;
  }
}
