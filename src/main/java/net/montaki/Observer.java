package net.montaki;


@FunctionalInterface
public interface Observer {
    void update(Observable observable);
}