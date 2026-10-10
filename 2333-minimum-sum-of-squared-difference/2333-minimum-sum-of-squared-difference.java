class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int maxDiff = 0;
        long totalOperations = (long) k1 + k2;

        for (int i = 0; i < nums1.length; i++) {
            maxDiff = Math.max(maxDiff, Math.abs(nums1[i] - nums2[i]));
        }

        int[] freq = new int[maxDiff + 1];

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
        }

        for (int diff = maxDiff; diff > 0 && totalOperations > 0; diff--) {
            if (freq[diff] == 0) continue;

            long reduce = Math.min(totalOperations, freq[diff]);

            freq[diff] -= reduce;
            freq[diff - 1] += reduce;

            totalOperations -= reduce;
        }

        long answer = 0;

        for (int diff = 1; diff < freq.length; diff++) {
            answer += (long) diff * diff * freq[diff];
        }

        return answer;
    }
}