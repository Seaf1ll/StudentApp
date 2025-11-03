package Week6

class Album(val songs: List<Song>) : Music {
    fun SongsByArtist(artist: String): List<Song> {
        return songs.filter {it.artist == artist}
    }
    override fun PlayingTime(): Double {
        return songs.sumOf {it.playingTime}
    }
    override fun AllSongs(): List<Song> {
        return songs
    }
    override fun toString(): String {
        return "Album with ${songs.size} songs"
    }
}