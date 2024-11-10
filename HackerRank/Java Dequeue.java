    import java.util.*;
    public class test 
    {
        public static void main(String[] args) 
        {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int maxUnique = 0;
            for (int i = 0; i < n; i++) 
            {
                int num = in.nextInt();
                deque.add(num);
                if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
                } else {
                    freqMap.put(num, 1);
                }
                if (deque.size() > m) {
                    int removed = deque.remove();
                    if (freqMap.get(removed) == 1) {
                        freqMap.remove(removed);
                    } else {
                        freqMap.put(removed, freqMap.get(removed) - 1);
                    }
                }
                if (deque.size() == m) {
                    maxUnique = Math.max(maxUnique, freqMap.size());
                }
            }
            System.out.println(maxUnique);
            in.close();
        }
    }
