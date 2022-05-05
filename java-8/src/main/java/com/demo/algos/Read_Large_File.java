package com.demo.algos;

public class Read_Large_File {
	
	// https://www.baeldung.com/java-read-lines-large-file
	
	// Streaming With Apache Commons IO

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	LineIterator it = FileUtils.lineIterator(theFile, "UTF-8");
	try {
	    while (it.hasNext()) {
	        String line = it.nextLine();
	        // do something with line
	    }
	} finally {
	    LineIterator.closeQuietly(it);
	}

}
