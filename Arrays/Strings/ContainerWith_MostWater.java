public class ContainerWith_MostWater {
    public static int StoreWater(int height[]){
        int maxWater=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int ht=Math.min(height[i],height[j]);
                int width=j-i;
                int currWater=ht*width;

                maxWater=Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        int height[]= {1,8,6,2,5,4,8,3,7};

        System.out.println(StoreWater(height));
    }
}
