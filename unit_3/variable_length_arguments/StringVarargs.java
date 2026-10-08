class StringVarargs {

    static void display(String... names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        display("Ram");
        display("Sita");
        display("Ram", "Sita", "Hari");
    }
}
