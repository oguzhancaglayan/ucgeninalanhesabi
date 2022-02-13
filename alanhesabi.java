import java.util.Scanner;

public class alanhesabi {


        public static void main(String[] args) {
            int a, b,c;
            double u, alan;
            Scanner inp = new Scanner(System.in);
            System.out.println("a'nın uzunluğunu giriniz:");
            a = inp.nextInt();
            System.out.println("b'nın uzunluğunu giriniz:");
            b = inp.nextInt();
            System.out.println("c'nın uzunluğunu giriniz:");
            c= inp.nextInt();
            u= (a+b+c)/2;

            alan =u*(u-a)*(u-b)*(u-c);
            System.out.print("alanı"+" "+alan+""+"metrekaredir");


        }
    }

