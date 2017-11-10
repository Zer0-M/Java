public class Driver{
  public static void main(String [] args){
    WordSearch word= new WordSearch(5,12);
    //System.out.println(word);
    word.clear();
    word.addWordHorizontal("Clash",3,4);
    word.addWordHorizontal("Xenomorphon",1,2);
    word.addWordHorizontal("dalkfhlagjalgga",3,0);
    word.addWordHorizontal("Zoop",4,0);
    word.addWordVertical("Clo",3,4);
    word.addWordVertical("Zoro",0,11);
    word.addWordVertical("Donquixote",3,11);
    word.addWordVertical("Fly",0,2);
    word.addWordDiagonal("DCA",2,3);
    System.out.println(word);


  }
}
