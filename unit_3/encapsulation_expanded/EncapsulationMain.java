public class EncapsulationMain {
    public static void main(String[] args) {
        Person ram = new Person();
        ram.setName("Ram Kumar Something");

        String personName = ram.getName();

        System.out.println(personName);
    }
}
