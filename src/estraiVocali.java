import java.util.ArrayList;
import java.util.List;

public class estraiVocali {

	
	public List<String> EstraiVocali(String stringapassata){
	String stringaDaLavorare= stringapassata;
	int i,y=0;
	char charInEsame;
	// Array che contiene le vocali
	List<String> Vocali = new ArrayList<String>() ;
	// aggiungo le vocali
	
	Vocali.add("a");
	Vocali.add("e");
	Vocali.add("i");
	Vocali.add("o");
	Vocali.add("u");
	
	List<String> vocaliEstratte = new ArrayList<String>();
	for (i=0; i<stringapassata.length();i++) {
		charInEsame=stringaDaLavorare.charAt(i);
		String s=String.valueOf(charInEsame);
			if (Vocali.contains(s)) {
				vocaliEstratte.add(s);
			}
	
	}
	
	return vocaliEstratte;
}
}
