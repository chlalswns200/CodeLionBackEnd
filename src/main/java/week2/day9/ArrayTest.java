package week2.day9;

public class ArrayTest {

    public static void printArray(Object[] obj) {
        for (Object o : obj) {
            System.out.println(o);
        }

    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }
}
