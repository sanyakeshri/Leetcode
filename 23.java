// 349. Intersection of Two Arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Store all elements of nums1
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        // Find common elements
        for (int i = 0; i < nums2.length; i++) {

            if (set.contains(nums2[i])) {

                list.add(nums2[i]);      // Add to answer
                set.remove(nums2[i]);    // Remove so it isn't added again
            }
        }

        // Convert ArrayList to int[](Means:- LIST-->ARRAY)
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}