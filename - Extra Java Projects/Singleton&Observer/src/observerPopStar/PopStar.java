package observerPopStar;

import java.util.ArrayList;

public class PopStar implements Observable {
	
	private String news;
	private ArrayList <Fan>  myFans = new ArrayList <Fan> ();

	public PopStar(String name) {
		setNews(name);
	}
	
	public String getNews() {
		return this.news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public void registerObserver(Fan f) {
		this.myFans.add(f);

	}

	public void removeObserver(Fan f) {
		this.myFans.remove(f);

	}

	public void notifyObservers() {
		for(Fan tempFan : this.myFans) {
			tempFan.update(this.news);
		}

	}

}
