public class Ransom_Note {
    public static boolean canConstruct(String ransomNote,String magazine){
        int count[]= new int[26];
        for(char ch:magazine.toCharArray()){
            count[ch -'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            count[ch -'a']--;
            if(count[ch -'a']<0){
              return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";

        System.out.println(canConstruct(ransomNote, magazine));

    }
}
