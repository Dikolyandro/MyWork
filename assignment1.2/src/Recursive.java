
import java.util.Scanner;

public class Recursive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        recursion(a,b);
        System.out.println(b);
    }
    public static void recursion(int a, int b){
        if(a<b){
            System.out.println(a);
            recursion(a+1,b);
        }
        if(a>b){
            System.out.println(a);
            recursion(a-1,b);
        }
    }
}