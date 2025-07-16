import java.util.*;

class RandomizedSet {
    private HashMap<Integer, Integer> map;
    private ArrayList<Integer> list;
    private Random rand;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int idx = map.get(val);
        int last = list.get(list.size() - 1);
        list.set(idx, last);
        map.put(last, idx);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int idx = rand.nextInt(list.size());
        return list.get(idx);
    }

    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        System.out.println(set.insert(10));
        System.out.println(set.insert(20));
        System.out.println(set.insert(30));
        System.out.println(set.remove(20));
        System.out.println(set.getRandom());
        System.out.println(set.remove(40));
        System.out.println(set.insert(10));
        System.out.println(set.remove(10));
        System.out.println(set.getRandom());
    }
}
