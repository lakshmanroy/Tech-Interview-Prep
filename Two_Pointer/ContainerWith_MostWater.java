public class ContainerWith_MostWater {
    public static int StoreWater(int height[]){
        int maxWater=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            int widht=right-left;

            int ht=Math.min(height[left],height[right]);
            int currWater=ht*widht;

            maxWater=Math.max(maxWater,currWater);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        int height[]= {1,8,6,2,5,4,8,3,7};

        System.out.println(StoreWater(height));
    }
}
