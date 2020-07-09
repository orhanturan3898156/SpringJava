package Day54_Maps;

public class NOTES {
    /*
    06/29/2020

Topic: Maps

	   Garbage Collection
	   StringBuffer &
	   enum


Package name: day54_Maps

	Array (fixed, primitives & objects)
	Collection (dynamic, only objects)
	Map (dynamic, only objects)



	String[] name ={}
	Double[] salary = {};

	List<String> name = new ArrayList<>();
	List<Double> salary = new ArrayList<>();

	Map<String, Double>


Map Interface: accepts key and value. cannot be primitives.
				key MUST be unique



Map methods:
	put(key, value): inserts key and value to map

	get(key): returns the value of the given key

	remove(key): removes the given key and it's value from the map

	size():

	containsKey(key): checks if the key is contained in the map. boolean

    containsValue(Value): checks if the value is contained in the map. boolean

    clear(): clears everything

    isEmpty(): boolean

    keySet(): returns all the keys from the map as Set

    values(): returns all the values from the map as Collection

    entrySet(): create an Entry

    Entry<Key, Value>:
    		getKey(): returns the key from the Entry
    		getValue(): returns the value from the entry



// task:
	create a map and store your classmate' names and birthday


	create a map that conatins student names and Score
										String    Integer

									put 5 students names and thier scores

			write a program that can print out the names of the students who scored less than 90


HashMap: does not keep the insertion order
		accepts null


HashTable: is synchronized, thread-safe ==> one thread at a time
			slower
			does not accept null


LinkedHashMap: keeps the insertion order as it's.
			put & remove are faster
			accepts null

TreeMap: sorts the keys in ascending
		does not accept null





String vs StringBuilder vs StringBuffer:

		String: Immutable version char sequences

		StringBuilder: mutable version char sequences, not synchronized

		StringBuffer: mutable version char sequences, synchronized , thread-safe, slow



enum:


     */
}
