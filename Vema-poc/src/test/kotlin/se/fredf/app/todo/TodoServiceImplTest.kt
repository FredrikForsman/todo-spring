//package se.fredf.app.todo
//
//import junit.framework.Assert.assertEquals
//import org.junit.Before
//import org.junit.Test
//import org.mockito.Mock
//import org.mockito.Mockito.*
//import org.mockito.MockitoAnnotations
//
//internal class TodoServiceImplTest {
//
//    private lateinit var subject: TodoServiceImpl
//
//    @Mock
//    private lateinit var todoRepository: TodoRepository
//
//    @Before
//    fun setUp() {
//        MockitoAnnotations.initMocks(this)
//        subject = TodoServiceImpl(todoRepository)
//    }
//
//    @Test
//    fun `create todo`() {
//
//        // given
//        val todo = mock(CreateTodoRequest::class.java)
//        `when`(todoRepository.save(todo)).thenReturn(todo)
//        // when
//        val actual = subject.create(todo)
//        // then
//        assertEquals(todo, actual)
//        verify(todoRepository, times(1)).save(todo)
//        verifyNoMoreInteractions(todoRepository)
//    }
//
//}