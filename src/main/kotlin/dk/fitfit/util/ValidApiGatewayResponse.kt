package dk.fitfit.util

import com.fasterxml.jackson.databind.ObjectMapper

class ValidApiGatewayResponse<T>(
        body: T,
        val statusCode: Int = 200,
        val headers: Map<String, String> = mapOf("Content-Type" to "application/json"),
) {
//    private val bodyObject: T = body
    val body: String = ObjectMapper().writeValueAsString(body)
}
