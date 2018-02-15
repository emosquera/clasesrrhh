package commons;


public class StringUtils {

	private StringUtils() {
	}

	public static boolean isEmpty(final String s ) {
        return s == null || s.trim().isEmpty();
    }
	
	public static String capitalize (String str) {
		return changeFirstCharacterCase(str, true);
	}
	
	public static String uncapitalize(String str) {
		return changeFirstCharacterCase(str, false);
	}
	
	private static String changeFirstCharacterCase(String str, boolean capitalize) {
		if (str == null || str.length() == 0) {
			return str;
		}
		StringBuilder sb = new StringBuilder(str.length());
		if (capitalize) {
			sb.append(Character.toUpperCase(str.charAt(0)));
		}
		else {
			sb.append(Character.toLowerCase(str.charAt(0)));
		}
		sb.append(str.substring(1));
		return sb.toString();
	}
	
	public static boolean hasText(CharSequence str) {
		if (!hasLength(str)) {
			return false;
		}
		int strLen = str.length();
		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasLength(CharSequence str) {
		return str != null && str.length() > 0;
	}

	public static boolean isNumber(String string){
		if(isEmpty(string))
			return false;
		try{
			Long.parseLong(string);
			return true;
		}catch (NumberFormatException nfe){
			return  false;
		}
	}
}
