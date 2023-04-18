class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> res=new ArrayList<>();
        for(int i:candies){
            if(i>=max) max=i;
        }
        for(int j=0;j<candies.length;j++){
            if((candies[j]+extraCandies)>=max) res.add(true);
            else res.add(false);
        }
        return res;
    }
}