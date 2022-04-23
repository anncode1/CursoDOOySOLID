package getterssetters

import java.time.LocalDate
import java.time.Month

fun main() {
    // Validations
    // User
    //  - email
    //  - password
    //  - birthdate
    //  - gender

    // register(user)
    val user = User("ANAHI@GMAIL.COM", "abc123")
    val userRegistered: User? = RegisterUser().invoke(user)

    if (userRegistered != null) {
        println("User Registered: ${userRegistered.email}")
        println("User Registered: ${userRegistered.password}")
    } else {
        println("User Not Registered")
    }

    println()
    val annUser = User(
        email = "ann@gmail.com",
        password = "123abc",
        birthdate = LocalDate.of(1990, Month.DECEMBER, 12),
        gender = 'F'
    )
    val annRegistered = RegisterUser().invoke(annUser)
    if (annRegistered != null) {
        println("Ann Email: ${annRegistered.email}")
        println("Ann Pass: ${annRegistered.password}")
        println("Ann Birthday: ${annRegistered.birthdate}")
        println("Ann Gender: ${annRegistered.gender}")
    } else {
        println("User Not Registered")
    }


}