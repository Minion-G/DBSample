import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database

fun Application.configureDatabases() {
    Database.connect(
        "jdbc:postgresql://localhost:5432/tutors",
        user = "minion",
        password = "1q2w3e4r!@"
    )
}