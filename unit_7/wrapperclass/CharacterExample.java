public class CharacterExample {
    public static void main(String[] args) {
        char ch = 'A';

        System.out.println(Character.isLetter(ch)); //true
        System.out.println(Character.isDigit(ch)); //false
        System.out.println(Character.isUpperCase(ch)); //true
        System.out.println(Character.toLowerCase(ch)); //a
    }
}
