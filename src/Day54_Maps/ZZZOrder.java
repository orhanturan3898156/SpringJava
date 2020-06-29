package Day54_Maps;

public class ZZZOrder {
    /*

    Map_Intro
    Practice
    Set Entries
    Map_SetEntries
    Garbage_Collector -finalize
    String_VS_Buffer_VS_Builder

    enum-Test
    browsers-test



    MAPS
    -Only takes objects and size is dynamic.
    -Difference with Collection and Maps:
      -Map is collection of Pair.
      -If you want to store employee's name and salary with String and double, normally we cannot store in the same variable.
      List<String> name=new ArrayList<>();
      List<Double> salary=new ArrayList<>();

     ***  MAP:You can store different types of data in the same place.
     Map<String, Double>
          Key, Value >>> they must be object.
     Map Interface:they must be object.

     Map<String, Double> employeeInfo=new LinkedHashMap<>();
     Then, we use  put(key, value). method to add those data.

     Map doesn't have index number. we should give the key to retrive the data.
     --get(Key)--> to retrive any value.
     --remove(Key) --> to remove any object

     NOTE: map doesn't accept duplicate Key value.

     ContainsKey()--checks if value and key contains or not.
     clear():removes all objects.
     isEmpty(): it checks if it is empty or not.returns boolean.

     keySet(): returns all the key as Set.
     values(): returns all values from the map as collection
     setEntry():


     Entry <Key, Value>
        getKey():returns key
        getvalue=returns value

---------------------------
HashMap: accepts "null" .do not keeps the insertion as it is

HashTable: is synchronized.slower.Thread Safe.=>one thread at the time.
Thread is the process of scheduling objects' order. does not accept "null".

LinkedHashMap:keeps the insertion as it is. adding(put) and removing is faster

TreeMap:sorts the Keys in ascending order.does not accept "null".











     */
}
