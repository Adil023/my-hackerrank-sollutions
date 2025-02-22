public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }


}
