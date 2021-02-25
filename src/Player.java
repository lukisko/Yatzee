public class Player
{
  private int rollsRemain;
  private Dice[] dices;
  private Sheet sheet;
  private int[] rowsUsed;

  public Player(){
    sheet = new Sheet();
    dices = new Dice[5];
    for (int i = 0; i < 5; i++)
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
    if(haveYathzee()){
      sheet.addYahtzeeBonus();
    }
    return dices;
  }

  public void reRoll(int[] indexes){
    if(rollsRemain>0){
      for (int i:
          indexes)
      {
        dices[i].roll();
      }
      rollsRemain--;
    } else {
      System.out.println("you have used all your rolls");
    }

  }

  public boolean haveYathzee(){
    return dices[0].getValue() == dices[1].getValue() &&
        dices[1].getValue() == dices[2].getValue() &&
        dices[2].getValue() == dices[3].getValue() &&
        dices[3].getValue() == dices[4].getValue() &&
        dices[4].getValue() == dices[5].getValue();
  }

  //TODO fill row
}
