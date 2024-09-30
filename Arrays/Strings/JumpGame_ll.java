public class JumpGame_ll {
    public static int canJump(int nums[]){
        int jump=0,currEnd=0,possibleMax=0;
        for(int i=0;i<nums.length-1;i++){
            possibleMax=Math.max(possibleMax, i+nums[i]);
            if(i==currEnd){
                jump++;
                currEnd=possibleMax;
            }
        }
        return jump;
    }
    public static void main(String[] args) {
        int nums[]= {2,3,1,1,4};

        System.out.println(canJump(nums));
    }
}
