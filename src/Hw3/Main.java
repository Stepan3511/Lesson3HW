package Hw3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task1
        Integer arr1[] = {1, 2, 3, 4,};
        String arr2[] = {"A", "B", "C"};
        replace(arr1, 1, 3);
        replace(arr2, 1, 2);

        //Task2
        System.out.println("Task 3");
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 10; i++) {
            appleBox1.addFruit(new Apple());
            orangeBox1.addFruit(new Orange());
        }
        for (int i = 0; i < 5; i++) {
            appleBox2.addFruit(new Apple());
        }
        System.out.println("Weight 1st box with apples: " + appleBox1.getWeight());
        System.out.println("Weight 2st box with apples: " + appleBox2.getWeight());
        System.out.println("Weight box with oranges: " + orangeBox1.getWeight());
        System.out.println("Comparison result of 1st box of apples and box of oranges: "+appleBox1.compare(orangeBox1));

        System.out.println("Transferring from the second box to the first...");
        appleBox2.pourOverTo(appleBox1);
        System.out.println("Weight 1st box with apples: " + appleBox1.getWeight());
        System.out.println("Weight 2st box with apples: " + appleBox2.getWeight());
        System.out.println("Weight box with oranges: " + orangeBox1.getWeight());
        System.out.println("Comparison result of 1st box of apples and box of oranges: "+appleBox1.compare(orangeBox1));
    }
        public static void replace(Object[] arr, int n1, int n2){
            System.out.println("Task 1 " + Arrays.toString(arr));
            Object rep = arr[n1];
            arr[n1] = arr[n2];
            arr[n2] = rep;
            System.out.println("Result of replacement: " + Arrays.toString(arr));
        }
}
