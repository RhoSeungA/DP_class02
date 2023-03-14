package ch01.practice;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {

  //집합체(책꽂이)
  BookShelf bs;
  int index; // 현재 위치

  //생성자
  public BookShelfIterator(BookShelf bs) {
    this.bs = bs; //iterator와 책꽂이가 연결됨.
  }

  // 다음 원소(책)를 반환하는 메서드
  public Book next(){
    //return bs.getBookAt(index++);
    Book b = bs.getBookAt(index);
    index++;
    return b;
  }

  // 그 다음 원소가 있는지
  @Override
  public boolean hasNext(){
    if(index < bs.getLength())return true;
    else return false;
  }


}
