public class IsSubsequence {
    public static boolean IsSubsequence(String s,String t){
        if(s.length()==0){
            return  true;
        }
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
         if(s.charAt(i)==s.charAt(j)){
            i++;
            j++;
         }
         else{
            j++;
         }
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="abc";
        String t= "ahbgdc";

        System.out.print(IsSubsequence(s, t));

    }
}
