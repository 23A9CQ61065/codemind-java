import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        int n,a;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        a=n*(n+1)/2;
        System.out.println(a);
    }
}