public class FirstOccurence {
    public static int strstr(String haystack,String needle){
        return haystack.indexOf(needle);
    }
    public static void main(String args[]){
        String haystack="sadbutsad";
        String needle="sad";

        System.out.println(strstr(haystack, needle));
    }
}
