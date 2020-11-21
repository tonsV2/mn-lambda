package dk.fitfit

import io.micronaut.core.annotation.Introspected

@Introspected
class BookSaved(
        var name: String? = null,
        var isbn: String? = null
)
