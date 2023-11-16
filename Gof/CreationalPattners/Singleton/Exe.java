package CreationalPattners.Singleton;

public class Exe {
    public static void main(String[] args) {
        //instancing my singleton object
        Singleton singleton1 = Singleton.getInstance();
        SingletonPropie singleton2= SingletonPropie.getInstance("ola");
        SingletonPropie singleton3= SingletonPropie.getInstance("ap");
        System.out.println(singleton2.getName());
        System.out.println(singleton3.getName());
    }
}
