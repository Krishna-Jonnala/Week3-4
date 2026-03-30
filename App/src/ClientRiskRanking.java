import java.util.*;

public class ClientRiskRanking {

    static class Client {
        String name;
        int risk;
        double balance;

        Client(String n, int r, double b) {
            name = n;
            risk = r;
            balance = b;
        }

        public String toString() {
            return name + ":" + risk;
        }
    }

    static void bubbleSort(Client[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j].risk > arr[j + 1].risk) {
                    Client t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].risk < key.risk) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("A", 20, 1000),
                new Client("B", 50, 2000),
                new Client("C", 80, 500)
        };

        bubbleSort(arr);
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}