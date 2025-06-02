class Solution {
    public int minOperations(int[] nums, int k) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int count=0;
        if(total%k !=0){
            int rem=total%k;
            if(total<rem){
                for(int i=0;i<nums.length;i++){
                    nums[i]=0;
                }
                return total;
            }
            else{
                int index=0;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]>rem){
                        index=i;
                        break;
                    }
                }
                System.out.println("index : "+index);
                if(index>0){
                    nums[index]-=rem;
                    count=rem;
                }
                else{
                    while(rem!=0 && index<nums.length){
                        rem-=1;
                        nums[index]-=1;
                        count+=1;
                        if(nums[index]==0){
                            index++;
                        }
                    }
                }
                return count;
            }
        }
        return 0;
    }
}
