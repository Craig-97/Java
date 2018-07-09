import java.util.TreeMap;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
 
public class ListByRegion{
  public static void main(String[]argv) throws Exception{
    TreeMap<String,ArrayList<String>> region = new TreeMap<String,ArrayList<String>>();
    String line;
    BufferedReader fh = new BufferedReader(new FileReader("bbc.txt"));
    while (null!=(line=fh.readLine())){
      String [] st = line.split("\t");
      if (!region.containsKey(st[1]))
        region.put(st[1],new ArrayList<String>());
      region.get(st[1]).add(st[0]);
    }
    for (String s : region.keySet()){
      System.out.println(s+"\t");
      for (String c:region.get(s))
        System.out.println(" "+c);
    }
  }
}