class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> list = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
            }
        }
        Iterator<Integer> it = list.iterator();
        int[] arr =new int[list.size()];
        int i=0;
        while(it.hasNext()){
            arr[i++]=it.next();
        }
        return arr;
    }
}