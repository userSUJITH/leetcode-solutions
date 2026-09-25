class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] arr = new int[2];
        arr[0]=Count(nums1,nums2);
        arr[1]=Count(nums2,nums1);
        return arr;
    }
     public static int Count(int[] a, int[] b) {

        int count = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                count++;
            }
        }

        return count;
    }
}