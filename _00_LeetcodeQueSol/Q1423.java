package _00_LeetcodeQueSol;

public class Q1423 {
    public static void main(String[] args) {

    }

    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int maxScore = 0;

        // Sum the first k elements in our window
        for (int i = 0; i < k; i++) {
            maxScore += cardPoints[i];
        }

        int currentScore = maxScore;
        for (int i = k - 1; i >= 0; i--) {
            // We remove the last visited element and add the non-visited element from the end
            currentScore -= cardPoints[i];
            currentScore += cardPoints[n - k + i];


            // We check the maximum value any possible combination can give
            maxScore = Math.max(maxScore, currentScore);
        }

        return maxScore;
    }

}
