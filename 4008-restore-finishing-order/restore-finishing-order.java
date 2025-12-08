class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i<order.length ; i++){

            for(int j=0 ; j<friends.length ; j++){
                if(friends[j]==order[i]){
                    res.add(friends[j]);
                    break;
                }

            } 
        }
        return res.stream().mapToInt(Integer::intValue).toArray();

    }
}