package CreationalPattners.Builder;

public class Person {
    String firstName;
    String lastName;
    int age;
    public Person(){
        
    }
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static class BuilderPerson{
        String firstName;
        String lastName;
        int age;
        public BuilderPerson firstName(String firstName){
            this.firstName= firstName;
            return this;
        }
        public BuilderPerson lastName(String lastName){
            this.lastName= lastName;
            return this;
        }
        public BuilderPerson age(int age){
            this.age= age;
            return this;
        }
        public Person build(){
            return new Person (firstName,lastName,age);
        }
    }    
}
