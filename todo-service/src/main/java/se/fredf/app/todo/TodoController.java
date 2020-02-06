//package se.fredf.app.todo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//import reactor.core.publisher.Mono;
//
//@RestController
//@RequestMapping("/todos")
//public class TodoController {
//
//    private final TodoService todoService;
//
//    @Autowired
//    public TodoController(TodoService todoService) {
//        this.todoService = todoService;
//    }
//
//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    Todo create(@RequestBody final Todo req) {
//        return todoService.create(req);
//    }
//
//    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    Mono<Todo> getById(@PathVariable("id") final long id) {
//        return todoService.rxGetById(id);
//    }
//
//    @PatchMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    Todo updateTodo(@PathVariable("id") final long id, @RequestBody final UpdateTodoRequest req) {
//        return todoService.updateTodo(id, req);
//    }
//
//}
