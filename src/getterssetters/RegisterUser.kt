package getterssetters

class RegisterUser {
    // Yes -> User
    // No -> Null
    fun invoke(user: User): User? {
        return if (user.isValid) user else null
    }
}