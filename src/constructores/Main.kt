package constructores

import java.time.LocalDateTime
import java.time.Month

fun main() {
    val post = Post(
        name = "Tutorial de Kotlin",
        author = "Anahí Salgado",
        date = LocalDateTime.of(
            2022,
            Month.JANUARY,
            12,
            13,
            55
        )
    )

    println(post.publish())

    val postKotlinClasses = Post(
        name = "Clases de Kotlin",
        author = "Anahí Salgado",
        date = LocalDateTime.of(
            2022,
            Month.MARCH,
            15,
            18,
            30
        ),
        content = "Lorem Impsum Dolor Set",
        category = "Kotlin"
    )

    println(postKotlinClasses.publish())
}