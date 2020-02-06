package se.fredf.app.todo

import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todos")
class TodoController(private val todoService: TodoService) {

    @PostMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody req: CreateTodoRequest): Todo = todoService.create(req)

    @GetMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseStatus(HttpStatus.OK)
    fun getById(@PathVariable("id") id: Long): Todo = todoService.getByIdKtl(id)

    @PatchMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseStatus(HttpStatus.OK)
    fun updateTodo(@PathVariable("id") id: Long, @RequestBody req: UpdateTodoRequest): Todo =
        todoService.updateTodo(id, req)


}