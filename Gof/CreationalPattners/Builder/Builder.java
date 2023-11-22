package CreationalPattners.Builder;

public abstract class Builder {
    public static void main(String[] args) {
      new Person.BuilderPerson().build();
      Person x = new Person.BuilderPerson().build();
    }
}
