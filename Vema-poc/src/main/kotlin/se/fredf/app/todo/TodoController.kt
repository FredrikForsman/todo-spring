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
    @ApiOperation(
        value = "Create a Todo"
    )
    @ApiResponses(
        value = [
            ApiResponse(code = 201, message = "Successfully created a Todo"),
            ApiResponse(code = 400, message = "Bad request, you have probably not provided the needed information"),
            ApiResponse(code = 409, message = "Conflict! A Todo with the given name already exist")
        ]
    )
    fun create(@RequestBody req: CreateTodoRequest): Todo = todoService.create(req)

    @GetMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(
        value = "Create a Todo"
    )
    @ApiResponses(
        value = [
            ApiResponse(code = 200, message = "Successfully Retrieved a todo"),
            ApiResponse(code = 404, message = "No todo found with the given id")
        ]
    )
    fun getById(@PathVariable("id") id: Long): Todo = todoService.getByIdKtl(id)

    @PatchMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(
        value = "Create a Todo"
    )
    @ApiResponses(
        value = [
            ApiResponse(code = 200, message = "Successfully updated the todo"),
            ApiResponse(code = 404, message = "No todo found with the given id")
        ]
    )
    fun updateTodo(@PathVariable("id") id: Long, @RequestBody req: UpdateTodoRequest): Todo =
        todoService.updateTodo(id, req)

}