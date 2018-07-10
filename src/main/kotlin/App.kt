import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.FileInputStream

fun main(args: Array<String>) {
    val input = if (!args.isNotEmpty()) {
        System.`in`
    } else {
        FileInputStream(args[0])
    }

    val characters = CharStreams.fromStream(input)
    val lexer = JavaScriptLexer(characters)
    val tokens = CommonTokenStream(lexer)
    val parser = JavaScriptParser(tokens)
    val context = parser.program()

    print(context.getStart().toString())
}
