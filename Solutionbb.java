import java.util.*;

public class Solutionbb {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,4,5,6,6,7,7,8,9,9,9,0009,8,8};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Printing the frequency of ea ch element
         
        }
    }
}
