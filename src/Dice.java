import java.util.Random;

public class Dice
{
  private int value;

  public Dice(){
    value = 0;
  }

  public void roll(){
    value = new Random().nextInt(6) + 1;
  }

  public int getValue()
  {
    return value;
  }
}
