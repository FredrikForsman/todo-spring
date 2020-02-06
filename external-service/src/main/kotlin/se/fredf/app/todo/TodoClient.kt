package se.fredf.app.todo

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient("todo-service")
interface TodoClient {

    @GetMapping("/todos/get")
    fun greetingFromTodo(): String

    @GetMapping("/todos/{id}")
    fun getTodo(@PathVariable("id") id: Long): Any

    @PostMapping("/todos")
    fun create(@RequestBody req: CreateTodoRequest): Any

}