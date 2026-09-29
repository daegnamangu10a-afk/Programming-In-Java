class temp
{
  public int instancevar=100;
  public void method()
    {
       int localvar=90;
       System.out.println("Hi Everyone I am from a Lethod and I have one local variable named localvar"+localvar);
    }
}

public class VariableDemo
{
  static int staticvar=100;

  public static void main(String args[])
    {
       int localvar =234;
       System.out.println(localvar);
       System.out.println("Static Variable"+staticvar);
       temp t =new temp();
       System.out.println("Instant Variable"+t.instancevar);
       t.method();
       System.out.println("Program Executed By: Daegna Mangu");
       System.out.println("ERP Id: 0251BCA069");
    }
}
