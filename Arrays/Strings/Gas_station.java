public class Gas_station {
    public static int gasStation(int gas[],int cost[]){
        int position=0,sum=0,total=0;
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            if(sum<0){
                total+=sum;
                sum=0;
                position=i+1;
            }
        }
        total+=sum;
        return total>=0?position:-1;
    }
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};

        System.out.println(gasStation(gas, cost));
    }
}
