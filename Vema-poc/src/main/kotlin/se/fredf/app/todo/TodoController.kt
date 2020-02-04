//package se.fredf.app.todo
//
//import org.springframework.http.HttpStatus
//import org.springframework.http.MediaType
//import org.springframework.web.bind.annotation.*
//
//@RestController
//@RequestMapping("/todos")
//class TodoController(private val todoService: TodoService) {
//
//    @PostMapping("/create", produces = [MediaType.APPLICATION_JSON_VALUE])
//    @ResponseStatus(HttpStatus.CREATED)
//    fun create(@RequestBody req: Todo): Todo = todoService.create(req)
//
//    @GetMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
//    fun getById(@PathVariable("id") id: Long): Todo = todoService.getByIdKtl(id)
//
//    @PatchMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
//    fun updateTodo(@PathVariable("id") id: Long, @RequestBody req: UpdateTodoRequest): Todo
//            = todoService.updateTodo(id, req)
//
//}