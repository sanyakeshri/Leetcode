// 350 : Intersection of Two Arrays II

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            for (int i = 0; i < nums2.length; i++) {
                if (num == nums2[i]) {
                    list.add(num);
                    nums2[i] = -1;
                    break;
                }
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}