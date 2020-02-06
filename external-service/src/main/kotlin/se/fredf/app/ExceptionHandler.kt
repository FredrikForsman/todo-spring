package se.fredf.app

import feign.FeignException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.servlet.http.HttpServletResponse

@RestControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(FeignException::class)
    fun handleFeignStatusException(e: FeignException, response: HttpServletResponse): String {
        response.status = e.status()
        return "FeignError"
    }
}