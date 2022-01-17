package tim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private int a, b;
    private int result;
    private final Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("Welcome to the Simplest calc In the world!");
        System.out.println("Please add first number");
        a = scanner.nextInt();
        if(a<=100){
            for(int i =0;i<a;i++){
                System.out.print(i+1+",");
            }

        }else {
            System.out.println("Kambucha");
        }
        System.out.println(" ");
        System.out.println("Add second number");
        b = scanner.nextInt();
        result = a + b;
        System.out.println("Addition result is: " + result);
    }

    public void sortingArray(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,1);
        arrayList.add(1,45);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(78);
        arrayList.add(8);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }



    public static void main(String[] args) {

        Main cal = new Main();
//        cal.add();
        cal.sortingArray();
    }
}
