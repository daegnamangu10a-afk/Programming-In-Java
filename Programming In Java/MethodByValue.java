public class MethodByValue 
{
	static void increment(int num)
	{
        	num++;  
    		System.out.println("After Increment the value is "+num);
	}
        public static void main(String[] args)
	{
        	int x = 5;
        	increment(x);
        	System.out.println("The Original Value is not changed by the method it is as is " +x); 
			System.out.println("Program Executed By: Daegna Mangu");
            System.out.println("ERP Id: 0251BCA069");
    }
}