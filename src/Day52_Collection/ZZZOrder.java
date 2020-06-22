package Day52_Collection;

public class ZZZOrder {
    /*
    Data Structures: in order to manage the data efficiently and in an organized manner.

     1-Array : it is for storing data. Size is fixed in Array,but dynamic in ArrayList.
     2-Collection: Size is "Dynamic".
     3-Map

         Array:                                  ArrayList
     1-Fixed Size                              Dynamic Size
     2-Support primitives and Objects          Only Objects
     3-Can be multi-dimensional                Not multi dimensional
     4-Has Index,accept duplication            Has Index,accept duplication


     Collection (Collection Framework):
     -Main reason we need it is
       1-Its size is dynamic.
       2-Hold different type data

     Collections Framework: consists of multiple interfaces.Each interfaces has multiple implementations.
     -All the classes nad interfaces are presented in "java.util"
     Iterable(I):root interface.super type of all interfaces in collections framework.
     Collection(I):extended by List(I),Set(I),Queue(I).

    -------------------------------------------------------------------------------------------------------------------------
    List(I): implemented by ArrayList(C),LinkedList(C),Vector(C).
       -size dynamic
       -Index numbers
       -accepts dublicates

   1_ ArrayList:array based class. internally uses array.
             Singly linked.It retries the data faster than doubly linked list. (use get() method to retrive data)

   2_ LinkedList: each objects are doubly linked list.Faster to use it for "Bulk Operations-removeAll,AddAll,containsAll".

   3_ Vector:Similar to ArrayList. It is array based class
      Difference between Vector and ArrayList: vector is synchronized. What is synchronized?
      synchronized: used for achieving thread-safety.
       -advantage: thread safe
       -disadvantage: slower

      thread: process of operating system scheduling object.

      Stack:extends to Vector.It has synchronized key word as well.array based class. Last in First Out.


      -------------------------------------------------------------------------------------------------------------------------

      Queue(I):
      -size is dynamic.
      -there is no index number in Queue.(difference with List)
      -It accepts duplicate.
      -Unique action for Queue: First in first out. poll() method.
-------------------------------------------------------------------------------------------------------------------------

      Set(I): it does not accept duplicate and there is no index number.
      --LinkedHashSet<>(): keeps the insertion order as it is
      --HashSet<>(): not in insertion order. it is also faster than LinkedHashSet<>().

      --SortedSet(I): extends to Set. sorted set is implemented by TreeSet.
        TreeSEt(C): remove duplicate and sort at the same time.







     */
}
