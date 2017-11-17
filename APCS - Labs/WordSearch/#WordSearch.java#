import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class WordSearch{
    private char[][]data;
    private Random randgen;
    private ArrayList<String>wordsToAdd;
    private ArrayList<String>wordsAdded;

    /**Initialize the grid to the size specified

     *fill all of the positions with '_'
     *@param row is the starting height of the WordSearch
     *@param col is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      data= new char[rows][cols];
      clear();
    }
    public WordSearch( int rows, int cols, String fileName){
      data= new char[rows][cols];
      clear();
      wordsToAdd=new ArrayList<String>();
      try{
        File f = new File(fileName);//can combine
        Scanner in = new Scanner(f);//into one line

        while(in.hasNext()){
          String word = in.next();
          wordsToAdd.add(word);

        }

      }catch(FileNotFoundException e){
        System.out.println("File not found: " + fileName);
        //e.printStackTrace();
        System.exit(1);
      }
      wordsAdded=new ArrayList<String>();
      randgen=new Random();
      addAllWords();
      fillGrid();
      System.out.println(wordsAdded);

    }
  public WordSearch( int rows, int cols, String fileName, int seed){
      data= new char[rows][cols];
      clear();
      wordsToAdd=new ArrayList<String>();
      try{
        File f = new File(fileName);//can combine
        Scanner in = new Scanner(f);//into one line

        while(in.hasNext()){
          String word = in.next();
          wordsToAdd.add(word);

        }

      }catch(FileNotFoundException e){
        System.out.println("File not found: " + fileName);
        //e.printStackTrace();
        System.exit(1);
      }

      wordsAdded=new ArrayList<String>();
      randgen=new Random(seed);
      addAllWords();
      fillGrid();
      System.out.println(wordsAdded);

    }

  //public WordSearch( int rows, int cols, int fileName, int randSeed)



    /**Set all values in the WordSearch to underscores'_'*/
  public void clear(){
      for(int i=0;i<data.length;i++){
        for(int col=0;col<data[i].length;col++){
          try{
            data[i][col]='_';
          }catch(ArrayIndexOutOfBoundsException e){}
        }
      }
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String grid="";
      for(int i=0;i<data.length;i++){
        for(int col=0;col<data[i].length;col++){
          try{
            grid+=data[i][col] +" ";
          }catch(ArrayIndexOutOfBoundsException e){}
        }
        grid+="\n";
      }
      return grid;
    }
  private boolean addAllWords(){
    for(int i=0;i<wordsToAdd.size();i++){
      String word=wordsToAdd.get(i);
      int colInc=0;
      int rowInc=0;
      while(colInc==0&&rowInc==0){
        colInc=randgen.nextInt(3)-1;
        rowInc=randgen.nextInt(3)-1;
      }
      int row=randgen.nextInt(data[0].length);
      int col=randgen.nextInt(data.length);
      boolean added=addWord(row,col,word,rowInc,colInc);
      if(added){
        wordsAdded.add(word);
      }
    }
    return true;
  }
  private boolean fillGrid(){
    for(int row=0;row<data.length;row++){
      for(int col=0;col<data[row].length;col++){
        if(data[row][col]=='_'){
          data[row][col]=(char) (randgen.nextInt(26)+65);
        }
      }
    }
    return true;

  }
    private boolean addWord( int row, int col, String word, int rowIncrement, int colIncrement){
       try{
             int testRow=row;
             int testCol=col;
             for(int ind=0;ind<word.length();ind++){
               if(data[testRow][testCol]!='_'&&data[testRow][testCol]!=word.charAt(ind)){
                 return false;
               }
               testRow+=rowIncrement;
               testCol+=colIncrement;
             }
           }
           catch(ArrayIndexOutOfBoundsException e){
             return false;
       }
      for(int i=0;i<word.length();i++){
           data[row][col]=word.charAt(i);
           row+=rowIncrement;
           col+=colIncrement;
         }
         return true;
  }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned

     * and the board is NOT modified.

     */
     public boolean addWordHorizontal(String word,int row, int col){
         for(int i=0;i<word.length();i++){
           try{
             for(int ind=0;ind<word.length();ind++){
               if(data[row][col+ind]!='_'&&data[row][col+ind]!=word.charAt(ind)){
                 return false;
               }
             }
           }
           catch(ArrayIndexOutOfBoundsException e){
             return false;
           }
           data[row][col+i]=word.charAt(i);
         }
         return true;


     }


   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.

     */
     public boolean addWordVertical(String word,int row, int col){
         for(int i=0;i<word.length();i++){
           try{
             for(int ind=0;ind<word.length();ind++){
               if(data[row+ind][col]!='_'&&data[row+ind][col]!=word.charAt(ind)){
                 return false;
               }
             }
           }
           catch(ArrayIndexOutOfBoundsException e){
             return false;
           }
           data[row+i][col]=word.charAt(i);
         }
         return true;


     }
     /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left to bottom right, must fit on the WordGrid,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordDiagonal(String word,int row, int col){
      for(int i=0;i<word.length();i++){
        try{
           for(int ind=0;ind<word.length();ind++){
             if(data[row+ind][col+ind]!='_'&&data[row+ind][col+ind]!=word.charAt(ind)){
               return false;
             }
           }
        }
        catch(ArrayIndexOutOfBoundsException e){
          return false;
        }
           data[row+i][col+i]=word.charAt(i);
       }
         return true;
    }



}
