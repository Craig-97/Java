package bbwb;


public abstract class Ball {
	
	String theColour; 
	
	public Ball(String theColour) {
		setTheColour(theColour);
	}

	public String getTheColour() {
		return this.theColour;
	}

	public void setTheColour(String theColour) {
		this.theColour = theColour;
	}
	
	

}
