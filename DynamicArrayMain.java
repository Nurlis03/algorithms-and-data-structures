import java.util.Scanner;

public class DynamicArrayMain {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();        
        Scanner input = new Scanner(System.in);
        int operation = 0;

        while (true) {
            System.out.println("\tSelect option:\n" +
                "\t1. Create Dynamic array.\n" +
                "\t2. Size of the Dynamic array.\n" +
                "\t3. Check if Dynamic array is empty.\n" +
                "\t4. Get element by index.\n" +
                "\t5. Set value by index.\n" +
                "\t6. Clear Dynamic array.\n" +
                "\t7. Add value.\n" +
                "\t8. Remove element by index.\n" +
                "\t9. Remove element by value.\n" +
                "\t10. Get index of element by value.\n" +
                "\t11. Check if value contains in Dynamic array.\n" +
                "\t12. Show Dynamic array.\n" +
                "\t13. Exit.\n\n"
                );
                operation = input.nextInt();
                break;
        }
    }
}
