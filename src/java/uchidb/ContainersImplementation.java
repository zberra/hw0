package uchidb;
import java.util.*;

public class ContainersImplementation<T, S> implements Containers<T, S> {
    private Map<S,T> localMap = null;

    public Set<T> initSet(T[] tArray) {
        HashSet<T> mySet = new HashSet<T>();
        for (T item : tArray) {
            mySet.add(item);
        }
        return mySet;
    }

    public List<T> initList(T[] tArray) {
        ArrayList<T> myList = new ArrayList<T>();
        for (T item : tArray) {
            myList.add(item);
        }
        return myList;
    }

    public Map<S,T> initEmptyMap() {
        HashMap<S,T> myMap = new HashMap<S,T>();
        return myMap;
    }

    public void storeMap(Map<S,T> mapToStoreInClass) {
        localMap = mapToStoreInClass;
    }

    public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
        if (localMap.containsKey(key)) {
            if (overwriteExistingKey == false) {
                return false;
            }
        }
        localMap.put(key, value);
        return true;
    }

    public T getValueFromMap(S key) {
        return localMap.get(key);
    }

    public T getValueFromMap(S key, T defaultValue) {
        T v = localMap.get(key);
        if (key == null) {
            return defaultValue;
        }
        else {
            return v;
        }
    }
}