package practicejava;

public class twosum {
	public static void main (String args[]) {
		int[] nums = {2,7,11,15};
		int target=9;
		int temp;
		int[] arr= {};
        for(int i=0;i<nums.length-1;i++){
        	for(int j=i+1;j<nums.length-1;j++) {
        		int sum=nums[i]+nums[j];
        		if(sum==target) {
        			System.out.println( i +","+ j );
        			//System.out.println(j);
        			
        			
        		}
            
            	//System.out.println(sum);
            	//System.out.println(nums[i+1]);
            	
            
            }


        }
        }
        
		
	}

