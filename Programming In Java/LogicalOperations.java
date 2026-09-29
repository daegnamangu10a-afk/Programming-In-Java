public class LogicalOperations
{
  public static void main (String [] args)
    {
      Boolean x = true;
      Boolean y = false;
      Boolean a = true;
      Boolean b = false;

      System.out.println("x AND y: " + (x && y));
      System.out.println("x AND a: " + (x && a));
      System.out.println("y AND b: " + (y && b));
      System.out.println("y AND x: " + (y && x));
      

      System.out.println("x OR y: " + (x || y));
      System.out.println("x OR a: " + (x || a));
      System.out.println("y OR b: " + (y || b));
      System.out.println("y OR x: " + (y || x));

      System.out.println("NOT x: " + (!x));
      System.out.println("NOT y: " + (!y));

      System.out.println("Program Executed By: Daegna Mangu");
      System.out.println("ERP Id: 0251BCA069");
    }
}