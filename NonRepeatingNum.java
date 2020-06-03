
public class NonRepeatingNum {
	 public int singleNumber(int[] arr)
	 {
	        int size = arr.length;
	        int temp = 0;
	        int result = 0;
	        boolean flag = true;
	        int[] arr = new int[size];

	        for(int i=0;i<size;i++){
	            temp = arr[i];
	            for(int j=0;j<size;j++){
	                if(temp == arr[j]){
	                    if(i != j)
	                    //System.out.println("Match found for "+temp);
	                    flag = false;
	                    break;
	                }
	            }
	        }
	        return result;
	    }

	public static void main(String[] args) {
		 int[] a = {1,1,3,2,3};
	        NonRepeatingNum Nrm = new NonRepeatingNum();

	        System.out.println("SINGLE NUMBER : "+Nrm.singleNumber(a));
		

	}

}
