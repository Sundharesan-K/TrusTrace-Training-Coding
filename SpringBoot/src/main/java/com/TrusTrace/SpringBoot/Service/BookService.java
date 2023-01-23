package com.TrusTrace.SpringBoot.Service;

import com.TrusTrace.SpringBoot.Pojo.Books;
import com.TrusTrace.SpringBoot.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Books> getAllBooks(){
        List<Books> books=new ArrayList<> ();
        bookRepository.findAll ().forEach (books1 -> books.add (books1));
        return books;
    }
    public Object getBookById(int id){
        return bookRepository.findById(String.valueOf (id)).get ();
    }
    public void saveOrUpdate(Books books){
        bookRepository.save (books);
    }
    public void delete(int id){
        bookRepository.delete (id);
    }
    public void update(Books books,int bookId){
        bookRepository.save (books);
    }
}
