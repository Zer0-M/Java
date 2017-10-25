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
  public boolean add(String addend){
    size+=1;
    String[] newdata=new String[size];
    for(int i=0;i<data.length;i+=1){
      newdata[i]=data[i];
    }
    newdata[size-1]=addend;
    data=newdata;
    return data[size-1]==addend;
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
    if(data[index]!=null){
      return data[index];
    }
    else{
      return "Array index out of bounds";
    }
  }

  public String set(int index, String element){
    String old="";
    if(index<data.length){
       old+=data[index];
       data[index]=element;
    }
    else{
      return "Array index out of bounds";
    }
    return old;
  }
  public boolean isEmpty(){
    return size()==0;
  }


}
