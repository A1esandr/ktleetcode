class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                val first = map.get(complement)
                if (first != null) {
                    return intArrayOf(first, i)
                }
            }
            map.put(nums[i], i)
        }
        throw IllegalArgumentException("No two sum solution");
    }
}