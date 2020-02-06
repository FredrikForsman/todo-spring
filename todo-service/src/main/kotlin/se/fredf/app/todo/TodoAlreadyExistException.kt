package se.fredf.app.todo

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.RuntimeException

@ResponseStatus(HttpStatus.CONFLICT)
class TodoAlreadyExistException(override val message: String?): RuntimeException(message)