/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.j.course.hashtable;

/**
 *
 * @author Shady.Salah
 */
public class HashTableInfo {

    /*
     HashTable:
        
     1: is Abstract Data Type likes Stack & Queue.
     2: provides access to data using keys.
     3: Key dosen't be an integer.
     4: Consists of key/value pairs - data types don't have to match.
     5: optmized for retrivale => get the data by it's keys so quikly else it'll be slow if u don't know the key. { when you know the key }.
     6: Assocative array [like in php] is one type of hash table that can use string as key 
     but in java [index] is integer and hashtable keys don't have be integer.
     
    7: synchronized and thread save so it's lowerperformance than hashmap
    8: it dosen't allow any null keys or value.
    
    
     Hashing:
    
     1: .. Maps keys of any data type to an integer.
     2: In Java, hash function is Object.hashCode();
     3: Collision occurs when more than one value has the same hashed value.
     4: example : store username and use it as a lookup for profiles.
    
    
    
     Load Factor:
    
     1: tell us how full the hash table is ... [check if it full or what]
     2: Laod factor = #items / capasity = size / capasity
     3: Load Factor is used to decide when to resize the array backing the hash table.
     4: Don't want Load Factor too low (Lots of empty slots ).
     5: Don't want Load Factor too high (will increase the likelihood of collsions ).
     6: Can play the role in determinning the time complexity for rertival.
    
    
    
     Add to hash table backed by array
    
     1: provide a paire key/value.
     2: use hash function to map the key to an int value.
     3: store the value at the hashed key value - this is the index into the array.
   
     For Example :  Add "Jane Jones" with key of "Jones"
     2: use a hash function to map "Jones" to an int - let's assume we get the vaue 4
     3: Store "Jane Jones" at array[4]
    
    
 
    
     retrive avalue from hash table
   
     1: provide the key
     2: use the same hash function to map the key to an int value.
     3: retrive the value stored at the hash key value.
   
     For Example :  retrivethe employee with key "Jones"
     2: use the same hash function to map "Jones" to an int - let's assume we get the vaue 4
     3: retrive the value at array[4]=> "Jane Jones"
 
    
    
     */
}
