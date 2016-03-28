package 02 - Library

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapList<T,E>{
    private Map<T, ArrayList<E>> map = new HashMap<>();
   
    /* Insert item into List at a Key */
    /* If key is not avaliable create a new arrayList and add */
    public void put(T Key, E item);
    
    /* Insert List of Item's as the key  */
    /* Key and the ArrayList is passed  */
    public void put(T key, ArrayList<E> items);
   
    /* 	return the List at particular key  */
    public ArrayList<E> get(T key);			    

    /* check for value at a specific Key */
    public boolen containsKeyValue(T key, E item);
   
    /* return list of key's */
    public Set<T> keySet();

    /* To String() */
    public String toString();	
}
/* idea is to use a HashMap with key as given object and value as ArrayList of given object's */
