public class Palindrome {
    public static boolean isPalindrome(int x){
        String str=String.valueOf(x);
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int x=121;

        System.out.println(isPalindrome(x));
    }
}
