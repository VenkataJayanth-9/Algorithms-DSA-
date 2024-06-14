public class MaxMin {
    static class Pair {
        int min;
        int max;
        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    static Pair Algorithm(int[] array, int low, int high) {
        if (low == high) {
            return new Pair(array[low], array[low]);
        } else if (high - low == 1) {
            int minValue = Math.min(array[low], array[high]);
            int maxValue = Math.max(array[low], array[high]);
            return new Pair(minValue, maxValue);
        } else {
            int mid = (low + high) / 2;
            Pair left = Algorithm(array, low, mid);
            Pair right = Algorithm(array, mid + 1, high);

            int maxValue = Math.max(left.max, right.max);
            int minValue = Math.min(left.min, right.min);

            return new Pair(minValue, maxValue);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 99, 12, 18, 9, 19};
        int size = array.length;
        Pair result = Algorithm(array, 0, size - 1);
        System.out.println("MaxValue : " + result.max);
        System.out.println("MinValue : " + result.min);
    }
}