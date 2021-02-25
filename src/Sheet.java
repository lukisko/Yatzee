public class Sheet
{
  private int[] score;


  public Sheet()
  {
    this.score = new int[16];
  }

  public String getRow(int index)
  {
    return String.valueOf(score[index]);
  }

  public void setScore(int rowIndex, int[] diceNumbers)
  {

  }
  public int getTotalScore()
  {
    int sum = 0;
    for(int i = 0; i < score.length; i++)
    {
      sum += score[i];
    }
    return sum;
  }

  public String toString()
  {
    String s = "";

    for(int i = 0; i < score.length; i++)
    {
      s+= score[i] + "/n";
    }
    return s;
  }

  public int calculateScore(int rowIndex, int[] diceNum)
  {
    switch(rowIndex)
    {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:

    }
    return 0;
  }
  public void addYahtzeeBonus()
  {

  }

  public int diceSum(int diceNumber, int[] diceNum)
  {
    int sum = 0;
    for( int i = 0; i < diceNum.length; i++ )
    {
      if (diceNum[i] == diceNumber)
      {
        sum+= diceNum[i];
      }
    }
    return sum;
  }
}
