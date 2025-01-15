import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       String[] myFriends = new String[5];


       int index = 0;

       while (index < myFriends.length) {
           Scanner in = new Scanner(System.in);
           System.out.println("Arkadaşınızın adı");
           myFriends[index++] = in.nextLine();
       }

       System.out.println("Arkadaşlarınız:");

        for (String myFriend : myFriends) {
            System.out.println(myFriend);
        }

        int[] numbers = new int[] {45,16,9,-5,33,69};

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < max) {
                max = numbers[i];
            }
        }


        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int gecici = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = gecici;
                }

            }
        }

        for(int numnber : numbers) {
            System.out.println(numnber);
        }


  //42
        //Kırkiki





    }
}