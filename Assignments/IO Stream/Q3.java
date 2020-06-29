import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Q3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("d://javaTest.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("d://jt2.txt"));
		
		String s = br.readLine();
		Map<String, Integer> map = new TreeMap<>();
		while(s!=null)
		{
			s=s.trim();
			String[] word = s.split(" ");
			for(String w: word)
			{
				if(!map.containsKey(w))
				{
					map.put(w,1);
				}
				else
				{
					map.put(w,map.get(w)+1);
				}
			}
			
			s = br.readLine();
		}
		System.out.println(map);
		
		
		for(Map.Entry m:map.entrySet())
		{  
		  bw.write(m.getKey() + " : " + m.getValue() + "\n");
		}
		bw.flush();

	}

}
