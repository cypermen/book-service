package com.mirea.bookservice.repository

import com.mirea.bookservice.entity.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface BookRepository : JpaRepository<Book?, UUID?> {
    fun findById(id: UUID?): Book?
}