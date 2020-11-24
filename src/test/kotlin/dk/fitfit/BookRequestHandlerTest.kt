package dk.fitfit

import dk.fitfit.domain.Book
import dk.fitfit.handler.BookRequestHandler
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

@MicronautTest
class BookRequestHandlerTest {
    @Test
    fun testHandler() {
        val bookRequestHandler = BookRequestHandler()
        val book = Book()
        book.name = "Hello from Lambda through Api Gateway!"

        val bookSaved = bookRequestHandler.execute(book).body
        Assertions.assertNotNull(bookSaved)
//        Assertions.assertEquals(book.name, bookSaved.name)
//        Assertions.assertNotNull(bookSaved.isbn)

        bookRequestHandler.applicationContext.close()
    }

    @Test
    fun testHandlerEmptyInput() {
        val bookRequestHandler = BookRequestHandler()
        val bookSaved = bookRequestHandler.execute(null).body

        Assertions.assertNotNull(bookSaved)
        val expected = "Hello from Lambda through Api Gateway!"
//        val actual = bookSaved.name
//        Assertions.assertEquals(expected, actual)
//        Assertions.assertNull(bookSaved.isbn)

        bookRequestHandler.applicationContext.close()
    }
}
