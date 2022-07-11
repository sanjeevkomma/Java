# To Read

# Ways to share data between Threads
1. Make the variable volatile
2. Turn it into an AtomicBoolean
3. Use full-blown synchronization around code that uses it
4. Make variable as Static
5. Reference to the main thread in other thread and making that variable visible

# Reference
* [Sharing a variable between multiple different threads](https://stackoverflow.com/questions/13582395/sharing-a-variable-between-multiple-different-threads#:~:text=You%20should%20use%20volatile%20keyword,same%20time%20without%20any%20problem.)
