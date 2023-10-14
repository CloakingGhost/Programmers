class Solution {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int numer = numer1 * denom2 + numer2 * denom1;
		int denum = denom1 * denom2;
		int min = numer < denum ? numer : denum;
		for (int i = min; i > 1; i--) {
			if (numer % i == 0 && denum % i == 0) {
				numer /= i;
				denum /= i;
				break;
			}
		}
		int[] answer = { numer, denum };
		return answer;
	}
}