//Day-1
//Problem- String Mirror


class Solution {
	public static String stringMirror(String str) {
        // code here
         StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) >= str.charAt(i) && str.charAt(0) != str.charAt(1)) {
                sb.append(str.charAt(i));
            } else {
                break;
            }
        }
        String s = sb.toString();
        sb.setLength(s.length());
        for (int j = s.length()-1; j >= 0; j--) {
            sb.append(s.charAt(j));
        }
        return sb.toString();
    }
}
