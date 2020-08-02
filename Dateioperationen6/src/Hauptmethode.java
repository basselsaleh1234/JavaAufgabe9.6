import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Hauptmethode  {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		
		Versuchsreihe versuch=new Versuchsreihe();
		
		versuch.eingabe();
		
		versuch.ausgabe();
		System.out.println("Versuchsreiheobjekt wird serialisiert !");
		ObjectOutputStream serialisieren=new ObjectOutputStream(new FileOutputStream("test.dat"));
		serialisieren.writeObject(versuch);
		serialisieren.close();
		
		
		System.out.println("Deserialisierung in ein anderes Versuchsreihenobjekt !");
		
		ObjectInputStream deserialisieren=new ObjectInputStream(new FileInputStream("test.dat"));
		
		Versuchsreihe neuerVersuch;
		
		neuerVersuch =(Versuchsreihe)deserialisieren.readObject();
		
		neuerVersuch.ausgabe();
		deserialisieren.close();
		
	}

}
