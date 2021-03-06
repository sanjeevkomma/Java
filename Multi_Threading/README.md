# Multithreading

# To Read
* ConcurrentHashMap is thread safe without synchronizing the whole map. Reads can happen very fast while write is done with a lock
* ConcurrentHashMap = ConcurrentHashMap consist of internal segments which can be viewed as independent HashMaps Conceptually. All such segments can be locked by separate threads in high concurrent executions. So, multiple threads can get/put key-value pairs from ConcurrentHashMap without blocking/waiting for each other. This is implemented for higher throughput.
* Collections.synchronizedMap() = we get a synchronized version of HashMap and it is accessed in blocking manner. This means if multiple threads try to access synchronizedMap at same time, they will be allowed to get/put key-value pairs one at a time in synchronized manner
* SynchronizedMap and ConcurrentHashMap are both thread safe class and can be used in multithreaded application, the main difference between them is regarding how they achieve thread safety
* We can achieve the concurrency with parallel processing or asynchronous behavior as task can be divided into subtasks and these subtasks can be executed in parallel 

# Terminology
* thread safe = 
* ConcurrentHashMap = It will maintain the lock at the segment level
* Synchronised Hashmap = It will maintain the lock at the object level

# How to Avoid Deadlock
1. Avoid Nested Locks
2. Avoid Unnecessary Locks
3. Using Thread Join

# Interface
|SNo| #Interface | #Intent |
| :---:| :---: | :---: | 
|1 |java.lang.Runnable |   |
|2 |java.util.concurrent.Callable | |
|3 |java.util.concurrent.ExecutorService| |
| 4|java.util.concurrent.ScheduledExecutorService| |
|5 | ```java.util.concurrent.Future<V>``` | A Future represents the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation|  

# Class
|SNo| #Class | #Usage |
| :---:| :---: | :---: | 
| 1|java.util.concurrent.Executors |   |
| 2|java.lang.Thread| |
| 3|[java.util.concurrent.ThreadPoolExecutor](https://www.javatpoint.com/java-threadpoolexecutor)| |
| 4|[java.util.concurrent.ScheduledThreadPoolExecutor](https://www.tutorialspoint.com/java_concurrency/concurrency_scheduledthreadpoolexecutor.htm)| |

# Executors Class Methods
|SNo| #Method | #Usage |
| :---:| :---: | :---: | 
| 1|Executors.newScheduledThreadPool(5) |Creates a thread pool that can schedule commands to run after a given delay, or to execute periodically   |
| 2|Executors.defaultThreadFactory()| |
| 3|Executors.newCachedThreadPool()||
| 4|Executors.newFixedThreadPool(5)| 1. Creates a thread pool that reuses a fixed set of threads operating off a shared unbounded queue. 2. If any thread terminates due to a failure during execution prior to shutdown, a new one will take its place if needed to execute subsequent tasks|

# Method
|SNo| #Method  | #Definition |
| :---:| :---: | :---: | 
|1 | synchronized void join(long millis) , synchronized void join(long millis, int nanos) | The join() method is used to wait for a thread to complete execution. The join() method of a Thread instance can be used to "join" the start of a thread's execution to the end of another thread's execution so that a thread will not start running until another thread has ended |
|2 | void sleep(long millis) |  |
| 3| void wait(long timeout) | The wait() method is used to wait for a notification to be sent on an object |
| 4| void yield() |  |
| 5|void notify()||
| 6|native void notifyAll()||

# Reference
* [reentrantlock](https://stackoverflow.com/questions/11821801/why-use-a-reentrantlock-if-one-can-use-synchronizedthis)
* [ConcurrentHashMap vs Synchronized HashMap](https://stackoverflow.com/questions/1291836/concurrenthashmap-vs-synchronized-hashmap)
* https://github.com/eugenp/tutorials/tree/master/core-java-modules/core-java-io-2
