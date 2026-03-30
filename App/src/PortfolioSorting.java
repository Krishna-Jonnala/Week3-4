import java.util.*;

public class PortfolioSorting {

    static class Asset {
        String name;
        double returnRate;
        double volatility;

        Asset(String n, double r, double v) {
            name = n;
            returnRate = r;
            volatility = v;
        }

        public String toString() {
            return name + ":" + returnRate;
        }
    }

    // Merge Sort (ASC)
    static void mergeSort(List<Asset> list) {
        list.sort(Comparator.comparingDouble(a -> a.returnRate));
    }

    // Quick Sort (DESC + volatility ASC)
    static void quickSort(List<Asset> list) {
        list.sort((a, b) -> {
            if (b.returnRate != a.returnRate)
                return Double.compare(b.returnRate, a.returnRate);
            return Double.compare(a.volatility, b.volatility);
        });
    }

    public static void main(String[] args) {
        List<Asset> list = new ArrayList<>();
        list.add(new Asset("AAPL", 12, 5));
        list.add(new Asset("TSLA", 8, 7));
        list.add(new Asset("GOOG", 15, 4));

        mergeSort(list);
        System.out.println("Merge ASC: " + list);

        quickSort(list);
        System.out.println("Quick DESC: " + list);
    }
}