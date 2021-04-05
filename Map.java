//type - hashmap, treemap sorted order, linkedhashmap insertion order fixed, hashtable
//some important method below
/*
public boolean isEmpty()
public boolean containsKey(Object key)
public void clear()
public boolean containsValue(Object value)
public Collection<V> values()
public Set<Map.Entry<K,V>> entrySet()
public V putIfAbsent(K key, V value)
public boolean remove(Object key, Object value)
public boolean replace(K key, V oldValue, V newValue)
public V replace(K key, V value)
public void forEach(BiConsumer<? super K,? super V> action)
*/
//some important code snippet
/*
map.forEach( (k,v) -> [do something with key and value] );

*/
import java.util.*;
public class Map
{
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, map.getOrDefault(3, 0)+30);
        for(int num: map.keySet())System.out.println(num+" "+map.get(num));
        System.out.println(map.size()+" "+map.remove(1));
	}
}
