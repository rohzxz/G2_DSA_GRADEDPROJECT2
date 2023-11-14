import java.util.Scanner;
import java.util.Stack;

public class SkyscraperConstruction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Total number of floors
        System.out.println("Enter the total number of floors in the building:");
        int totalFloors = scanner.nextInt();

        // Input: Floor sizes given on each day
        Stack<Integer> floorSizes = new Stack<>();
        for (int i = 1; i <= totalFloors; i++) {
            System.out.println("Enter the floor size given on day " + i + ":");
            int size = scanner.nextInt();

            // Try to assemble floors
            assembleFloors(floorSizes, size, i);
        }

        scanner.close();
    }

    private static void assembleFloors(Stack<Integer> floorSizes, int size, int day) {
        Stack<Integer> tempStack = new Stack<>();

        // Pop and print the floors that can be assembled
        while (!floorSizes.isEmpty() && floorSizes.peek() < size) {
            tempStack.push(floorSizes.pop());
        }

        // Push the current floor size onto the stack
        floorSizes.push(size);

        // Print the order of construction
        if (!tempStack.isEmpty() || day == 1) {
            System.out.print("Day: " + day + "\n");
            while (!tempStack.isEmpty()) {
                System.out.print(tempStack.pop() + " ");
            }
            System.out.print("\n\n");
        }
    }
}
