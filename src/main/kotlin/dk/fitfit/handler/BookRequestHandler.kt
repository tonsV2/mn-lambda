package dk.fitfit.handler

import dk.fitfit.domain.Book
import dk.fitfit.domain.BookSaved
import dk.fitfit.util.ValidApiGatewayResponse
import io.micronaut.core.annotation.Introspected
import io.micronaut.function.aws.MicronautRequestHandler
import java.util.*

@Introspected
class BookRequestHandler : MicronautRequestHandler<Book?, ValidApiGatewayResponse<BookSaved>>() {
    override fun execute(input: Book?): ValidApiGatewayResponse<BookSaved> {
        val bookSaved = BookSaved("Hello from Lambda through Api Gateway!", UUID.randomUUID().toString())
        return ValidApiGatewayResponse(bookSaved)
    }
}
