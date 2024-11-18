package com.ndbarbearia.useCases;

public interface Command<T> {
    T execute(T entidade);
}
