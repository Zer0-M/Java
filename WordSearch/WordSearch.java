public class WordSearch{
    private char[][]data;

    /**Initialize the grid to the size specified

     *fill all of the positions with '_'
     *@param row is the starting height of the WordSearch
     *@param col is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      data= new char[rows][cols];
    }

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
         for(int i=0;i<word.length()&&word.length()<=data[row].length;i++){
           for(int ind=0;ind<word.length()&&word.length()<=data[row].length;ind++){
             if(data[row][col+ind]!='_'&&data[row][col+ind]!=word.charAt(ind)){
               return false;
             }
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
         for(int i=0;i<word.length()&&word.length()<=data.length;i++){
           for(int ind=0;ind<word.length()&&word.length()<=data.length;ind++){
             if(data[row+ind][col]!='_'&&data[row+ind][col]!=word.charAt(ind)){
               return false;
             }
           }
           data[row+i][col]=word.charAt(i);
         }
         return true;


     }



}
