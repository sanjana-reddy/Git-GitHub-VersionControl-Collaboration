package com.sanjana.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoManager {

    private final List<String> tasks = new ArrayList<>();
    private final List<Boolean> completed = new ArrayList<>();

    public void addTask(String task) {
        if (task == null || task.isBlank()) {
            throw new IllegalArgumentException("Task cannot be empty");
        }

        tasks.add(task);
        completed.add(false);
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public void completeTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Invalid task index");
        }

        completed.set(index, true);
    }

    public boolean isCompleted(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Invalid task index");
        }

        return completed.get(index);
    }
}