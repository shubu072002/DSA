package practice.Recursion;

import java.util.Scanner;

public class Febonacci {
    public int febonocciSeries(int n ){
        if(n==0 || n==1){
            return n;
        }
        return febonocciSeries(n-1)+febonocciSeries(n-2);
    }
    public static void main(String[] args){
        Febonacci f = new Febonacci();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit");
        int x = sc.nextInt();
        for(int i=0;i<=x;i++){
            System.out.print(f.febonocciSeries(i)+ " ");
        }
        System.out.println();
        System.out.println(f.febonocciSeries(6));
    }
}
