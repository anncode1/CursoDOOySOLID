package dataclases

fun main() {

    val firstSong = Song(
        "SOLO",
        "Jennie"
    )

    val secondSong = Song(
        "SOLO",
        "Jennie"
    )

    println("Are Classes Song equals?: ${firstSong == secondSong}")


    println()
    val dataClassSong = DataClassSong(
        "SOLO",
        "Jennie"
    )

    val dataClassSong2 = DataClassSong(
        "SOLO",
        "Jennie"
    )
    

    println("Are  Data Classes Song equals?: ${dataClassSong == dataClassSong2}")

}