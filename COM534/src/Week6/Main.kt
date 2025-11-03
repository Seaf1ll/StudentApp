package Week6

fun main() {
    val s1 = Song("Everytime we Touch", "Cascada", 270.0)
    val s2 = Song("Crucified", "Army of Lovers", 250.0)
    val s3 = Song("Take On Me", "A-ha", 200.0)
    val s4 = Song("Une vie a t'aimer", "Lorien Testard", 320.0)
    val s5 = Song("Oh Lord", "Foxy Shazam", 300.0)

    val single1 = Single(s1, s2)
    val single2 = Single(s3, s4)

    val album = Album(listOf(s3, s4, s5))

    val musicList: List<Music> = listOf(single1, single2, album)

    musicList.forEach {music ->
        println("-${music}-")
        println("Total time: ${music.PlayingTime()} seconds")
        println("Songs:")
        music.AllSongs().forEach { song ->
            println("${song.title} by ${song.artist}")
        }
        println()
    }
    val player = RecordPlayer()
    println("-Testing Record Player-")
    player.play(album)
    player.play(single1)

    println("Songs on album by A-ha:")
    album.SongsByArtist("A-ha").forEach {println(it.title)}
}