package constructores

import java.time.LocalDateTime

class Post(
    val name: String,
    val author: String,
    val date: LocalDateTime
) {

    var body: String = ""
    var category: String = ""

    constructor(
        name: String,
        author: String,
        date: LocalDateTime,
        content: String,
        category: String
    ) : this(name, author, date) {
        body = content
        this.category = category
    }

    fun publish(): String {
        return """
           Post Name: $name
           Author: $author
           Date: $date 
           ${getCategorySection()}
           ${getContent()}
        """.trimIndent()
    }

    private fun getContent(): String {
        return if (body.isNotBlank() && body.isNotEmpty()) {
            """Content: $body
            """.trimIndent()
        } else ""
    }

    private fun getCategorySection(): String {
        return if (category.isNotBlank() && category.isNotEmpty()) {
            """Category: $category
            """.trimIndent()
        } else ""
    }

}