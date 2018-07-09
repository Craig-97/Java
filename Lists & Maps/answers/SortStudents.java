import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
 
public class SortStudents{
  public static void main(String[]argv) throws Exception{
    ArrayList<String> names = new ArrayList<String>();
    String line;
    BufferedReader fh = new BufferedReader(new FileReader("students.txt"));
    while (null!=(line=fh.readLine()))
      names.add(line);
    java.util.Collections.sort(names);
    for (String s:names)
      System.out.println(s);
  }
}
