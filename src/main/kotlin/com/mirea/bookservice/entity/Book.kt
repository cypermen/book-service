package com.mirea.bookservice.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class Book(
    @Id
    val id: UUID,
    val title: String,
    val authorId: UUID,
)