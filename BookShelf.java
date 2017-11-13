
//package csu.csci325;
public class BookShelf{

 private Book one;
 private Book two;
 private Book three;
 private Book four;
 private Book five;

  public Book getBook(int pos){
    //Checks if there are more than 5 books.
    if(pos > 4){
      return null;
    }
    //returns book
    else{
        switch(pos){
          case 0:
          return one;
          case 1:
          return two;
          case 2:
          return three;
          case 3:
          return four;
          case 4:
          return five;
          default:
          return null;
        }
    }
  }
  public boolean setBook(int pos, Book book){
    if(pos>4){
      return false;
    }
    else{
      switch(pos){
        case 0:
          one=book;
          break;
        case 1:
          two=book;
          break;
        case 2:
          three=book;
          break;
       case 3:
          four=book;
          break;
       case 4:
          five=book;
          break;
       default:
          return false;

      }
      return true;
      }
}
  public boolean removeBook(int pos){
    if(pos > 4){
      return false;
    }
    else{
      switch(pos){
        case 0:
          one=null;
          break;
        case 1:
          two=null;
          break;
        case 2:
          three=null;
          break;
        case 3:
          four=null;
          break;
        case 4:
          five=null;
          break;
        default:
        return false;
    }
      return true;
    }
  }
    public void clear(){
      one=null;
      two=null;
      three=null;
      four=null;
      five=null;
    }
    public static void main(String[] args){

    }
  }
