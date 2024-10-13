public class ReverseBit {
    public static int reverseBit(int n){
        int ans=0;
        int bitMask=1;

        for(int i=0;i<32;i++){
            if((n&bitMask)!=0){
              ans+=1<<31-i;
            }
            bitMask<<=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n= 0b0000010100101000001111010011100;

        System.out.println(reverseBit(n));
    }
}
