import java.util.Scanner;

public class DynamicArrayMain {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        DynamicArray<Integer> dynamicArray = null;
        int operation = 0;
        Boolean cycle = true;
        while (cycle) {
            System.out.println("\tSelect option:\n" +
                "\t1. Creating Dynamic array.\n" +
                "\t2. Size of the Dynamic array.\n" +
                "\t3. Checking if Dynamic array is empty.\n" +
                "\t4. Geting element by index.\n" +
                "\t5. Seting value by index.\n" +
                "\t6. Clearing Dynamic array.\n" +
                "\t7. Adding value.\n" +
                "\t8. Removing element by index.\n" +
                "\t9. Removing element by value.\n" +
                "\t10. Geting index of element by value.\n" +
                "\t11. Checking if value contains in Dynamic array.\n" +
                "\t12. Showing Dynamic array.\n" +
                "\t13. Exit.\n\n"
                );
            System.out.print("Enter operation: ");
            operation = input.nextInt();
            switch(operation) {
                case 1:
                    if (dynamicArray == null) {
                        dynamicArray = new DynamicArray<>();
                        System.out.println("A dynamic array of numbers has been created!!!\n");
                    }
                    else {
                        System.out.println("Dynamic array already created.\n");
                    }
                    break;
                case 2:
                    if (dynamicArray != null) {
                        System.out.println(dynamicArray.size());
                    }
                    else {
                        System.out.println("Dynamic array not created yet.\n");
                    }
                    break;
                case 3:
                    if (dynamicArray != null) {
                        if (dynamicArray.isEmpty()) {
                            System.out.println("Dynamic array is empty\n");
                        }
                        else {
                            System.out.println("Dynamic array is not empty\n");
                        }
                    }
                    else {
                        System.out.println("Dynamic array not created yet.\n");
                    }
                    break;
                case 4:
                    if (dynamicArray != null) {
                        System.out.print("Enter index that you want get element: ");
                        operation = input.nextInt();
                        System.out.println(dynamicArray.get(operation));
                    }
                    else {
                        System.out.println("Dynamic array not created yet.\n");
                    }
                    break;
                case 5:
                    if (dynamicArray != null) {
                        System.out.print("Enter index that you want set element: ");
                        int indx;
                        indx = input.nextInt();
                        System.out.print("Enter value that you want save this element by index: ");
                        operation = input.nextInt();
                        dynamicArray.set(indx, operation);
                    }
                    else {
                        System.out.println("Dynamic array not created yet.\n");
                    }
                    break;
                case 6:
                    if (dynamicArray != null) {
                        dynamicArray.clear();
                    }
                    else {
                        System.out.println("Dynamic array not created yet.\n");
                    }
                    break;
                case 7:
                    if (dynamicArray != null) {
                        System.out.print("Enter integer value: ");
                        operation = input.nextInt();
                        dynamicArray.add(operation);
                    }
                    else {
                        System.out.println("Dynamic array not created yet.\n");
                    }
                    break;
                case 8:
                    if (dynamicArray != null) {
                        System.out.println("Enter index to delete value: ");
                        operation = input.nextInt();
                        dynamicArray.removeAt(operation);
                    }
                    else {
                        System.out.println("Dynamic array not created yet.\n");
                    }
                    break;
                case 9:
                    if (dynamicArray != null) {
                        System.out.print("Enter integer value to delete in dynamic array: ");
                        operation = input.nextInt();
                        dynamicArray.remove(operation);
                    }
                    else {
                        System.out.println("Dynamic array not created yet.\n");
                    }
                    break;
                case 10:
                    if (dynamicArray != null) {
                        System.out.print("Enter integer value: ");
                        operation = input.nextInt();
                        int indx = dynamicArray.indexOf(operation);
                        if (indx < 0) {
                            System.out.println("Value " + operation + "is not exist in dynamic array\n");
                        }
                        else {
                            System.out.println("The first element found is in the index: " + indx);
                        }
                    }
                    else {
                        System.out.println("Dynamic array not created yet.\n");
                    }
                    break;
                case 11:
                    if (dynamicArray != null) {
                        System.out.print("Enter integer value: ");
                        operation = input.nextInt();
                        if (dynamicArray.contains(operation)) {
                            System.out.println("Element " + operation + "contains in dynamic array.\n");
                        }
                        else {
                            System.out.println("Element " + operation + "doesn't contains in dynamic array.\n");
                        }
                    }
                    else {
                        System.out.println("Dynamic array not created yet.\n");
                    }
                    break;
                case 12:
                    if (dynamicArray != null) {
                        System.out.println(dynamicArray.toString());
                    }
                    else {
                        System.out.println("Dynamic array not created yet.\n");
                    }
                    break;
                case 13:
                    cycle = false;
                    break;
                default:
                    break;
            }
        }
    }
}
