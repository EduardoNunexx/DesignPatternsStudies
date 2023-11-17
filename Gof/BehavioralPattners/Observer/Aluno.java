package BehavioralPattners.Observer;

public class Aluno implements Observer{
    public void stateChanged() {
        System.out.println("Notas mudadas");
    }
}
