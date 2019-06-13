/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;


// Java program to demonstrate positional access 
// operations on List interface 
import java.util.*;
import java.util.stream.*;

/**
 *
 * @author unknown
 * copied from Virginia Walter's discussion board post
 */
public class JavaCollections
{ 
public static void main (String[] args) 
{ 
// 
// Collection list example
//
    System.out.println(" ");
    System.out.println("List Collection Example");
// Creating a list 
List<Integer> list1 = new ArrayList<>(); 
list1.add(0, 1); // adds 1 at 0 index 
list1.add(1, 2); // adds 2 at 1 index 
System.out.print("Print list list1:");
System.out.println(list1); // [1, 2]
// Creating another list 
List<Integer> list2 = new ArrayList<>(); 
list2.add(1); 
list2.add(2); 
list2.add(3);
System.out.print("Print list list2:");
System.out.println(list2);
// Will add list list2 from 1 index 
list1.addAll(1, list2); 
System.out.print("Add list2 to list1 from index 1:");
System.out.println(list1);
// Removes element from index 1 
list1.remove(1);
System.out.print("Remove element from index 1 of list1:");
System.out.println(list1);
// Prints element at index 3 
System.out.print("Print only element at index 3 from list1:");
System.out.println(list1.get(3));
// Replace 0th element with 5 
list1.set(0, 5); 
System.out.print("Replace element in list1 at index 0 with the integer 5:");
System.out.println(list1); 
// Create a string list
List<String> listStrings = new ArrayList<>();
listStrings.add("Frist");
listStrings.add("Second");
listStrings.add("Third");
listStrings.add("Third");
listStrings.add("Forth");
System.out.print("Print List String:");
System.out.println(listStrings);
//
// Set Collection example
//
System.out.println(" ");
System.out.println("Set Collection Example");
// Create a string set
Set<String> hashSet = new HashSet<>();
hashSet.add("1.Frist");
hashSet.add("2.Second");
hashSet.add("3.Third");
hashSet.add("3.Third");
hashSet.add("4.Forth");
System.out.print("Set output without the duplicate");
System.out.println(hashSet);
// Set using TreeSet
Set<String> treeSet = new TreeSet<>(hashSet);
System.out.print("Sorted set after passing into TreeSet");
System.out.println(treeSet);
//
Set<Integer> a = new HashSet<Integer>(); 
    a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 
Set<Integer> b = new HashSet<Integer>(); 
    b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5})); 
  
// To find union 
Set<Integer> union = new HashSet<Integer>(a); 
    union.addAll(b); 
    System.out.print("Union of the two Set"); 
    System.out.println(union); 
  
// To find intersection 
    Set<Integer> intersection = new HashSet<Integer>(a); 
        intersection.retainAll(b); 
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersection); 
  
// To find the symmetric difference 
    Set<Integer> difference = new HashSet<Integer>(a); 
        difference.removeAll(b); 
        System.out.print("Difference of the two Set"); 
        System.out.println(difference); 
//
// Map Collection Example
//
System.out.println(" ");
System.out.println("Map Collection Example");
SortedMap<Integer, String> sm;
    sm = new TreeMap<>(); 
        sm.put(2, "practice"); 
        sm.put(3, "quiz"); 
        sm.put(5, "code"); 
        sm.put(4, "contribute"); 
        sm.put(1, "geeksforgeeks"); 
        Set s; 
        s = sm.entrySet();
  
        // Using iterator in SortedMap 
        Iterator i = s.iterator(); 
  
        // Traversing map. Note that the traversal 
        // produced sorted (by keys) output . 
        System.out.println(" ");
        System.out.println("Print Sorted Map");
        while (i.hasNext()) 
        { 
            Map.Entry m = (Map.Entry)i.next(); 
  
            int key = (Integer)m.getKey(); 
            String value = (String)m.getValue(); 
  
            System.out.println("Key : " + key + 
                            "  value : " + value); 
        } 
//
// Queue Collection example
//
System.out.println(" ");
System.out.println("Queue Collection Example");

 Queue<Integer> q = new LinkedList<>(); 
  
    // Adds elements {0, 1, 2, 3, 4} to queue 
    for (int i2=0; i2<5; i2++) 
     q.add(i2); 
  
    // Display contents of the queue. 
    System.out.println("Elements of queue-"+q); 
  
    // To remove the head of queue. 
    int removedele = q.remove(); 
    System.out.println("removed element-" + removedele); 
  
    System.out.println(q); 
  
    // To view the head of queue 
    int head = q.peek(); 
    System.out.println("head of queue-" + head); 
  
    // Rest all methods of collection interface, 
    // Like size and contains can be used with this 
    // implementation. 
    int size = q.size(); 
    System.out.println("Size of queue-" + size); 
 //
// Tree Collection example
//
System.out.println(" ");
System.out.println("Tree Collection Example");
System.out.println(" ");
System.out.println("Elements are store in ascending order and no duplicates are allowed");
  TreeSet<String> ts1 = new TreeSet<String>(); 
    
        // Elements are added using add() method 
        ts1.add("A"); 
        ts1.add("B"); 
        ts1.add("C"); 
        ts1.add("E");
        ts1.add("D");
  
        // Duplicates will not get insert 
        ts1.add("C"); 
  
        // Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println(ts1); 
} 
}

