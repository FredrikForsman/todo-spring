package se.fredf.app.todo

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.*

@FeignClient("todo-service")
interface TodoClient {

    @GetMapping("/todos/{id}")
    fun getTodo(@PathVariable("id") id: Long): Any

    @PostMapping("/todos")
    fun create(req: CreateTodoRequest): Any

    @PutMapping("/todos/{id}")
    fun updateTodo(@PathVariable("id") id: Long, @RequestBody req: UpdateTodoRequest): Any
}