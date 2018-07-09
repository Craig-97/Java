import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
 
public class ListRoutes{
  public static void main(String[]argv) throws Exception{
    ArrayList<String> names = new ArrayList<String>();
    String line;
    BufferedReader fh = new BufferedReader(new FileReader("year1.txt"));
    while (null!=(line=fh.readLine())){
      String [] st = line.split("\t");
      if (!names.contains(st[1]))
        names.add(st[1]);
    }
    java.util.Collections.sort(names);
    for (String s:names)
      System.out.println(s);
  }
}
