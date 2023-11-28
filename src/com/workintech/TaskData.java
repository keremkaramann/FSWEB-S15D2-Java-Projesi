package com.workintech;

import entity.Task;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unAssignedTask;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unAssignedTask) {
        this.annsTasks = annsTasks != null ? annsTasks : new HashSet<>();
        this.bobsTasks = bobsTasks != null ? bobsTasks : new HashSet<>();
        this.carolsTasks = carolsTasks != null ? carolsTasks : new HashSet<>();
        this.unAssignedTask = unAssignedTask != null ? unAssignedTask : new HashSet<>();
    }

    public Set<Task> getTasks(String owner) {
        if (owner.equalsIgnoreCase("ann")) {
            return this.annsTasks;
        }
        if (owner.equalsIgnoreCase("bob")) {
            return this.bobsTasks;
        }
        if (owner.equalsIgnoreCase("carol")) {
            return this.carolsTasks;
        }
        if (owner.equalsIgnoreCase("all")) {
            return getUnion(annsTasks, bobsTasks, carolsTasks);
        }
        return new HashSet<>();
    }

    private Set<Task> getUnion(Set<Task>... sets) {
        HashSet<Task> total = new LinkedHashSet<>();
        for (var tasks : sets) {
            total.addAll(tasks);
        }
        return total;
    }

    public Set<Task> getIntersection(Set<Task> first, Set<Task> second) {
        Set<Task> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    public Set<Task> getDifference(Set<Task> first, Set<Task> second) {
        Set<Task> difference = new HashSet<>(first);
        difference.removeAll(second);
        return  difference;
    }

    public void setAnnsTasks(Set<Task> annsTasks) {
        this.annsTasks = annsTasks;
    }

    public void setBobsTasks(Set<Task> bobsTasks) {
        this.bobsTasks = bobsTasks;
    }

    public void setCarolsTasks(Set<Task> carolsTasks) {
        this.carolsTasks = carolsTasks;
    }
}
