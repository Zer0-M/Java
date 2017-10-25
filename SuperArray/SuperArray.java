public class SuperArray{
    private String[] data;
    private int size;
    public SuperArray(){
	size=10;
	data=new String[size];
    }
    public String toString(){
	String printable="[";
	for(int i=0;i<data.length;i+=1){
	    if(data[i]!=null){
		printable+=data[i];
	    }
	}
	printable+="]";
	return printable;

    }

}
