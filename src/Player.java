public class Player
{
  private int rollsRemain;
  private Dice[] dices;
  private int[] savedDices;

  public Player(){
    dices = new Dice[6];
    for (int i = 0; i < 6; i++)
    {
      dices[i] = new Dice();
    }
    rollsRemain= 3;
  }

  public void roll(){
    for (Dice dix:
         dices)
    {
      dix.roll();
    }
  }

  public Dice[] getDices()
  {
    return dices;
  }
}
