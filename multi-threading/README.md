# Multithreading

# How to Avoid Deadlock
1. Avoid Nested Locks
2. Avoid Unnecessary Locks
3. Using Thread Join

# Interface
| #Interface | #Usage |
| :---: | :---: | 
|Runnable |   |
|Callable | |
|Future | |
|ExecutorService| |
|ScheduledExecutorService| |

# Class
| #Class | #Usage |
| :---: | :---: | 
|Executors |   |
|Thread| |

# Method
| #Method  | #Definition |
| :---: | :---: | 
| join() | The join() method is used to wait for a thread to complete execution. The join() method of a Thread instance can be used to "join" the start of a thread's execution to the end of another thread's execution so that a thread will not start running until another thread has ended |
| Thread.sleep(100) |  |
| wait() | The wait() method is used to wait for a notification to be sent on an object |
|  |  |

# Reference
* [reentrantlock](https://stackoverflow.com/questions/11821801/why-use-a-reentrantlock-if-one-can-use-synchronizedthis)
* [ConcurrentHashMap vs Synchronized HashMap](https://stackoverflow.com/questions/1291836/concurrenthashmap-vs-synchronized-hashmap)
