import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database

fun Application.configureDatabases() {
    Database.connect(
        "jdbc:postgresql://localhost:5432/tutors",
        user = "minion",
        password = System.getenv("db_pass")
    )
}