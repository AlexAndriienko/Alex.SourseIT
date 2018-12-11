package ua.com.sourceit.AndriienkoHomework.HW11;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HW11_LRUcache<K, V> extends LinkedHashMap<K, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	LinkedHashMap<K, V> lruCacheMemory = new LinkedHashMap<K, V>();
	private static int MAX_CACHE = 10;

	public void putSomeDataToCache(K key, V value) {
		lruCacheMemory.put(key, value);
	}

	public V getSomeDataFromCache(K key) {
		if (lruCacheMemory.containsKey(key)) {
			return lruCacheMemory.get(key);
		} else {
			return null;
		}

	}
	
	@Override
	protected boolean removeEldestEntry(Entry<K, V> eldest) {
		return size() > MAX_CACHE;
	}
	
}

	