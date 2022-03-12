package tim;

import java.util.Scanner;

public class DealerCenter {

      static Scanner scanner = new Scanner(System.in);

    public void dealerCenter() {
        System.out.println("Welcome to dealership center!");
        System.out.println("Please choose option" + "\na-sell car; b-buy car");
        scanner.nextInt();
        String option = scanner.nextLine();

        scanner.close();

    }

    //string
    // first letter capital.

     static void letterFun(){
        System.out.println("Please enter word");
        String word = scanner.nextLine();
        System.out.println( word.toUpperCase());

    }



    public static void main(String[] args) {
        DealerCenter del =  new DealerCenter();
//        del.dealerCenter();

        letterFun();
    }
}
