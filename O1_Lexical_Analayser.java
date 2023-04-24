public class O1_Lexical_Analayser {


    public static void simplefindAnalyser(String s){
        char ch[] = s.toCharArray();
        String w = "";

        for (char c: ch){
            if (c!=32){
                if(Character.isLetter(c)){
                    System.out.println("Indentifier - "+c);
                }
                else if(Character.isDigit(c)){
                    System.out.println("Constant - "+c);
                }
                else if(!Character.isLetterOrDigit(c)){
                    System.out.println("Operator - "+c);
                }
            }
        }
    }
    public static void main(String[] args) {
        simplefindAnalyser("a = 3 * 4");
    }
}
