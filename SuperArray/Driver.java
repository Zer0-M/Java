public class Driver{
    public static void main(String[] args){
      SuperArray suparr= new SuperArray();
      //Phase 1
      //Does it print
      System.out.println(suparr);//expecting []
      //now find the size
      System.out.println(suparr.size());//0
      //add stuff to array
      String[] names= {"Bruce Wayne","Korovyov","Mr. Wednesday","Alice Morgan","James Moriarty","Bilbo Baggins", "Eleven","Thorfinn","Jason Bourne"};
      for(int i=0;i<names.length;i+=1){
        suparr.add(names[i]);
        }
     
      System.out.println(suparr);//expecting [death,pestilence]
      System.out.println(suparr.size());
      System.out.println(suparr.set(8,"hi"));//null
      System.out.println(suparr.set(25,"hi"));//null
      System.out.println(suparr);//["hi"]
      System.out.println(suparr.size());
      //since we set a value lets get it
      System.out.println(suparr.get(8));//"hi"
      //now clear it
      suparr.clear();
      System.out.println(suparr);//[]
 	
    }

}
