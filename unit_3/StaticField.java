public class StaticField {
    String name;
    String address;
    static String collegeName = "Birat Kshitiz College";

    StaticField(String n, String a){
        name = n;
        address = a;
    }

    void display(){
        System.out.println(name + ", " + address + ", " + collegeName);
    }

    public static void main(String[] args) {
        StaticField obj1 = new StaticField("Pranil Tiwari", "Biratnagar");
        StaticField obj2 = new StaticField("Prakritee Rimal", "Biratnagar");

        obj1.display();
        obj2.display();
    }
}