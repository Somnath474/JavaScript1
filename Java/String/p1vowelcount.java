public class p1vowelcount {
    public static int vowel(String text){
        int count=0;
        String vowel="aeiou";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(vowel.indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    } 
    public static void main(String[] args) {
        String text="Hello";
        System.out.println(vowel(text));
    }
}
