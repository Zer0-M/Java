public class Driver{
  public static void main(String [] args){
    WordSearch word= new WordSearch(20,20,"Computers.txt");
    //System.out.println(word);
    /*word.addWordHorizontal("Clash",3,4);
    word.addWordHorizontal("Xenomorphon",1,2);
    word.addWordHorizontal("dalkfhlagjalgga",3,0);
    word.addWordHorizontal("Zoop",4,0);
    word.addWordVertical("Clo",3,4);
    word.addWordVertical("Zoro",0,11);
    word.addWordVertical("Donquixote",3,11);
    word.addWordVertical("Fly",0,2);
    word.addWordDiagonal("DCA",2,3);*/
    System.out.println(word);
    // WordSearch word0= new WordSearch(5,12);
    /*
     word0.addWord(3,4,"Clash",0,1);
    word0.addWord(1,2,"Xenomorph",0,1);
    word0.addWord(4,0,"Zoop",0,1);
    word0.addWord(3,0,"adafgsgdhdhg",0,1);
    word0.addWord(3,4,"Cl",1,0);
    word0.addWord(3,11,"Donquixote",1,0);
    word0.addWord(2,3,"DCA",1,1);
    System.out.println(word0);
    */
  }
}
