package String;

public class Leetcode_2109AddingSpacesToString {

	public static void main(String[] args) {
		String s = "LeetcodeHelpsMeLearn"; 
		int[] spaces = {8,13,15};
		System.out.println(addSpaces(s,spaces));

	}
	
	public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.substring(0,spaces[0]));

        int i=1;
        for(;i<spaces.length;i++){
            sb.append(" ");
            sb.append(s.substring(spaces[i-1],spaces[i]));
        }
        sb.append(" ");
        sb.append(s.substring(spaces[i-1]));

        return sb.toString();
    }

}
