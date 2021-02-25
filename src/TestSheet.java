public class TestSheet
{
  public static void main(String[] args)
  {
    Sheet sheet = new Sheet();
    sheet.setScore(0, new int[] {1, 1, 1, 1, 2});
    System.out.println(sheet.getTotalScore());
  }
}
