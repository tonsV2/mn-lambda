package dk.fitfit

import io.micronaut.core.annotation.Introspected
import io.micronaut.function.aws.MicronautRequestHandler

@Introspected
class BookRequestHandler : MicronautRequestHandler<Book?, Map<String, Any>>() {
    override fun execute(input: Book?): Map<String, Any> {
        return validApiGatewayResponse("Hello from Lambda through Api Gateway!")
    }
}

fun validApiGatewayResponse(body: String, statusCode: Int = 200): Map<String, Any> = mapOf(
        "statusCode" to statusCode,
        "headers" to mapOf("Content-Type" to "application/json"),
        "body" to body)
