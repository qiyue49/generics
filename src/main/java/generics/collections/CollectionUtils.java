package generics.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Title:CollectionUtils
 * Created on : 2025-08-13 11:53
 * Description:
 *
 * @author zhangyuanpeng
 * @version 0.0.1
 */
public class CollectionUtils<T> {
    
    public List<T> listCopy(Collection<T> collection) {
        List<T> newCollection = new ArrayList<>();
        for(T t : collection) {
            newCollection.add(t);
        }
        return newCollection;
    }
    
    
    public List<T> listCopyTwo(Collection<? extends T> collection) {
        List<T> newCollection = new ArrayList<>();
        for(T t : collection) {
            newCollection.add(t);
        }
        return newCollection;
    }
    
    
    public static void main(String[] args) {
        CollectionUtils<Number> collectionUtils = new CollectionUtils<>();
        CollectionUtils<String> stringCollectionUtils = new CollectionUtils<>();
        List<Number> numbers = new ArrayList<Number>();
        numbers.add(1);
        numbers.add(2.1);
        
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        
        List<Number> listNew = collectionUtils.listCopy(numbers);
        System.out.println(listNew.toString());
        List<Number> listInteger = collectionUtils.listCopyTwo(integers);
        System.out.println(listInteger.toString());
        List<String> stringList = stringCollectionUtils.listCopy(strings);
        System.out.println(stringList.toString());
//        List<String> stringsNew = collectionUtils.listCopy(strings);
        
        
    }
    
}
