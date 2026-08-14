class Solution {
    public int[] twoSum(int[] numbers, int target) {

        //BY USING HASHMAP

        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i=0;i<numbers.length;i++){
            
        //     int find = target - numbers[i];

        //     if(map.containsKey(find)){
        //         return new int[] {map.get(find)+1,i+1};
        //     }
        //     map.put(numbers[i],i);
        // }
        // return new int[] {};


        //BY USING TWO POINTER

        int start = 0;
        int end = numbers.length-1;

        while(start < end){
            int sum = numbers[start] +numbers[end];

            if(sum == target){
                return new int[] {start+1,end+1};
            }
            else if(sum < target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[] {};
    }
}
