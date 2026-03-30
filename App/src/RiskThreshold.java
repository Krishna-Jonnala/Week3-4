public class RiskThreshold {

    static int floor(int[] arr, int x) {
        int res = -1;
        for (int n : arr)
            if (n <= x) res = n;
        return res;
    }

    static int ceil(int[] arr, int x) {
        for (int n : arr)
            if (n >= x) return n;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};

        System.out.println("Floor(30): " + floor(arr, 30));
        System.out.println("Ceil(30): " + ceil(arr, 30));
    }
}