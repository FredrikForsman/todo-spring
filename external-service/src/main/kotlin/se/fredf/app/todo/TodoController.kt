package se.fredf.app.todo

import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.web.bind.annotation.*

@RestController@RequestMapping("/todos")
class TodoController(private val todoClient: TodoClient) {

    @PostMapping
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
    fun create(@RequestBody req: CreateTodoRequest) = todoClient.create(req)

    @GetMapping("/{id}")
    @ApiOperation(
            value = "Get a Todo by id"
    )
    @ApiResponses(
            value = [
                ApiResponse(code = 200, message = "Successfully Retrieved a todo"),
                ApiResponse(code = 404, message = "No todo found with the given id")
            ]
    )
    fun getTodoById(@PathVariable("id") id: Long) = todoClient.getTodo(id)


    @PutMapping("/{id}")
    @ApiOperation(
            value = "Update a Todo"
    )
    @ApiResponses(
            value = [
                ApiResponse(code = 200, message = "Successfully updated the todo"),
                ApiResponse(code = 404, message = "No todo found with the given id"),
                ApiResponse(code = 415, message = "Unsupported media type")
            ]
    )
    fun updateTodo(@PathVariable("id") id: Long, @RequestBody req: UpdateTodoRequest) = todoClient.updateTodo(id, req)

}