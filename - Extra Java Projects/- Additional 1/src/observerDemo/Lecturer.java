package observerDemo;

import java.util.ArrayList;

public class Lecturer implements Observable {
	
	private String news;
	private ArrayList <Student>  myStudents = new ArrayList <Student> ();

	public Lecturer(String name) {
		setNews(name);
	}
	
	public String getNews() {
		return this.news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public void registerObserver(Student s) {
		this.myStudents.add(s);

	}

	public void removeObserver(Student s) {
		this.myStudents.remove(s);

	}

	public void notifyObservers() {
		for(Student tempStudent : this.myStudents) {
			tempStudent.update(this.news);
		}

	}

}
