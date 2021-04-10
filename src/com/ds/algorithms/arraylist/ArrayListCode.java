package com.ds.algorithms.arraylist;

/**
 * @Author pankaj
 * @create 4/10/21 6:37 PM
 Why to use ArrayList:
is a re-sizable array, also called a dynamic array(Growable array/ resizable Array). It grows its size to accommodate new elements and
shrinks the size when the elements are removed.
---> ArrayList internally uses an array to store the elements. Just like arrays, It allows you to
retrieve the elements by their index
 ArrayList is an implementation class for List interface.
 Adv of List:
 1. duplicates are allowed.
 2. Insertion Order is preserved. the way you are going to insert the elements , in the same way you element will be displayed
 3. default capacity of arrayList is 10
 4. Formula to grow ArrayList= CC*3/2+1 till java 1.6
 5. Once new ArrayList got created the older arraylist will be eligible fo GC
 6. null insertion is possible in AL
 7. homogeneous elements are allowed
 NOTE: INTER DS of ArrayList is Dynamic array/Growable array/ resizable Array
 -------------When to use ArrayList ----------------------
 1. ArrayList is bad Choice for inserting/ deleting element in the middle of AL because it will take more time to shift element
 Noe: If you have Frequent insertion/ deletion operation in middle of List best choice to use LL over AL
2.. If your frequent operation is retrieval operation ArrayList is Best Choice.
 3. ArrayList and Vector class implements RandomAccess interface, helps you to retrieve element in constant time O(1) irrespective of index
 Note: RandomInterface is marker interface(don't have any method)

 */
public class ArrayListCode {


}
