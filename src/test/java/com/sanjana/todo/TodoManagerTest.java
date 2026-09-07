package com.sanjana.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoManagerTest {

    @Test
    void shouldAddTask() {
        TodoManager manager = new TodoManager();

        manager.addTask("Complete GitHub assignment");

        assertEquals(1, manager.getTaskCount());
        assertEquals("Complete GitHub assignment", manager.getTasks().get(0));
    }

    @Test
    void shouldRejectEmptyTask() {
        TodoManager manager = new TodoManager();

        assertThrows(
            IllegalArgumentException.class,
            () -> manager.addTask("")
        );
    }

    @Test
    void shouldMarkTaskAsCompleted() {
        TodoManager manager = new TodoManager();

        manager.addTask("Complete GitHub assignment");
        manager.completeTask(0);

        assertTrue(manager.isCompleted(0));
    }

    @Test
    void shouldRejectInvalidCompletionIndex() {
        TodoManager manager = new TodoManager();

        manager.addTask("Complete GitHub assignment");

        assertThrows(
                IndexOutOfBoundsException.class,
                () -> manager.completeTask(5)
        );
    }
}
