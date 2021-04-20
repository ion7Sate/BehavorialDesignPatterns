package Observer;

public interface Subject {

    public void subscribeObserver(Observer observer);

    public void unsubscribeObserver(Observer observer);

    public void notifyObservers();

    public String subjectDetails();
}
