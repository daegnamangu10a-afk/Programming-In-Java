public class BitwiseOperations
{
  public static void main(String[] args)
   {
     int a = 5;
     int b = 3;
     
     int bitwiseAnd = a & b;
     System.out.println("Bitwise AND: " + bitwiseAnd);

     int bitwiseOr = a | b;
     System.out.println("Bitwise OR: " + bitwiseOr);

     int bitwiseXor = a ^ b;
     System.out.println("Bitwise XOR: " + bitwiseXor);

    int bitwiseNotA = ~a;
    System.out.println("Bitwise NOT of a: " +bitwiseNotA);

    int leftshift = a << 2;
    System.out.println("Left shift of a: " + leftshift);
   
    int rightshift = a >> 2;
    System.out.println("Right shift of a: " + rightshift);
    
    System.out.println("Program Executed By: Daegna Mangu");
    System.out.println("ERP Id: 0251BCA069");
   }
}











