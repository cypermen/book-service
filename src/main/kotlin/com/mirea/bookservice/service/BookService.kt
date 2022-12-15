package com.mirea.bookservice.service

import com.mirea.bookservice.entity.Book
import com.mirea.bookservice.repository.BookRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class BookService(
    private val bookRepository: BookRepository,
) {

    fun saveBook(jpaUser: Book): Book {
        return bookRepository.save(jpaUser)
    }

    fun getBook(bookId: UUID?): Book? {
        return bookRepository.findById(bookId)
    }
}