# To Read


# Executors class
| #Method  | #Description |
| :---: | :---: | 
| 1. public static ExecutorService newFixedThreadPool(int nThreads) 2. public static ExecutorService newFixedThreadPool(int nThreads,ThreadFactory threadFactory) | Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue. At any point, at most nThreads threads will be active processing tasks. If additional tasks are submitted when all threads are active, they will wait in the queue until a thread is available. If any thread terminates due to a failure during execution prior to shutdown, a new one will take its place if needed to execute subsequent tasks. The threads in the pool will exist until it is explicitly shutdown |
| 1. public static ExecutorService newCachedThreadPool() 2. public static ExecutorService newCachedThreadPool(ThreadFactory threadFactory) | Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available. These pools will typically improve the performance of programs that execute many short-lived asynchronous tasks. Calls to execute will reuse previously constructed threads if available. If no existing thread is available, a new thread will be created and added to the pool. Threads that have not been used for sixty seconds are terminated and removed from the cache. Thus, a pool that remains idle for long enough will not consume any resources. Note that pools with similar properties but different details (for example, timeout parameters) may be created using ThreadPoolExecutor constructors |


# Reference
* [Executors.newCachedThreadPool() versus Executors.newFixedThreadPool()](https://stackoverflow.com/questions/949355/executors-newcachedthreadpool-versus-executors-newfixedthreadpool)
