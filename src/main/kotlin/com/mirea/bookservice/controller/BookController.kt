package com.mirea.bookservice.controller

import com.mirea.bookservice.entity.Book
import com.mirea.bookservice.service.BookService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/book")
class BookController(
    private val bookService: BookService,

) {

    @PostMapping("/add/")
    fun saveBook(@RequestParam title: String, @RequestParam authorId: String): Book {
        return bookService.saveBook(
            Book(
                id = UUID.randomUUID(),
                title = title,
                authorId = UUID.fromString(authorId)
            )
        )
    }

    @GetMapping ("/__health/")
    fun  checkHealth():Boolean{
        return true
    }

    @GetMapping("/find/{id}")
    fun getBookById(@PathVariable("id") bookId: String): Book? {
        return bookService.getBook(UUID.fromString(bookId))
    }
}