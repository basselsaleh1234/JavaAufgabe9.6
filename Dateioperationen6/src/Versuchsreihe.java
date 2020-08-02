import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

public class Versuchsreihe implements Serializable{
	
	
	java.util.ArrayList s=new java.util.ArrayList();
	
	public void eingabe() throws IOException {
		
	
		
		
		
		BufferedReader einlesen =new BufferedReader(new InputStreamReader(System.in));
		

	int n;
	
	      n=Integer.parseInt(einlesen.readLine());
		while(n!=0) {
			
			s.add(n);
			
			
		     n=Integer.parseInt(einlesen.readLine());
			
			
		}
		
		
	}
	
	public void ausgabe() {
		
		
		for(Object obj:s.toArray()) {
			System.out.println(obj);
			
		}
		
	}


}
