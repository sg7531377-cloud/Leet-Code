
class Ques_2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            if (words.length > max) {
                max = words.length;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Ques_2114 obj = new Ques_2114();
        String[] sentences = {"I love coding", "Java is very easy to learn", "Hello world"};
        int result = obj.mostWordsFound(sentences);
        System.out.println("Maximum words: " + result);
    }
}
