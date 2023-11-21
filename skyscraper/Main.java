package skyscraper;

import java.util.Scanner;

public class Main {
    static int maxFloors;

    public static void main(String[] args) {
        System.out.println("Enter total no of floors int the building : ");
        Scanner scanner = new Scanner(System.in);
        maxFloors = scanner.nextInt();

        System.out.println("The order of construction is as follows ");

        SkyscraperDivideWork work = new SkyscraperDivideWork();
        work.service();

        scanner.close();
    }
}