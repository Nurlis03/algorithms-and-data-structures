import java.util.Scanner;

public class DynamicArrayMain {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        DynamicArray<Integer> dynamicArray = null;
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
                switch(operation) {
                    case 1:
                        if (dynamicArray != null) {
                            dynamicArray = new DynamicArray<>();
                            System.out.println("A dynamic array of numbers has been created!!!\n");
                        }
                        else {
                            System.out.println("Dynamic array already created.");
                        }
                        break;
                    case 2:
                        if (dynamicArray != null) {
                            System.out.println(dynamicArray.size());
                        }
                        else {
                            System.out.println("Dynamic array not created yet.");
                        }
                    case 3:
                        if (dynamicArray != null) {
                            if (dynamicArray.isEmpty()) {
                                System.out.println("Dynamic array is empty");
                            }
                            else {
                                System.out.println("Dynamic array is not empty");
                            }
                        }
                }
                break;
        }
    }
}
