import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

int counter=0;
int total=0;

        int k,n1=0,n2=1,n3;

        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        k = inp.nextInt();


        for (int i = 2  ;i<=k;i++){
            n3=n1+n2;
            System.out.print(n1 + " + " +n2 + " = "+n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }
    }
}