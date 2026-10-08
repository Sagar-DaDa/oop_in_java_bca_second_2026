public class CopyConstructor {
    String name;
    int houseNo;

    CopyConstructor(String n, int h) {
        name = n;
        houseNo = h;
    }

    CopyConstructor(CopyConstructor c) {
        name = c.name;
        houseNo = c.houseNo;
    }

    void display() {
        System.out.println(name + " " + houseNo);
    }

    public static void main(String[] args) {
        CopyConstructor s1 = new CopyConstructor("Bob", 21);
        CopyConstructor s2 = new CopyConstructor(s1);

        s2.display();
    }
}
