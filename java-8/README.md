# To Read
* Lamba Expression is anonymous method which can be defined without belonging to any Class
* [Java 8 Features](https://beginnersbook.com/2017/10/java-8-features-with-examples/)
* anonymous inner class ( before Java 8 ) vs using lambda expression ( Java 8 )
* Stream does not store the elements. It simply performs the aggregate operations such as filter() and count() to get the desired stream of data

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
| Stream<T> filter(Predicate<? super T> predicate) | ```Stream<T>``` | 


# Features
1. Lambda Expression = anonymous method
2. Method references = short notation of lambda expression to call a method --- ( :: operator used )
3. Functional interface = single abstract method
4. Interface changes = Default and static methods
5. Stream API = To perform aggregate operations such as filter() , collect(), count() , iterate() , limit() , map() etc using stream() method on any Collection
7. forEach() = default method to iterate over the collections & Streams 
8. Stream Collectors class = To group the elements of the Collection
9. StringJoiner class = To join the strings with the delimiter
10. Optional class
11. Arrays Parallel Sort
