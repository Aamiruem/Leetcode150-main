// package L1ArrayString;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Random;

// public class Q380RandomizedSet {

//     private ArrayList<Integer> list;
//     private Map<Integer, Integer> map;

//     public Q380RandomizedSet() {
//         list = new ArrayList<>();
//         map = new HashMap<>();
//     }

//     public boolean search(int val) {
//         return map.containsKey(val);
//     }

//     public boolean insert(int val) {
//         if (search(val)) return false;

//         list.add(val);
//         map.put(val, list.size() - 1);
//         return true;
//     }

//     public boolean remove(int val) {
//         if (!search(val)) return false;

//         int index = map.get(val);
//         list.set(index, list.get(list.size() - 1));
//         map.put(list.get(index), index);
//         list.remove(list.size() - 1);
//         map.remove(val);

//         return true;
//     }

//     public int getRandom() {
//         Random rand = new Random();
//         return list.get(rand.nextInt(list.size()));
//     }

//     public static void main(String[] args) {
//         Q380RandomizedSet randomizedSet = new Q380RandomizedSet();
//         // int size[] = {}"RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"};
//         randomizedSet.insert(1);
//         randomizedSet.remove(2);
//         randomizedSet.insert(2);
//         System.out.println(randomizedSet.getRandom());
//         randomizedSet.remove(1);
//         randomizedSet.insert(2);
//         System.out.println(randomizedSet.getRandom());
//     }
// }






package L1ArrayString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q380RandomizedSet {
    Set<Integer> s;
    List<Integer> arr;
    public Q380RandomizedSet() {
        s = new HashSet<>();
        arr = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (!s.contains(val)) {
            s.add(val);
            arr.add(val);
            return true;
        }
        return false;
    }
    public boolean remove(int val) {
        if (s.contains(val)) {
            s.remove(val);
            arr.remove((Integer)val);
            return true;
        }
        return false;
    }  

    public int getRandom() {
        int n = arr.size();
        int rnd = (int) (Math.random() * n);
        return arr.get(rnd);
    }
    public static void main(String[] args) {
        Q380RandomizedSet obj = new Q380RandomizedSet();
        obj.insert(1);
        obj.remove(2);
        obj.insert(2);
        System.out.println(obj.getRandom());
        obj.remove(1);
        obj.insert(2);
        System.out.println(obj.getRandom());

    }
}
