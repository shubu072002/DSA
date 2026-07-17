package Pattern;
//1
//12
//123
//1234
//12345

public class Pattern_2 {
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

//*
//**
//***
//****
//*****
//****
//***
//**
//*
    public static void patten2(int n){
        for(int row=1;row<2*n;row++){
            int totalRowInCol = row>n?(2*n)-row:row;
            for(int col=1;col<=totalRowInCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//    *
//   **
//  ***
// ****
//*****
    public static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//      1
//     131
//    13531
//   1357531
//  135797531
        public static void pattern4(int n){
           for(int i=1;i<=n;i++){
               for(int j=1;j<=n-i;j++){
                   System.out.print(" ");
               }
               for(int j=1;j<=i;j++){
                   System.out.print(2*j-1);
               }
               for(int j=i-1;j>=1;j--){
                   System.out.print(2*j-1);
               }
               System.out.println();
           }
    }

    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
        public  static void pattern6(int n){
            for(int i=1;i<=n;i++){
                for(int j=n;j>i;j--){
                    System.out.print(" ");
                }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
                System.out.println();
            }

            for(int i=n-1;i>=1;i--){
                for(int j=n;j>i;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }


    public static void main(String[] args) {
        pattern6(5);
    }
}
