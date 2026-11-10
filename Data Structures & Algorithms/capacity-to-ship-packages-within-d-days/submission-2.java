class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for(int weight: weights){
            left = Math.max(left, weight);
            right += weight;
        }
        while(left<right){
            int mid = left+(right-left)/2;
            int reqDays = 1;
            int currLoad = 0;

            for(int weight: weights){
                if(currLoad + weight > mid){
                    reqDays++;
                    currLoad=0;

                }
                currLoad += weight;
            }
            if(reqDays<=days){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;



        
       
        
    }
}