package junit;

import java.text.Normalizer;

public class Utils {
	
	public static String sansAccents(String source) {
		return Normalizer.normalize(source, Normalizer.Form.NFD).replaceAll("[\u0300-\u036F]", "");
	}
}