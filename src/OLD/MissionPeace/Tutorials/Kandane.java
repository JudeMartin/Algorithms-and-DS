package OLD.MissionPeace.Tutorials;

public class Kandane {
    public int getContigousArraySum(int [] arr){
		if(arr == null || arr.length == 0){
			return 0;
		}
	int currentSum = 0;
	int maxSum = 0;
     	for(int i = 0;i < arr.length;i++){
		currentSum += arr[i]; /* keep adding the sum */
		if(currentSum < 0){
			currentSum = 0; /* reset */
		} else{
		      maxSum = Math.max(maxSum,currentSum); /* update max sum */
		}
	}
	return maxSum;
    }
	public static void main(String[] args){
	  Kandane k = new Kandane();
	  int arr[] = {-2,-3,4,-1,-2,1,5,-3};
	  System.out.println("The Max contiguous sum in the array is: " 
		 + k.getContigousArraySum(arr));	
	}
}
