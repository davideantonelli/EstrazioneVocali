import java.util.ArrayList;
import java.util.List;

public class estraiVocali {

	
	
	public List<String> EstraiVocali(String StringaPassata){
	String StringaLavorabile,stringa;
	StringaLavorabile=StringaPassata;
	List<String> vocaliEstratte = new ArrayList<String>();
	List<String> Vocali = new ArrayList<String>();
	// aggiungo le vocali
	
	Vocali.add("a");
	Vocali.add("e");
	Vocali.add("i");
	Vocali.add("o");
	Vocali.add("u");
	
	if (StringaPassata.length()==0)
	{
		System.out.println("Terminato");
		System.out.println(vocaliEstratte.size());
		return vocaliEstratte;
	}else {
	//Restituisce un solo carattere
	stringa=StringaLavorabile.substring(0,1);	
	//System.out.println(stringa);
	if (Vocali.contains(stringa)) {
		
		vocaliEstratte.add(stringa);
		System.out.println(stringa);
	}
	// Ricorsivamente, passo la nuova stringa partendo dalla posizione 1, che scorre automaticamente.
	EstraiVocali(StringaLavorabile.substring(1));
	}
	return vocaliEstratte;
}
	
	
	
	/*
	 * String stringa ;
		// Array che contiene le vocali
		List<String> Vocali = new ArrayList<String>() ;
		// aggiungo le vocali
		
		Vocali.add("a");
		Vocali.add("e");
		Vocali.add("i");
		Vocali.add("o");
		Vocali.add("u");
		
	for (i=0; i<stringapassata.length();i++) {
		charInEsame=stringaDaLavorare.charAt(i);
		String s=String.valueOf(charInEsame);
			if (Vocali.contains(s)) {
				vocaliEstratte.add(s);
			}
	
	}
	*/
	



}
