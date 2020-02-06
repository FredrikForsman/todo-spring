package se.fredf.app.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.RuntimeException

@ResponseStatus(HttpStatus.NOT_FOUND)
class ResourceNotFoundException(override val message: String?) : RuntimeException(message) {
}