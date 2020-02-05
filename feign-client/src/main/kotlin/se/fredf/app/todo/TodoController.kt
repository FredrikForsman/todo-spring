package se.fredf.app.todo

import org.springframework.web.bind.annotation.*

@RestController
class TodoController(private val todoClient: TodoClient) {

    @PostMapping("/todos")
    fun create(@RequestBody req: CreateTodoRequest): Any {
        return todoClient.create(req)
    }

    @GetMapping("/todos/{id}")
    fun getTodoById(@PathVariable("id") id: Long): Any {
        return todoClient.getTodo(id)
    }

    @GetMapping("/todos/get")
    fun hello(): String {
        return todoClient.greetingFromTodo()
    }

}