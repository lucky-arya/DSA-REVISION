public class ReverseEveryWordInString {
    public String reverseWords(String s) {
        String [] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for(String word : words){
            StringBuilder newWord = new StringBuilder(word);
            result.append(newWord.reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        ReverseEveryWordInString obj = new ReverseEveryWordInString();
        String s = "welcome to the jungle";
        System.out.println(obj.reverseWords(s));
    }
}