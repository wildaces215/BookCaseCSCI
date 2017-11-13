/*
* Created by Craig Albertson
*/
//package csu.csci325;
public class Book{
  String title;
  String author;
  String date;
  public Book(String title,String author,String date){
    this.title=title;
    this.author=author;
    this.date=date;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public String getDate(){
    return date;
  }

}
