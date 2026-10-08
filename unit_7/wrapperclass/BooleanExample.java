public class BooleanExample {
    public static void main(String[] args) {
        boolean value = true;
        Boolean obj = Boolean.valueOf(value);

        //Common methods
        boolean x = Boolean.parseBoolean("true");
        Boolean y = Boolean.valueOf("false");
        String s = Boolean.toString(true);
    }
}
