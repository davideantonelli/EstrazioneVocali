import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		int i=0;
		 estraiVocali estrai = new estraiVocali();
		 List<String> estratte = new ArrayList<String>();
		 estratte= estrai.EstraiVocali("ciaone");
	
			 sb.append("La parola che ho processato contenteva ben " + estratte.size() + " vocali\n" );
			 sb.append("La nuova stringa è la seguente ");
			for (String s:estratte) {
			 sb.append(s);}
			
			 System.out.println(sb);
		 
			 
			 
	}

}
