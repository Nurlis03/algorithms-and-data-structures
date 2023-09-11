public class DynamicArrayMain {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        dynamicArray.add(42);
        dynamicArray.add(55);
        System.out.println("Dynamic Array: " + dynamicArray.toString());
    }
}
