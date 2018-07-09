package tsp;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TSPlib {
	public static ArrayList<Point2D> loadTSPLib(String fName) {

		ArrayList<Point2D> result = new ArrayList<Point2D>();
		BufferedReader br = null;
		try {
			String currentLine;
			int dimension = 0;// Hold the dimension of the problem
			boolean readingNodes = false;
			br = new BufferedReader(new FileReader(fName));
			while ((currentLine = br.readLine()) != null) {
				// Read the file until the end;
				if (currentLine.contains("EOF")) {
					// EOF should be the last line
					readingNodes = false;
					// Finished reading nodes
					if (result.size() != dimension) {
						// Check to see if the expected number of cities
						// have been loaded
						System.out.println("Error loading cities");
						System.exit(-1);
					}
				}
				if (readingNodes) {
					// If reading in the node data
					String[] tokens = currentLine.split("\\s+");
					// array for the relevant tokens as some TSP's have irrelevant data
					String[] relevantTokens = new String[3]; 
					int i = 0;
					for (String s : tokens) {
						if (s.length() > 0) {
							relevantTokens[i++] = s;
						}
					}
					// Split the line by spaces.
					// tokens[0] is the city id and not needed in this
					// example
					float x = Float.parseFloat(relevantTokens[1].trim());
					float y = Float.parseFloat(relevantTokens[2].trim());
					// Use Java's built in Point2D type to hold a city
					Point2D city = new Point2D.Float(x, y);
					// Add this city into the ArrayList
					result.add(city);
				}
				if (currentLine.contains("DIMENSION")) {
					// Note the expected problem dimension (number of
					// cities)
					String[] tokens = currentLine.split(":");
					dimension = Integer.parseInt(tokens[1].trim());
				}
				if ((currentLine.contains("DISPLAY_DATA_SECTION") || (currentLine.contains("NODE_COORD_SECTION")))) {
					// Node data follows this line
					readingNodes = true;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

}
