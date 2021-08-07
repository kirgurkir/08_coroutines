package ru.gurlev.netology.coroutines.dto

data class FullPost(
    val post: Post,
    val comments: List<Pair<Comment, Author>>,
    val author: Author
)
