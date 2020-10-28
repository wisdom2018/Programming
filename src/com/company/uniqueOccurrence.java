package com.company;

import java.util.*;

public class uniqueOccurrence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countNumberAppearTimes(arr));
    }

    public static boolean countNumberAppearTimes(int[] arr) {
        boolean result = false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm.values());
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> x : hm.entrySet()) {
            set.add(x.getValue());
        }
        if(hm.values().size() == set.size())
            result = true;
        return result;
    }
}