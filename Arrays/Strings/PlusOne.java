
import java.util.Arrays;



public class PlusOne {
  public static int[] plus(int digit[]){
      int n=digit.length;
      for(int i=n-1;i>=0;i--){
        if(digit[i]<9){
            digit[i]++;
            return digit;
        }
        digit[i]=0;
      }
      int newNumber[]= new int[n+1];
      newNumber[0]=1;
      return newNumber;
  }
    public static void main(String[] args) {
        int digit[]={1,2,3};

        System.out.println(Arrays.toString(plus(digit)));
    }
}
