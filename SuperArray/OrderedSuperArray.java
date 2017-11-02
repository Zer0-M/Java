public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(){
	//Complete this.
	super();
    }

    /*call the proper add.*/
    public void add(int index, String value){
	add(value);
    }

    /*Write this method and any
    appropriate helper methods.*/
    private int findIndex(String str){
	for(int i=size()-1;i>=0;i-=1){
	    if(get(i-1)!=null&&str.compareTo(get(i-1))>0){
		System.out.println(i);
		return i;
	    }
	}
	return 0;
    }
    public boolean add(String value){
	//add to the correct spot.
	//you may still use super.add(index,value)
	System.out.print(findIndex(value));
	super.add(findIndex(value),value);
	return true;
    }
}
