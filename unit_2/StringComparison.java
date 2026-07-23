public class StringComparison {
    public static void main(String[] args) {
        // Using ==
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        // Using equals()
        String se1 = "Java";
        String se2 = new String("Java");

        System.out.println(se1.equals(se2)); // true

        // Using equalsIgnoreCase()
        String si1 = "JAVA";
        String si2 = "java";

        System.out.println(si1.equalsIgnoreCase(si2)); // true

        // Using compareTo()
        
        String sc1 = "Apple";
        String sc2 = "Banana";

        System.out.println(sc1.compareTo(sc2)); //-1
    }
}
