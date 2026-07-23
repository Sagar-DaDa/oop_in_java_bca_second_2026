public class StringModification {
    public static void main(String[] args) {
        // Using replace()
        String str = "Java Programming";
        String newStr = str.replace("Java", "Python");
        System.out.println(newStr); //Python Programming

        //Using trim()
        String str1 = "   Hello Java   ";
        System.out.println(str1.trim()); //Hello Java

        //Using substring()
        
        String str2 = "Programming";

        System.out.println(str2.substring(3)); //gramming
        System.out.println(str2.substring(3, 8)); //gramm
    }
}
