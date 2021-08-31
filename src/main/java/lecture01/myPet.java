package lecture01;

import java.util.Scanner;

public class myPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String petName = scanner.nextLine();
        String petAction = scanner.nextLine();

        System.out.println("My favorite dog " + petName + " really likes to " + petAction);
    }

}
