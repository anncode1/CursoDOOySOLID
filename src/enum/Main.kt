package enum

import enum.contructor.Color
import enum.functions.ErrorType

fun main() {
    val connectionType = ConnectionType.WIFI
    println(connectionType)

    val whiteHex = Color.WHITE.hexa
    println(whiteHex)

    val intentos = ErrorType.NOT_LOGGED_IN_ERROR.getRetryIntents()
    println(intentos)
}