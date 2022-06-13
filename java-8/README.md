# To Read
* Lamba Expression is anonymous method which can be defined without belonging to any Class
* [Java 8 Features](https://beginnersbook.com/2017/10/java-8-features-with-examples/)
* anonymous inner class ( before Java 8 ) vs using lambda expression ( Java 8 )
* Stream does not store the elements. It simply performs the aggregate operations such as filter() and count() to get the desired stream of data
* map() = transformation 
* flatMap() = transformation + flattening

# Teminology


# Annotations
|SNo| #Annotation  | #Intent |
| :---:| :---: | :---: | 
| 1 |@FunctionalInterface | |
 

# Stream interface API
|SNo| #API  | ##Intent |
| :---: | :---: | :---: |
| 1 | Stream<T> filter(Predicate<? super T> predicate); |Returns a stream consisting of the elements of this stream that match the given predicate |
| 2 | <R> Stream<R> map(Function<? super T, ? extends R> mapper); |Returns a stream consisting of the results of applying the given function to the elements of this stream |
| 3 | IntStream mapToInt(ToIntFunction<? super T> mapper); |Returns an {@code IntStream} consisting of the results of applying the given function to the elements of this stream |
| 4 | LongStream mapToLong(ToLongFunction<? super T> mapper); |Returns a {@code LongStream} consisting of the results of applying the given function to the elements of this stream |
| 5 | <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper); | Returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.  Each mapped stream is {@link java.util.stream.BaseStream#close() closed} after its contents have been placed into this stream.  (If a mapped stream is {@code null} an empty stream is used, instead.)|
| 6 | IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper); |Returns an {@code IntStream} consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.  Each mapped stream is {@link java.util.stream.BaseStream#close() closed} after its contents have been placed into this stream.  (If a mapped stream is {@code null} an empty stream is used, instead.) |
| 7 | LongStream flatMapToLong(Function<? super T, ? extends LongStream> mapper); |Returns an {@code LongStream} consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.  Each mapped stream is {@link java.util.stream.BaseStream#close() closed} after its contents have been placed into this stream.  (If a mapped stream is {@code null} an empty stream is used, instead.) |
| 8 | DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper); |Returns an {@code DoubleStream} consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.  Each mapped stream is {@link java.util.stream.BaseStream#close() closed} after its contents have placed been into this stream.  (If a mapped stream is {@code null} an empty stream is used, instead.) |
| 9 | Stream<T> distinct() |Returns a stream consisting of the distinct elements (according to {@link Object#equals(Object)}) of this stream |
| 10 | Stream<T> sorted(); |Returns a stream consisting of the elements of this stream, sortedaccording to natural order.  If the elements of this stream are not{@code Comparable}, a {@code java.lang.ClassCastException} may be thrown when the terminal operation is executed |
| 11 |Stream<T> sorted(Comparator<? super T> comparator); |Returns a stream consisting of the elements of this stream, sorted according to the provided {@code Comparator} |
| 12 |Stream<T> peek(Consumer<? super T> action); |Returns a stream consisting of the elements of this stream, additionally performing the provided action on each element as elements are consumed from the resulting stream |
| 13 |Stream<T> limit(long maxSize); |Returns a stream consisting of the elements of this stream, truncated to be no longer than {@code maxSize} in length |
| 14 |Stream<T> skip(long n); |Returns a stream consisting of the remaining elements of this stream after discarding the first {@code n} elements of the stream. If this stream contains fewer than {@code n} elements then an empty stream will be returned |
| 15 |void forEach(Consumer<? super T> action); |Performs an action for each element of this stream |
| 16 |void forEachOrdered(Consumer<? super T> action); |Performs an action for each element of this stream, in the encounter order of the stream if the stream has a defined encounter order |
| 17 |Object[] toArray(); |Returns an array containing the elements of this stream |
| 18 |<A> A[] toArray(IntFunction<A[]> generator); |Returns an array containing the elements of this stream, using the provided {@code generator} function to allocate the returned array, as well as any additional arrays that might be required for a partitioned execution or for resizing |
| 19 |T reduce(T identity, BinaryOperator<T> accumulator); |1. Performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function, and returns the reduced value 2. Sum, min, max, average, and string concatenation are all special cases of reduction |
| 20 |Optional<T> reduce(BinaryOperator<T> accumulator); |Performs a reduction on the elements of this stream, using an associative accumulation function, and returns an {@code Optional} describing the reduced value, if any |
| 21 |<U> U reduce(U identity,BiFunction<U, ? super T, U> accumulator,BinaryOperator<U> combiner); |Performs a reduction on the elements of this stream, using the provided identity, accumulation and combining functions |
| 22 |<R> R collect(Supplier<R> supplier,BiConsumer<R, ? super T> accumulator,BiConsumer<R, R> combiner); |Performs a mutable reduction operation on the elements of this stream.  A mutable reduction is one in which the reduced value is a mutable result container, such as an {@code ArrayList}, and elements are incorporated by updating the state of the result rather than by replacing the result |
| 23 |<R, A> R collect(Collector<? super T, A, R> collector); |Performs a mutable reduction operation on the elements of this stream using a {@code Collector}.  A {@code Collector} encapsulates the functions used as arguments to {@link #collect(Supplier, BiConsumer, BiConsumer)}, allowing for reuse of collection strategies and composition of collect operations such as multiple-level grouping or partitioning |


# Functional Interfaces
|SNo| #Interface  | #Abstract Method | #Intent |
|:---: | :---: | :---: | :---: |
|1 | java.util.function.Function<T, R> | R apply(T t); | 1. Function<T, R> is when you require a function that consumes one argument of type T and transforms that into a type R ( for ex : that may be when calling stream.map(func) ). T and R can in fact be the same type|
| 2| java.util.function.```Predicate<T>``` | boolean test(T t); |1. Predicate<T> is strictly a boolean-valued function 2. Predicate<T> is when you require a function that consumes one argument of type T and returns a boolean ( for ex : .filter(predicate).findFirst() ) |
| 3| UnaryOperator<T> extends Function<T, T> | |
|4| BinaryOperator<T> extends BiFunction<T,T,T> | |
| 5| java.util.function.```Supplier<T>``` |T get(); |1. Supplier is any method which takes no arguments and returns a value 2. Its job is literally to supply an instance of an expected class 3. For instance, every reference to a 'getter' method is a Supplier |
| 6| java.util.function.```Consumer<T>``` |void accept(T t); | 1. Consumer is any method which takes arguments and returns nothing 2. It is invoked for its side-effects. 3. In Java terms, a Consumer is an idiom for a void method 4. 'setter' methods are a good example|


# Class
|SNo| #Class  | #Methods |
| :---:| :---: | :---: | 
|1| java.util.Optional<T>| empty() , of(T value) , ofNullable(T value), isPresent(), ifPresent(Consumer<? super T> consumer) |
|2| [java.util.stream.Collectors](https://javaconceptoftheday.com/java-8-collectors-tutorial/)|  |
  
# [Collectors](https://javaconceptoftheday.com/java-8-collectors-tutorial/) Class
|SNo| #Method  | #Intent |
| :---:| :---: | :---: | 
|1| public static <T> Collector<T, ?, List<T>> toList()| Returns Collector that accumulates the input elements into a new List |

# Methods
|SNo| #Method  | #Type |
| :---:| :---: | :---: | 
|1 | default void forEach(Consumer<? super T> action) | ```Iterable<T>``` |
|2 | Stream<T> filter(Predicate<? super T> predicate) | ```Stream<T>``` | 


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
|9|Optional class |1. To provide a type-level solution for representing optional values instead of null references 2. to avoid NullPointerException |
|10|Arrays Parallel Sort ( Arrays.parallelSort() ) |To support the parallel sorting of array elements | 
|11|[Date & Time API](https://www.tutorialspoint.com/java8/java8_datetime_api.htm) |1. Not thread safe 2. The old API had less direct methods for date operations 3. Difficult time zone handling | 

# Reference
* [Java 8 Date/Time API](https://www.baeldung.com/java-8-date-time-intro)
* [Real Time Queries Using Java 8 Features -Employee Management System](https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/)
