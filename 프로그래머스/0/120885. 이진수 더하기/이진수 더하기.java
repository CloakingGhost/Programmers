class Solution {
    public String solution(String bin1, String bin2) {
        int castBin1 = Integer.parseInt(bin1, 2);
        int castBin2 = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(castBin1 + castBin2);
    }
}