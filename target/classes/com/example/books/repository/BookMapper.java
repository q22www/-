package com.example.books.repository;

import com.example.books.entity.Book;
import java.util.List;

public interface BookMapper {
    Integer saveBook(Book book);//保存书籍信息
    List<Book> selectAllBook();//查询Books表所有
    Integer deleUser(Integer bookid);//删除书籍

}
