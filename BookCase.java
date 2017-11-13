//package csu.csci325;
public class BookCase{
  private BookShelf one;
  private BookShelf two;
  private BookShelf three;
  private BookShelf four;
  private BookShelf five;

  public BookShelf getBookShelf(int pos){
   if(pos > 4){
     return null;
   }
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


     }
     return null;
   }

  }
  public boolean setBookShelf(int pos, BookShelf bookShelf){
   if(pos > 4 || pos < 0){
     return false;
   }
   else{
     switch(pos){
       case 0:
        one=bookShelf;
        break;
       case 1:
        two=bookShelf;
        break;
      case 2:
        three=bookShelf;
        break;
      case 3:
        four=bookShelf;
        break;
      case 4:
        five = bookShelf;
        break;
      default:
        return false;

     }
     return true;
   }
  }
public boolean removeBookShelf(int pos){
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
}
