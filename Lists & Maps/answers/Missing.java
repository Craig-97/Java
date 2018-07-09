import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
 
public class Missing{
  public static void main(String[]argv) throws Exception{
    ArrayList<String> names = new ArrayList<String>();
    String line;
    BufferedReader fh = new BufferedReader(new FileReader("present.txt"));
    while (null!=(line=fh.readLine())){
      names.add(line);
    }
    BufferedReader fi = new BufferedReader(new FileReader("students.txt"));
    while (null!=(line=fi.readLine())){
      if (!names.contains(line))
        System.out.println(line);
    }
  }
}
