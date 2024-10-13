public class NumberOf_OneBit {
    public static int NumberOfBit(int n){
        int ans=0;
        int bitMask=1;
        for(int i=0;i<32;i++){
            if((n&bitMask)!=0){
                ans++;
            }
            bitMask<<=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=11;

        System.out.println(NumberOfBit(n));
    }
}
