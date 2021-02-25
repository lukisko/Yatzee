import java.util.Arrays;

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
    if(upperTotalBonus())
    {
      score[6] = 35;
    }
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

  public Boolean upperTotalBonus()
  {
    int sum = 0;

    for( int i = 0; i < 5 ; i++ )
    {
      sum+= score[i];
    }
    return (sum >= 63);
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
    int[] array = countDice(diceNum);
    boolean two = false;
    boolean three = false;
    Arrays.sort(diceNum);

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
        for(int i = 0; i < array.length; i++)
        {
          if(array[i] >= 3) return diceSumAll(diceNum);
        }
        return 0;
      case 8:
        for(int i = 0; i < array.length; i++)
        {
          if(array[i] >= 4) return diceSumAll(diceNum);
        }
        return 0;
      case 9:
        for(int i = 0; i < array.length; i++)
        {
          if(array[i] == 2) two = true;
          if(array[i] == 3) three = true;
        }
        if(two && three) return 25;
        return 0;
      case 10:
        return 30;
      case 11:
        return 40;
      case 12:
        return 50;
      case 13:
        return diceSumAll(diceNum);
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

  public int[] countDice(int[] diceNum)
  {
    int[] sum = new int[6];

    for( int i = 0; i < diceNum.length; i++ )
    {
      switch(diceNum[i])
      {
        case 1:
          sum[0]++;
          break;
        case 2:
          sum[1]++;
          break;
        case 3:
          sum[2]++;
          break;
        case 4:
          sum[3]++;
          break;
        case 5:
          sum[4]++;
          break;
        case 6:
          sum[5]++;
          break;
      }
    }
    return sum;
  }
}
