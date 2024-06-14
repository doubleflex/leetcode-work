class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray(),
        		tArr = t.toCharArray();
		Arrays.sort(sArr);
		Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}