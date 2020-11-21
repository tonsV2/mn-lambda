package dk.fitfit

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class BookRequestHandlerTest {
    @Test
    fun testHandler() {
        val bookRequestHandler = BookRequestHandler()
        val book = Book()
        book.name = "Building Microservices"
        val bookSaved = bookRequestHandler.execute(book)
        Assertions.assertNotNull(bookSaved)
        Assertions.assertEquals(book.name, bookSaved!!.name)
        Assertions.assertNotNull(bookSaved.isbn)
        bookRequestHandler.applicationContext.close()
    }

    @Test
    fun testHandlerEmptyInput() {
        val bookRequestHandler = BookRequestHandler()
        val bookSaved = bookRequestHandler.execute(null)
        Assertions.assertNotNull(bookSaved)
        Assertions.assertEquals("Hello, World!", bookSaved!!.name)
        Assertions.assertNull(bookSaved.isbn)
        bookRequestHandler.applicationContext.close()
    }
}
