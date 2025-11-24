class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var l = 0
        var i = 0
        while (i < t.length && l < s.length) {
            if (s.get(l) == t.get(i)) l++
            i++
        }
        return l == s.length
    }
}