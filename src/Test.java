import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashSet<Character> set1 = new HashSet();
        set1.add('A');
        set1.add('B');
        HashSet<Character> set2 = new HashSet();
        set2.add('B');
        set2.add('C');

        System.out.println(ExtendsHashSet.union(set1,set2));
        System.out.println( ExtendsHashSet.intersect(set1,set2));
        System.out.println(ExtendsHashSet.minus(set1,set2));
        System.out.println(ExtendsHashSet.difference(set1,set2));
        System.out.println(" ");
        System.out.println(set1);
        System.out.println(set2);
    }

}
