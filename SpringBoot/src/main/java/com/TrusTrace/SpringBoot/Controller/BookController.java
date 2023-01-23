package com.TrusTrace.SpringBoot.Controller;

import com.TrusTrace.SpringBoot.Pojo.Books;
import com.TrusTrace.SpringBoot.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/Books")
public class BookController {
    @Autowired
   private BookService bookService;
    @GetMapping("/book")
    public List<Books> getAllBooks(){
        return bookService.getAllBooks ();
    }
    @GetMapping("/book/{bookId}")
    public Books getBooks(@PathVariable ("bookId")int id){
        return (Books) bookService.getBookById (id);
    }

    @DeleteMapping("/book/{bookId}")
    private void deleteBook(@PathVariable("bookId") int bookId)
    {
        bookService.delete (bookId);
    }

    @PostMapping("/books")
    private int saveBook(@RequestBody Books books)
    {
        bookService.saveOrUpdate(books);
        return books.getBookId ();
    }

    @PutMapping("/books")
    private Books update(@RequestBody Books books)
    {
        bookService.saveOrUpdate(books);
        return books;
    }


}
