import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        String fruits[] = {"Flag", "Banana", "Cat", "Apple",  "Cat", "Dog", "Elephant"};
        Arrays.sort(fruits);
        
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // String fruitsCopy[] = {"Apple", "Banana", "Cat", "Dog", "Elephant", "Flag"};
        
        // int a = Arrays.binarySearch(fruits, "Dog");

        // System.out.println(Arrays.equals(fruits, fruitsCopy));

        // boolean condition = Arrays.equals(fruits, fruitsCopy);

        // if (condition) 
        //     System.out.println("Both arrays are equal!");
        // else
        //     System.out.println("They are different arrays!");

        // System.out.println(condition ? "Both arrays are equal!" : "They are different arrays!");

        // int[] nums = new int[5];
        // Arrays.fill(nums, 9);

        
        
    }
}
