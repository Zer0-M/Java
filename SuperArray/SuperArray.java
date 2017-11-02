
public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
      size=10;
      data=new String[size];
   }
  /**
     Returns the data in the format: "[A, B, FISH, cat, Dog]" Without double quotes around the data elements.
   */

  public String toString(){
    int nonNulls=0;
    String printable="[";
    for(int i=0;i<data.length;i+=1){

	    if(data[i]!=null){
        if(nonNulls>=1){
          printable+=",";
        }
        nonNulls+=1;
        printable+=data[i];

	    }


    }
    printable+="]";
    return printable;

   }
  /**
    Returns the number of elements in this list.
   */
  public int size(){
      return size;
      // int count=0;
    // for(int i=0;i<data.length;i+=1){
	// if(data[i]!=null){
	  //    count+=1;
	//  }
      // }
    // return count;
  }
  /**
     Appends the specified element to the end of this list. Returns true.

   */
  public boolean add(String element){
    int i=0;
    while(data[i]!=null){
        i+=1;
        if(i==size-1){
          resize();
        }
      }
    data[i]=element;
    System.out.println(size);
    return data[i].equals(element);
  }
  /**
    Removes all of the elements from this list.

   */
  public void clear(){
    data=new String[size];
  }
  /**
     Returns the element at the specified position in this list.
  */
  public String get(int index){
    if(index>=0&&index<size){
      return data[index];
    }
    else{
      throw IndexOutOfBoundsException();
    }
  }

  /**
     Replaces the element at the specified position in this list with the specified element, returns the old element.
   */
  public String set(int index, String element){
    String old="";
    if(index<size&&index>=0){
       old+=data[index];

       data[index]=element;
    }
    else{
      throw IndexOutOfBoundsException();
    }
    return old;
  }
  /**
     Returns true if this list contains no elements.
   */
  public boolean isEmpty(){
    return size()==0;
  }

  private void resize(){
    size=size*2;
    String[] newdata=new String[size];
    for(int i=0;i<data.length;i+=1){
      newdata[i]=data[i];
    }
    data=newdata;

  }
  /**
     Returns true if this list contains the specified element.
   */
  public boolean contains(String element){
    for(int i=0;i<data.length&&data[i]!=null;i+=1){
      if(data[i].equals(element)){
        return data[i].equals(element);
      }

    }
    return false;
  }

  /**
     Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
   */

  public int indexOf(String element){
   for(int i=0;i<data.length&&data[i]!=null;i+=1){
     if(data[i].equals(element)){
        return i;
      }

    }
    return -1;

  }
  /**
     Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
   */
  public int lastIndexOf(String element){
    int lastI=-1;
    for(int i=0;i<data.length&&data[i]!=null;i+=1){
      if(data[i].equals(element)){
       lastI=i;
      }

    }
    return lastI;
  }
  /**
     All elements at the index or to the right, are shifted to the right to make space, then insert the specified element at the specified position in this list.
   */
  public void add(int index,String element){
    if(index>=0&&index<size()){
      if (size-1==size()){
        resize();
        System.out.println(size);
      }
      int relativeIndex=0;
      String nextEl=get(index+relativeIndex);
      String nextNextEl=get(index+relativeIndex+1);
      set(index,element);
      while(nextEl!=null){
        set(index+relativeIndex+1,nextEl);
        nextEl=nextNextEl;
        relativeIndex+=1;
        nextNextEl=get(index+relativeIndex+1);
      }
    }
    else{
      throw IndexOutOfBoundsException();;
    }

  }

  /**
     Removes the element at the specified position in this list and shifts all subsequent elements to the left. Return the element removed.
   */
  public String remove(int index){
    if(index>=0&&index<size()){
      int relativeIndex=1;
      String removed=get(index);
      set (index,get(index+relativeIndex));
      while(get(index+relativeIndex)!=null){
        relativeIndex+=1;
        set(index+relativeIndex-1,get(index+relativeIndex));
      }
      return removed;
    }
    else{
      return null;
    }
  }

  /**
     Removes the first occurrence of the specified element from this list if it is present. Shift all the subsequent elements to the left.
   */
  public boolean remove(String element){
    boolean removed=false;
    for(int i=0;i<size();i+=1){
      if(get(i).equals(element)){
        remove(i);
        removed=true;
      }
    }
    return removed;
  }

}
