package Problem_of_the_Day;

public class Solution {
	 public static int totalCuts(int N, int K, int[] A) {
	        // code here
	        int count=0;
	        int leftMax=A[0];
	        int[] rightMin = new int[N];
	        rightMin[N - 1] = A[N - 1];
	        for (int i = N - 2; i >= 0; i--) {
	            rightMin[i] = Math.min(rightMin[i + 1], A[i]);
	        }
	        for (int i = 0; i < N - 1; i++) {
	            leftMax = Math.max(leftMax, A[i]);
	            if (leftMax + rightMin[i + 1] >= K) {
	                count++;
	            }
	        }
	        return count;
	 }
}
