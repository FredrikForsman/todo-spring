package se.fredf.app.todo

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import se.fredf.app.exception.ResourceNotFoundException

@Service
class TodoServiceImpl(private val todoRepository: TodoRepository) : TodoService {

    override fun create(todo: Todo): Todo {
//        return catRepository.findByName(req.name)?.let {
//            throw CatAlreadyExistException("A todo with name: ${req.name} already exist")
//        } ?: catRepository.save(Cat(req.name))
        return todoRepository.save(todo)
    }

    override fun rxGetById(id: Long): Mono<Todo> {
        return todoRepository.findByIdOrNull(id)?.let {
            Mono.just(it)
        } ?: throw ResourceNotFoundException("Did not find todo with id: $id")
    }

    override fun getByIdKtl(id: Long): Todo {
        return todoRepository.findByIdOrNull(id)?.let {
            it
        } ?: throw ResourceNotFoundException("Did not find todo with id: $id")
    }

    override fun getByIdOptional(id: Long): Todo {
        return todoRepository.findById(id).orElseThrow {
            throw ResourceNotFoundException("Did not find todo with id: $id")
        }
    }

    override fun updateTodo(id: Long, req: UpdateTodoRequest): Todo {
        return todoRepository.findByIdOrNull(id)?.let { todo ->
            todo.name = req.name
            todoRepository.save(todo)
        } ?: throw ResourceNotFoundException("Did not find todo with id: $id")
    }
}
