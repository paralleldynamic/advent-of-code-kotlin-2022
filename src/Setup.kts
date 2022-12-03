import java.io.File

val template = File("challenges/Day03.kt")

for (i in 4..25) {
    val dayNumber: String = i.toString().padStart(2, '0')
    val destination = File("challenges/Day$dayNumber.kt")
    template.copyTo(destination, overwrite = true)
}
