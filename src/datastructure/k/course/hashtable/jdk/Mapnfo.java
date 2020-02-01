/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.k.course.hashtable.jdk;

/**
 *
 * @author Shady.Salah
 */
public class Mapnfo {

    /*
    
     public interfaace Map<k,v>
   
     1: IS the primary interfase for hashtable. 
     2: Is An object that map keys to values.
     3: can't contain duplicate keys, each key can map to at most one value. that means there 's no collision.
     => if we duplicate ket , the secand will be replaced with the first.
   
     4: imp for it : ConcurrentHashMap, CouncurrentNavigableMap, HashMap, NavigableMap, HashTable
    
    
    
     HashMap:
    
     0: ++
     1: public class HashMap<K,V> extends AbstractMap<K,V>
        implements Map<K,V>, Cloneable, Serializable {
    
     2: provides all options of map operations.
    
     3: Unorder element.
    
     3: allow null values and only one null key.
    
     4: constant time performance O(1) : add & get
    
    5: 2 parameter affect on it's performance intial capacity & loadfactor
    => 1: intial capacity is the capacity at time hashmap ic ceated. = 16
    => 2: loadfactor is the measure of how full the hastable is allowd to get before its capacity is automatoicly increase.
    => 3: defult load factor is 0.75
    => 4: threadshold = (current capacity * load factor)
    
    
    6: Is not sebchronized (not htread save) so it's performance is better that hachtable.
    
    
    
    
    LinkedHashMap
    
    7: Imp for HshMap is LinkedHashMap 
    
    => HshMap & LinkedHashMap is imp for interfcae Map<k,v>
    => The more factor for LinkedHashMap is InsertionOrder.
    => InsertionOrder isn't affected if a key re-inserted into the map.
    => Also LinkedHashMap isn't senchronized but we can do that by Map = Collections.synchronizedMap(newLinkedHashMap(...) )
    => all method most methods will be the same between HshMap & LinkedHashMap becouse they implment same interface MAp<k,v>
    
    =>but there is new a method in LinkedHashMap => removeEldestEntry() : map remove oldest enterys every time you add new one.
    For ex : we can use it for implmention of cach.
    
    
    
    
    HashTable:
    
    0: go to it's file first.
    1: not alllow to add nullkey value.
    2: is Synchronized so it's performance is lower than hashmap. becouse Synchroniztion comes with overhead.
    => if you don't need Synchroniztion then you don't need to use hashtable.  {same situation of LinkedList & Vector}
    
    
    
    ConcurrentHashMAp:
    
    1: it is an imp for interface Map<k,v>
    2: is a synchronize imp
    3: support full concurrency of retrivales and high expected concurrency for update.
    4: don't provide lock in case a ?!!!!
    
    
     */
}
