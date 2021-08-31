package lecture02;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String str = "My name is Test";
        System.out.println(str.length());
        String[] stringParts = str.split(" ");
        System.out.println(stringParts.length);
        System.out.println(str.replace("Test", "Didi"));
        System.out.println("My name is " + "Didi!");

        String newWord = scanner.nextLine();
        System.out.println("My name is " + newWord);

    }
    public static void changeTheWord(){

         String beforeChange = "My name is Test";



    }
}
