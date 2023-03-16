package lionalgorithm.algorithm.day40;

public class Three {

    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4 && s.length() != 6 || s==null) return  false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
