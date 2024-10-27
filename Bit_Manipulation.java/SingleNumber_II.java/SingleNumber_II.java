// package Bit_Manipulation.java.SingleNumber_II.java;
public class SingleNumber_II {
    public static int singleNumber(int nums[]){
        int ones=0,twos=0;
        for(int num:nums){
            ones=(ones^num) & ~twos;
            twos=(twos^num)& ~ones;
        }
        return ones;
    }
    public static void main(String[] args) {
        int nums[]={2,2,3,2};

        System.out.println(singleNumber(nums));
    }
}
