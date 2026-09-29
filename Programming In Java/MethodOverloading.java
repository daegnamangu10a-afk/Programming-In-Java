public class MethodOverloading {
    static void print(int num) {
        System.out.println("Integer"  + num);
    }
    
    static void print(double num) {
        System.out.println("Double"  + num);
    }
    
    public static void main(String[] args) {
        print(5);        
        print(3.14);     
        System.out.println("Program Executed By: Daegna Mangu");
        System.out.println("ERP Id: 0251BCA069");
    }
}
