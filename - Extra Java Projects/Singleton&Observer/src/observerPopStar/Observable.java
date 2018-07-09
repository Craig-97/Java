package observerPopStar;

public interface Observable {
	
	public void registerObserver(Fan f);
	public void removeObserver(Fan f);
	public void notifyObservers();

}
