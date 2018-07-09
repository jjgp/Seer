import org.antlr.v4.runtime.CharStreams
import java.io.FileInputStream

class App {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val inputStream = if (!args.isNotEmpty()) {
                System.`in`
            } else {
                FileInputStream(args[0])
            }

            val charStream = CharStreams.fromStream(inputStream)
            JavaScriptLexer(charStream)
        }
    }
}