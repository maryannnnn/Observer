package Patterns.Observer;

public interface Subject {
    public void registerObserver(Observers о);
    public void removeObserver(Observers о);
    public void notifyObservers();

}