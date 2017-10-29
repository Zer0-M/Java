public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
      size=10;
      data=new String[size];
   }
  /**
     Returns the data in the format: "[A, B, FISH, cat, Dog]" Without double quotes around the data elements.
     @return A SuperArray as a String
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
    @return the number of elements
   */
  public int size(){
    int count=0;
    for(int i=0;i<data.length;i+=1){
      if(data[i]!=null){
        count+=1;
      }
    }
    return count;
  }
  /**
     Appends the specified element to the end of this list. Returns true.
     @param addend a String that is to be added to the end of the SuperArray
     @return true if the given String is added to the end of the SuperArray

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
      return "Invalid index";
    }
  }

  public String set(int index, String element){
    String old="";
    if(index<size&&index>=0){
      if(data[index]==null){
        old+="There was no element at this index";
      }
      else{
       old+=data[index];
      }
       data[index]=element;
    }
    else{
      return "Index out of bounds";
    }
    return old;
  }
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
  public boolean contains(String element){
    for(int i=0;i<data.length&&data[i]!=null;i+=1){
      if(data[i].equals(element)){
        return data[i].equals(element);
      }

    }
    return false;
  }

  public int indexOf(String element){
   for(int i=0;i<data.length&&data[i]!=null;i+=1){
     if(data[i].equals(element)){
        return i;
      }

    }
    return -1;

  }
  public int lastIndexOf(String element){
    int lastI=-1;
    for(int i=0;i<data.length&&data[i]!=null;i+=1){
      if(data[i].equals(element)){
       lastI=i;
      }

    }
    return lastI;
  }
  public void add(int index,String element){
    if(index>=0&&index<size()){
      resize();
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
      System.out.println("Invalid index");
    }

  }
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
      return "Invalid index";
    }
  }
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
