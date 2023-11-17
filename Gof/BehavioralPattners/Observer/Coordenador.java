package BehavioralPattners.Observer;

public class Coordenador implements Observer{
    public void stateChanged() {
        System.out.println("Notas mudadas");
    }
}
