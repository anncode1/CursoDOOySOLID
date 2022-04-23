package enum.functions

enum class ErrorType(
    val message: String
) {
    UNKNOWN_ERROR("Unknown error") {
        override val userMessage: String = "Unexpected error occurred"
        override fun getCodeError(): String = "UE00"
    },

    CONNECTIVITY_ERROR("Connectivity Error") {
        override val userMessage: String = "Failure Request"
        override fun getCodeError(): String = "CE003"
        override fun getRetryIntents(): Int = 3
    },

    NOT_LOGGED_IN_ERROR("Not logged in error") {
        override val userMessage: String = "User is not logged in"
        override fun getCodeError(): String = "LE002"
        override fun getRetryIntents(): Int = 2
    };

    abstract val userMessage: String
    abstract fun getCodeError(): String
    open fun getRetryIntents(): Int = 1
    fun otraFun(): Int = 0
}