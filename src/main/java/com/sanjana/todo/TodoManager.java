package com.sanjana.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoManager {

    private final List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        if (task == null || task.isBlank()) {
            throw new IllegalArgumentException("Task cannot be empty");
        }
        tasks.add(task);
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    public int getTaskCount() {
        return tasks.size();
    }
}
