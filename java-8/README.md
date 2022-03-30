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

# Class
| #Class  | #Method |
| :---: | :---: | 
| Optional<T>| empty() , of(T value) , ofNullable(T value) |
  
# Methods
| #Method  | #Type |
| :---: | :---: | 
| default void forEach(Consumer<? super T> action) | ```Iterable<T>``` |
| Stream<T> filter(Predicate<? super T> predicate) | ```Stream<T>``` | 


# Features

|#SNO|#Feature  | #Description |
| :---: | :---: | :---: |
|1|Lambda Expression | anonymous method that does not belong to any class ( It was annoymous inner class before Java8 )|
|2|Method references | short notation of lambda expression to call a method --- ( :: operator used )|
|3|Functional interface |single abstract method. It can have default methods & static methods also |
|4|Interface changes | Default and static methods are introduced in Interface|
|5|Stream API |To perform aggregate operations such as filter() , collect(), count() , iterate() , limit() , map() etc using stream() method on any Collection |
|6|forEach() |default method to iterate over the collections & Streams |
|7|Stream Collectors class | To group the elements of the Collection|
|8|StringJoiner class |To join the strings with the delimiter |
|9|Optional class |to avoid NullPointerException |
|10|Arrays Parallel Sort ( Arrays.parallelSort() ) |To support the parallel sorting of array elements | 

