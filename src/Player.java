public class Player
{
  private int rollsRemain;
  private Dice[] dices;
  //private int[] savedDices;

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
    if(dices[0].getValue() == dices[1].getValue() &&
        dices[1].getValue() == dices[2].getValue() &&
        dices[2].getValue() == dices[3].getValue() &&
        dices[3].getValue() == dices[4].getValue() &&
        dices[4].getValue() == dices[5].getValue()){
      //TODO
    }
  }

  public Dice[] getDices()
  {
    return dices;
  }

  public void reRoll(int[] indexes){
    for (int i:
         indexes)
    {
      dices[i].roll();
    }
  }
}
