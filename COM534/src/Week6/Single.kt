package Week6

class Single(val Aside: Song, val Bside: Song) : Music {
    override fun PlayingTime(): Double {
        return Aside.playingTime + Bside.playingTime
    }
    override fun AllSongs(): List<Song> {
        return listOf(Aside, Bside)
    }
    override fun toString(): String {
        return "Single: A-side '${Aside.title}', B-side '${Bside.title}'"
    }
}