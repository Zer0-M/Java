public class Driver{
  public static void main(String [] args){
    WordSearch word= new WordSearch(5,12);
    //System.out.println(word);
    word.clear();
    word.addWordHorizontal("Clash",3,4);
    word.addWordHorizontal("Xenomorph",1,2);
    word.addWordHorizontal("dalkfhlagjalgga",3,0);
    word.addWordHorizontal("Zoop",4,0);
    word.addWordVertical("Cl",3,4);
    word.addWordVertical("Zoro",0,11);
    word.addWordVertical("Donquixote",3,11);
    word.addWordVertical("Fly",0,2);
    System.out.println(word);


  }
}
