package de.burgerit.myclass.actions;

public interface Action<R, P> {
    R execute(P param);
}

