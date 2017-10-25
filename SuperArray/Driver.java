public class Driver{
    public static void main(String[] args){
      SuperArray suparr= new SuperArray();
      //Phase 1
      //Does it print
      System.out.println(suparr);//expecting []
      //now find the size
      System.out.println(suparr.size());//10
      //add stuff to array
      System.out.println(suparr.add("death"));//expecting true
      System.out.println(suparr.add("pestilence"));//expecting true
      System.out.println(suparr);//expecting [death,pestilence]
      System.out.println(suparr.size());
      //now clear it
      suparr.clear();
      System.out.println(suparr);//[]
      System.out.println(suparr.set(8,"hi"));//0
      System.out.println(suparr);//["hi"]
      //since we set a value lets get it
      System.out.println(suparr.get(8));//"hi"	
    }

}
