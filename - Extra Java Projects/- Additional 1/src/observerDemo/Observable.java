package observerDemo;

public interface Observable {
	
	public void registerObserver(Student s);
	public void removeObserver(Student s);
	public void notifyObservers();

}
