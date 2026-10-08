public class ParameterizedConstructor {
    String name;
    int houseNo;

    ParameterizedConstructor(String n, int h){
        name = n;
        houseNo = h;
    }

    void display(){
        System.out.println(name + " " + houseNo);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("Sagar Shrestha", 777);
        obj.display();
    }
    
}
