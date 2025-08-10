import java.util.PriorityQueue;

public class Dailytemperatures {
     public static int[] dailyTemperatures(int[] temperatures) {
       int n = temperatures.length;
        int[] result = new int[n];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && temperatures[i] > queue.peek()[0]) {
                int[] cooler = queue.poll();
                int coolerTemp = cooler[0];
                int coolerIndex = cooler[1];
                result[coolerIndex] = i - coolerIndex;
            }
                queue.offer(new int[]{temperatures[i], i});
        }     
        return result;
         
    }
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        dailyTemperatures(temperatures);
    }
}
