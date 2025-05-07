package com.example;

@FunctionalInterface
public interface BinaryOperation<T> {
    T apply(T a, T b);
}

