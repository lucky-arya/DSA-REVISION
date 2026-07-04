public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canEatAll(int[] piles, int h, int speed) {
        int hoursSpent = 0;
        for (int pile : piles) {
            hoursSpent += Math.ceil((double) pile / speed);
        }
        return hoursSpent <= h;
    }

    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    public static void main(String[] args) {
        KokoEatingBananas koko = new KokoEatingBananas();
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int result = koko.minEatingSpeed(piles, h);
        System.out.println(result);
    }
}