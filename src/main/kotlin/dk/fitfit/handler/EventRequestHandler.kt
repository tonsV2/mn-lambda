package dk.fitfit.handler

import com.amazonaws.services.lambda.runtime.events.SQSEvent
import com.amazonaws.services.lambda.runtime.events.SQSEvent.SQSMessage
import dk.fitfit.domain.Avatar
import dk.fitfit.service.AvatarService
import io.micronaut.core.annotation.Introspected
import io.micronaut.function.aws.MicronautRequestHandler
import mu.KotlinLogging
import javax.inject.Inject

@Introspected
class EventRequestHandler : MicronautRequestHandler<SQSEvent, Unit>() {
    private val logger = KotlinLogging.logger {}

    @Inject
    lateinit var avatarService: AvatarService

    override fun execute(input: SQSEvent) {
        input.records.forEach {
            handle(it)
        }
    }

    private fun handle(message: SQSMessage) {
        val body = message.body
        avatarService.save(Avatar(body))
        val msg = "Hello, $body!"
        logger.info { msg }

        // Copy from legacy to modern
        // Update database reference
        // Rm from legacy
    }
}
