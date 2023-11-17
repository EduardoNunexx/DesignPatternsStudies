package BehavioralPattners.Observer;

public interface Isubject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void nofity();
}
