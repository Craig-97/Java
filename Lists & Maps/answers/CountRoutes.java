import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
 
public class CountRoutes{
  public static void main(String[]argv) throws Exception{
    TreeMap<String,Integer> routes = new TreeMap<String,Integer>();
    String line;
    BufferedReader fh = new BufferedReader(new FileReader("year1.txt"));
    while (null!=(line=fh.readLine())){
      String [] st = line.split("\t");
      int count = 0;
      if (routes.containsKey(st[1]))
        count = routes.get(st[1]);
      routes.put(st[1],count+1);
    }
    for (String s : routes.keySet())
      System.out.println(s+"\t"+routes.get(s));
  }
}