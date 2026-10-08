class SingletonClass {

    private static SingletonClass instanceVar;

    private SingletonClass() {
        System.out.println("Object created");
    }

    public static SingletonClass getInstance() {

        if (instanceVar == null) {
            instanceVar = new SingletonClass();
        }

        return instanceVar;
    }

    public void display() {
        System.out.println("SingletonClass object is working");
    }
}

public class SingletonDemo {

    public static void main(String[] args) {

        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        obj1.display();

        System.out.println(obj1 == obj2);
    }
}