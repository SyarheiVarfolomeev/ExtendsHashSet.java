import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ExtendsHashSet extends HashSet {

    private ExtendsHashSet() {
    }

    public static HashSet union(HashSet hashSet1, HashSet hashSet2){
        HashSet hashSet = new HashSet(hashSet1);
        hashSet.addAll(hashSet2);
        return hashSet;
    }

    public static HashSet intersect(HashSet hashSet1, HashSet hashSet2){
        HashSet hashSet = new HashSet(hashSet1);
        hashSet.retainAll(hashSet2);
        return hashSet;
    }

    public static HashSet minus(HashSet hashSet1, HashSet hashSet2){
        HashSet hashSet = new HashSet(hashSet1);
        hashSet.removeAll(hashSet2);
        return hashSet;
    }
    public static HashSet difference(HashSet hashSet1, HashSet hashSet2){
        HashSet hashSet11 = new HashSet(hashSet1);
        HashSet hashSet22 = new HashSet(hashSet2);
        hashSet11.addAll(hashSet2);
        hashSet22.retainAll(hashSet1);
        hashSet11.removeAll(hashSet22);
        return hashSet11;
    }

}
