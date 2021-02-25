public class Player
{
  private int rollsRemain;
  private final Dice[] dices;
  private final Sheet sheet;
  private int[] rowsUsed;

  public Player(){
    sheet = new Sheet();
    dices = new Dice[5];
    for (int i = 0; i < 5; i++)
    {
      dices[i] = new Dice();
    }
    rollsRemain= 2;
    rowsUsed = new int[15];
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
      System.out.println("you have used all your rolls use command 'wd' to write it down to table");
    }

  }

  public boolean haveYathzee(){
    return dices[0].getValue() == dices[1].getValue() &&
        dices[1].getValue() == dices[2].getValue() &&
        dices[2].getValue() == dices[3].getValue() &&
        dices[3].getValue() == dices[4].getValue() &&
        dices[4].getValue() == dices[5].getValue();
  }

  public boolean fillRow(int index){
    if (index>13 || index<0){
      System.out.println("no row like that exist");
      return false;
    }
    if (rowsUsed[index] == 1){
      System.out.println("You have already filled out this row, please type 'rr' to re-roll or 'wd' to write it to another row");
      return false;
    }
    rowsUsed[index]++;
    int[] numbersOnDices = new int[5];
    for (int i= 0;i<5;i++)
    {
      numbersOnDices[i] = dices[i].getValue();
    }
    System.out.println(index+":"+numbersOnDices[0]+" "+numbersOnDices[1]+" "+numbersOnDices[2]+" "+numbersOnDices[3]+" "+numbersOnDices[4]);
    sheet.setScore(index,numbersOnDices);
    return true;
  }

  public int getTotalScore(){
    return sheet.getTotalScore();
  }
}
