import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Sayısal
        //Sözel
        //Mantıksal

        //05444298087

        byte mincayBardagi = -128;
        byte maxCayBardagi = 127;

        short x;
        int y;
        long z;

        double pi = 3.14;
        float fPi = 3.14f;

        String name = "Ferve";
        char c = 'F';

        boolean olduMu = false;


        Scanner scanner = new Scanner(System.in);
        boolean calisiyorMu = false;

        while (!calisiyorMu)   {


            System.out.println("Ne zaman doğdun bro?");
            Scanner sc = new Scanner(System.in);
            try {

                int dogumYili = sc.nextInt();
                int suAnkiYil = LocalDate.now().getYear();
                int yas = suAnkiYil - dogumYili;
                System.out.println(yas);
                calisiyorMu = true;
            } catch (InputMismatchException error) {
                calisiyorMu = false;
                System.out.println("Yıl gir be birader!");
                System.out.println("Yeniden deneyin!");

            }
        }

        //5 defa ekrana Ferve yaz:
/*
        System.out.println("Ferve");
        System.out.println("Ferve");
        System.out.println("Ferve");
        System.out.println("Ferve");
        System.out.println("Ferve");

 */

        //Keşke bir değişkenim olsa, 0'dan başlayıp 5'e kadar 1'er 1'er artsa ben de her artışda ekrana Ferve yazdırsam:


        int sayi = 5;
        System.out.println(++sayi);
        System.out.println(sayi);


        int value = 9;
        value = value + 1;
        value += 4;

        int a = 10;

        int b = a++ + ++a;
        System.out.println(b);
        System.out.println(a);



          /*
         int count = 0;
     critic:   if (count<5){
            System.out.println("Türkay");
            count++;
            goto critic;
        }*/

        System.out.println("Kaç kez yazayım?");

        int adet = scanner.nextInt();

        for (int i = 0; i < adet; i++) {
            System.out.println("Ferve");
        }

        int startPoint = 0;
        while (startPoint < adet) {
            System.out.println("Ferve");
            startPoint++;
        }


    }
}