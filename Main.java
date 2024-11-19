import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
  }

  public static void printNTimes(String word, int N)
  {
    String word = "";
    int N;
    for (i = 0; i < word.length(); i++)
    {
      String L = word.substring(i. i+1);

      for (int repeatTimes = 0; repeatTimes < N; repeatTimes++)
      {
        System.out.print(L);
      }
    }
  }

  public static void printNums()
  {
    for (int currentNum = 10; currentNum > 0; currentNum--)
    {
      for (int numRepeat = 0; numRepeat < currentNum; numRepeat++)
      {
       System.out.print(currentNum + " ");
      }
    System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int row = 1; row <= N; row++)
    {
      for (int currentNum = 1; currentNum <= row; currentNum++)
      {
        System.out.print(currentNum + " ");
      }
      System.out.println(" ");
    }
  }

  public static void starTree()
  {
    for (int row = 1; row <= 9; row ++)
    {
      for (int space = 0; space <= row; space++)
      {
        System.out.print(" ")
      }

      for (int stars = 0; star < 9 -(row-1); star++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }

  }

  public static void multTable()
  {
    for (int row = 1; row <= 10; row++)
    {
      for (int num = 1; num <= 10; num++)
      {
        System.out.print((row*col) + "\t");
      }
      System.out.println();
    }
  }
}
