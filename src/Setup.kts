import java.io.File

val template = File("challenges/Day02.kt")

for (i in 3..25) {
    val dayNumber: String = i.toString().padStart(2, '0')
    val destination = File("challenges/Day$dayNumber.kt")
    template.copyTo(destination)
}

git change-commits GIT_COMMITTER_EMAIL "spearspa@gmail.com" "paralleldynamic@users.noreply.github.com"
