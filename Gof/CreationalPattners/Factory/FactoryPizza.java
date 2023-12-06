package CreationalPattners.Factory;

public class FactoryPizza {
    //you can use A string or the interface himself
    public IPizza createPizza(String type){
        IPizza pizza;
        switch (type) {
            case "meat":
                pizza = new Meat();
                break;
            case "cheese":
                pizza= new Cheese();
                break;
            case "bacon":
                pizza= new Bacon();
                break;
            default:
                pizza= new Cheese();
                break;
        }
        return pizza;
    }
}
