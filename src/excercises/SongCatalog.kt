package excercises

class SongCatalog(val title: Int, val artist: String, val yearPublished: Int, var playCount: Int = 0) {
    init {
        var popular = false
        if (playCount >= 1000)
            popular = true
    }
    fun printSongDetails() {
        println("$title, performed by $artist, was released in $yearPublished")
    }
}