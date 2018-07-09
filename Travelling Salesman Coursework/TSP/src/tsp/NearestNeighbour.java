package tsp;

//import needed libraries
import java.awt.geom.Point2D;
import java.util.ArrayList;

/***************************
 * Developer: Craig Baxter * 
 * Date Created: 01/11/16  *
 **************************/

public class NearestNeighbour {

	public static void main(String[] args) {
		
		// variable records start of runtime
		long startTime = System.currentTimeMillis();
		
		//finds the TSP instance held on storage and reads it in as an arraylist
		ArrayList<Point2D> cities = TSPlib.loadTSPLib
		("D:/University/Year 3/Algorithms and Data Structures/Coursework/TSP/rl5915.tsp");
		ArrayList<Point2D> result = new ArrayList<Point2D>();
		
		// add the first city to the results (the starting point)
		Point2D currentCity = cities.remove(0);
		Point2D closest = null; //set closest city to null
		while (cities.size() > 0) { // continue while cities left to sort

			//declare distance variable as double positive infinity
			double distance = Double.POSITIVE_INFINITY; 

			// iterate over the list of cities that haven't been sorted
			for (Point2D possibleCity : cities) {
				if (getDistance(currentCity, possibleCity) < distance) {
					distance = getDistance(currentCity, possibleCity);
					closest = possibleCity;
				}
			}

			result.add(closest); // add the closest city
			cities.remove(closest); // remove closest city so it’s no longer considered
			currentCity = closest; // set closest city to current city
			
		} // end while

		// print out sorted cities in order by distance and the total route length
		System.out.println("sorted city by distance: " + result);
		System.out.println("Route length: " + TSPtour.routeLength(result));

		// variable records end of runtime
		long endTime = System.currentTimeMillis(); 
		
		//prints out how long it took to calculate the result
		System.out.println("\n" + "It took " + (endTime - startTime) + " ms to calculate"); 
	}
	//gets distance between current city and other city
	private static double getDistance(Point2D city, Point2D otherCity) {
		//returns distance between current city and other city
		return city.distance(otherCity); 
	}

}
