package org.java8.test;

public @FunctionalInterface
interface Convertor<T,P> {
    P convert(T t);
}
