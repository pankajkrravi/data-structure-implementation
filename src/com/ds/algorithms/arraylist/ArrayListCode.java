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

    private static final int INITIAL_CAPACITY=10;
    private Object [] objectArray;
    private int index;
    private int size;
    ArrayListCode()
    {
        this.objectArray=new Object[INITIAL_CAPACITY];
        this.size=INITIAL_CAPACITY;
    }

    public void add(Object o)
    {
        System.out.println("index: "+this.index+" size: "+this.size+" Array size: "+this.objectArray.length);
            //check whether array is full
        if(this.index== this.size-1)
        {
            // Object array is full, in this case we need to increase Object Array
            increaseObjectArray();
        }
        // array is not full
        objectArray[index]=o;
        this.index++;
    }
  private void increaseObjectArray()
  {
    this.size=this.size+INITIAL_CAPACITY;
    //create new Object array and copy from older Array
      Object[] newObjectArray=new Object[this.size];
      for (int i=0;i<objectArray.length;i++)
      {
          newObjectArray[i]=objectArray[i];
      }
      this.objectArray=newObjectArray;
      System.out.println(" ####### index ######  : "+this.index+" size : "+this.size+" array size : "+this.objectArray.length);
  }

 // code to get()
    public Object get(int i) throws Exception
    {
        // data index is not present in array
        if(i>this.index -1)
        {
            throw new Exception("ArrayIndexOutOfBoundsException");
        } //-ve index is passed
        else if(i<0)
        {
            throw new Exception("negative value !!!");
        }
         return this.objectArray[i];
    }
    // method to remove or delete element
    public void remove(int i) throws Exception {
        if(i>this.index-1)
        {
            throw  new Exception("ArrayIndexOutOfBoundsException !!!");
        } else if(i<0)
        {
            throw new Exception("Negative Index !!!");
        }
         // code to delete object from array
        System.out.println("Object is deleted "+this.objectArray[i]);
        for (int j=0;j<objectArray.length-1;j++)
        {
            objectArray[i]=objectArray[i+1];
        }// decrease index by one after deletion of object
        this.index--;
    }

    public static void main(String[] args) throws Exception {
        ArrayListCode myArrayList=new ArrayListCode();
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add("pankaj");
        myArrayList.add("Ravi Kumar");
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);
        System.out.println("Print address ::::::::: "+myArrayList);
        System.out.println("index 9th element "+myArrayList.get(9));
        //myArrayList.remove(10);
        System.out.println("index 11th element "+myArrayList.get(11));
        System.out.println("index 12th element "+myArrayList.get(12));
        myArrayList.remove(2);
        System.out.println(myArrayList.get(2));
        /* We can handle Error by using  try catch or,. directly throw Exception from main method
        try {
            System.out.println(myArrayList.get(9));
        }catch (Exception e){ }*/
    }
}
