public class O4_Left_Recursion {


    public static void removeLeftRecursion(String s)
    {
        char[] ch = s.toCharArray();

        for(int i = 0; i<ch.length;i++){
            if (ch[i]=='-'){
                if(ch[i-1]==ch[i+1]){
                    System.out.println(ch[i-1]+"-"+ch[s.indexOf('|')+1]+ch[i-1]+"'");
                    System.out.println(ch[i-1]+"'"+"-"+ch[s.indexOf('|')-1]+ch[i-1]+"'"+'|'+"E");

                }
            }
        }
    }

    public static void main(String[] args) {
        removeLeftRecursion("A-Aa|b");
    }
}
