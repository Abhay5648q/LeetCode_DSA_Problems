class FruitBasketMatcher {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int remains = 0;
        int n = fruits.length;
        boolean[] use = new boolean[n];

        for (int i = 0; i < n; i++) {
            boolean place = false;
            for (int j = 0; j < n; j++) {
                if (!use[j] && fruits[i] <= baskets[j]) {
                    use[j] = true;
                    place = true;
                    break;
                }
            }
            if (!place) {
                remains++;
            }
        }
        return remains;
    }

    public static void main(String[] args) {
        // Sample test case
        int[] fruits = {5, 3, 5};
        int[] baskets = {3, 2, 4};

        FruitBasketMatcher matcher = new FruitBasketMatcher();
        int unplaced = matcher.numOfUnplacedFruits(fruits, baskets);

        System.out.println("Number of unplaced fruits: " + unplaced);
    }
}

