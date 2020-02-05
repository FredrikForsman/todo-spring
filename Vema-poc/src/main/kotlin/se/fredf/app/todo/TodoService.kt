package se.fredf.app.todo

import reactor.core.publisher.Mono

interface TodoService {

    fun create(req: CreateTodoRequest): Todo
    fun rxGetById(id: Long): Mono<Todo>
    fun getByIdKtl(id: Long): Todo
    fun getByIdOptional(id: Long): Todo
    fun updateTodo(id: Long, req: UpdateTodoRequest): Todo

}