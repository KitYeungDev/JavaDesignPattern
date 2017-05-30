package com.kit.design.pattern.observer.customization;

/**
 * Created by devkit on 17-5-30.
 *
 * A subject which being observed .
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
