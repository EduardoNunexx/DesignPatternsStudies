package BehavioralPattners.Observer;

import java.util.ArrayList;
public class Turma implements Isubject{
    ArrayList<Observer> observers = new ArrayList<>();
    ArrayList<Notas> notas = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void nofity() {
        for(Observer observer: observers){
            observer.stateChanged();
        }
    }
}
