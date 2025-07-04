import java.util.Scanner;
class sum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d=a+b;
        System.out.print("the sum of"+a+"and"+b+"is"+d);
        sc.close();
    }
}