package CreationalPattners.Singleton;
//this is an exemple, to show how works a singleton
public class Singleton {
    //first you must to use singleton himself like an attribute 
    private static Singleton singleton;
    //second you must to change the singleton's constructor to private
    private Singleton(){

    }
    //and now you make the method that will instace the class
    //remember that the concept about singleton are: be sure that you must have just one single instance of this class in all project
    public static Singleton getInstance(){
        //doing the validation
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    } 
}
