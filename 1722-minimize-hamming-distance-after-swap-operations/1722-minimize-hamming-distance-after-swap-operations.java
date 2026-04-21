import java.util.*;

class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        UnionFind uf = new UnionFind(n);

        for (int[] swap : allowedSwaps) {
            uf.union(swap[0], swap[1]);
        }

        Map<Integer, List<Integer>> groups = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int parent = uf.find(i);
            groups.computeIfAbsent(parent, k -> new ArrayList<>()).add(i);
        }

        int hammingDistance = 0;

        for (List<Integer> group : groups.values()) {
            Map<Integer, Integer> freq = new HashMap<>();

            for (int index : group) {
                freq.put(source[index], freq.getOrDefault(source[index], 0) + 1);
            }

            for (int index : group) {
                if (freq.getOrDefault(target[index], 0) > 0) {
                    freq.put(target[index], freq.get(target[index]) - 1);
                } else {
                    hammingDistance++;
                }
            }
        }

        return hammingDistance;
    }
}

class UnionFind {
    int[] parent;

    public UnionFind(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    public int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px != py) parent[px] = py;
    }
}