class Solution {
    public int nthUglyNumber(int n) {
        
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();

        pq.add(1L);
        set.add(1L);

        long num = 1;

        for (int i = 0; i < n; i++) {
            num = pq.poll();

            long a = num * 2;
            long b = num * 3;
            long c = num * 5;

            if (set.add(a)) {
                pq.add(a);
            }

            if (set.add(b)) {
                pq.add(b);
            }

            if (set.add(c)) {
                pq.add(c);
            }
        }

        return (int) num;

    }
}