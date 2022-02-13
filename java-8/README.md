# To Read
* Lamba Expression is anonymous method which can be defined without belonging to any Class
* [Java 8 Features](https://beginnersbook.com/2017/10/java-8-features-with-examples/)

# Teminology
* Predicate = 

# Annotations
1. @FunctionalInterface
2. 

# Functional Interfaces
| #Interface  | #Abstract Method |
| :---: | :---: | 
| Function<T, R> | R apply(T t); |
| ```Predicate<T>``` | boolean test(T t); |
| UnaryOperator<T> extends Function<T, T> | |
| BinaryOperator<T> extends BiFunction<T,T,T> | |
| ```Supplier<T>``` |T get(); |
| ```Consumer<T>``` |void accept(T t); |
  
# Methods
| #Method  | #Type |
| :---: | :---: | 
| default void forEach(Consumer<? super T> action) | ```Iterable<T>``` |


# Features
1. Lambda Expression = anonymous method
2. Method references = short notation of lambda expression to call a method --- ( :: operator used )
3. Functional interfaces
4. Interface changes: Default and static methods
5. Streams
6. Stream filter
7. forEach()
8. Collectors class
9. StringJoiner class
10. Optional class
11. Arrays Parallel Sort
