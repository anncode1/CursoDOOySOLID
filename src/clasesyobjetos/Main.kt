import clasesyobjetos.Song

fun main() {

    // Instanciando Objetos
    val firstSong = Song(
        title = "SOLO",
        artist = "Jennie"
    )

    val secondSong = Song(
        title = "Whistle",
        artist = "Blackpink"
    )

    val thirdSong = Song(
        title = "No Roots",
        artist = "Alice Merton"
    )

    // Usando sus componentes: Funciones

    secondSong.play()
    secondSong.stop()
    thirdSong.play()
}