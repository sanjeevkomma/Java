package com.demo.stream_api;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoStreams {
    
	public static void main(String[] args) {
        
		Stream<String> stream1 = Stream.of("1", "2", "3");
        
		Stream<String> stream2 = Stream.of("A", "B", "C");
        
		Stream<String> stream1_stream2 = Stream.concat(stream1, stream2);
        
		System.out.println(stream1_stream2.collect(Collectors.toList()));
		
    }
}
