import java.util.Comparator;

public class ComparatorNode {
    
    public static Comparator<Integer> comparatorInt = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    };
}
