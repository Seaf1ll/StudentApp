package Week6

class RecordPlayer {
    fun play(music: Music) {
        println("Playing music...")
        val time = music.PlayingTime()
        val songs = music.AllSongs()
        println("Total playing time: $time seconds")
        println("Songs:")
        songs.forEach {println("- ${it.title} by ${it.artist} (${it.playingTime}s)")}
        println()
    }
}