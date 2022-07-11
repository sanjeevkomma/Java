# To Read

# Ways to share data between Threads
1. Make the variable volatile;
2. Turn it into an AtomicBoolean
3. Use full-blown synchronization around code that uses it
4. Make variable as Static
5. Reference to the main thread in other thread and making that variable visible
