

import java.awt.Window.Type;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Balance = 10000;
        int widthdraw;
        int pin;
        int Remaingamount;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter pin: ");
        pin = ref.nextInt();

        if (pin == 123) {
            Scanner ref1 = new Scanner(System.in);
            System.out.println("Enter Account type:");
            String acc = "savings";
            acc = ref1.nextLine();
            if (acc.equals("savings")) {
                Scanner ref2 = new Scanner(System.in);
                System.out.println("Enter Widthdraw amount: ");
                widthdraw = ref2.nextInt();
                if (widthdraw <= Balance) {
                    System.out.println("please collect your amount");
                    Remaingamount = Balance - widthdraw;
                    System.out.println("Balance =" + Remaingamount);
                    System.out.println("Thankyou visit Again");
                } else {
                    System.out.println("Insufficient Balance");
                }


            } else {
                System.out.println("Worng input");
            }
        } else {
            System.out.println("Worng pin");
        }
    }
}