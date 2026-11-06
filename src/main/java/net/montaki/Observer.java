package net.montaki;


@FunctionalInterface
public interface Observer {
    void update(int newState);
}