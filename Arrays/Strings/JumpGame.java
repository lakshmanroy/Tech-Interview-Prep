public class JumpGame {
    public static boolean  canJump(int nums[]){
        int currentdest=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
          if(nums[i]+i>= currentdest){
            currentdest=i;
          }
        }
        if(currentdest==0){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int nums[]= {2,3,1,1,4};

        System.out.println("jumps: "+canJump(nums));
    }
}
