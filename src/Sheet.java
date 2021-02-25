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
    score[rowIndex] = calculateScore(rowIndex, diceNumbers);
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
        return diceSum(1, diceNum);
      case 1:
        return diceSum(2, diceNum);
      case 2:
        return diceSum(3, diceNum);
      case 3:
        return diceSum(4, diceNum);
      case 4:
        return diceSum(5, diceNum);
      case 5:
        return diceSum(6, diceNum);
      case 6:
        return 35;
      case 7:
      case 8:
      case 13:
        return diceSumAll(diceNum);

      case 9:
        return 25;
      case 10:
        return 30;
      case 11:
        return 40;
      case 12:
        return 50;
      case 14:
        return 100;
    }
    return 0;
  }
  public void addYahtzeeBonus()
  {
    score[14] += 100;
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

  public int diceSumAll(int[] diceNum)
  {
    int sum = 0;
    for( int i = 0; i < diceNum.length; i++ )
    {
        sum+= diceNum[i];
    }
    return sum;
  }

  public int countDice(int diceNumber, int[] diceNum)
  {
    int sum = 0;

    for( int i = 0; i < diceNum.length; i++ )
    {
      switch(diceNumber)
      {
        case 1:
          if(diceNum[i] == 1) sum++;
          break;
        case 2:
          if(diceNum[i] == 2) sum++;
          break;
        case 3:
          if(diceNum[i] == 3) sum++;
          break;
        case 4:
          if(diceNum[i] == 4) sum++;
          break;
        case 5:
          if(diceNum[i] == 5) sum++;
          break;
        case 6:
          if(diceNum[i] == 6) sum++;
          break;
      }
    }
    return sum;
  }
}
