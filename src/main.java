import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		int i=0;
		 estraiVocali estrai = new estraiVocali();
		 ArrayList<String> estratte = new ArrayList<String>();
		 estratte= (ArrayList<String>) estrai.EstraiVocali("ciao");
	
			 sb.append("La parola che mi hai dato contenteva ben " + estratte.size() + " vocali\n" );
			 sb.append("La nuova stringa è la seguente ");
			for (String s:estratte) {
			 sb.append(s);}
			
			 System.out.println(sb);
		 
			 
	}

}
