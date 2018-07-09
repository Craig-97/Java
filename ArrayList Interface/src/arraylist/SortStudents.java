package arraylist;

import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;
 
public class SortStudents
{
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("d:/students.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> al = new ArrayList<String>(); 
		
		String l;
		
		while ((l=br.readLine())!=null)
			al.add(l);
		
		Collections.sort(al);
		
		/*  //name and surname
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		} 
		
		 //surnames
		for (int i=0;i<al.size();i++)
		{
			String s = al.get(i);
			String[] sl = s.split(", ");
			System.out.println(sl[0]);
		} 
		
		//number of students
			System.out.println(al.size());
		
		
		// Names that start with "M"
		String name = "m";
		for (int i=0;i<al.size();i++)
		{
		    if(al.get(i).startsWith(name.toUpperCase()))
		    {
			System.out.println(al.get(i));
		    }
		} 
		
			// Print only the student with the longest name
		   String longestString = al.get(0);
		   for (int i=0;i<al.size();i++)
		   {
		       if (al.get(i).length() > longestString.length()) 
		       {
		    	   longestString = al.get(i);
		       }

		   }
		   System.out.println(longestString);
		
		// Print all the Smiths
			for (int i=0;i<al.size();i++)
			{
			    if(al.get(i).contains("Smith"))
			    {
				System.out.println(al.get(i));
			    }
			} */

	}

}

