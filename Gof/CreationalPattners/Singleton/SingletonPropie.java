package CreationalPattners.Singleton;
public class SingletonPropie {
    private String name;
    private static SingletonPropie singleton;
    private SingletonPropie(String name){
        this.name=name;
    }
    public static SingletonPropie getInstance(String name ){
        if(singleton==null){
            singleton= new SingletonPropie(name);
        }
        return singleton;
    }
    public String getName(){
        return name;
    }

}