package day16Assignment;

public class TranscationException extends Exception {
	String s;
	 TranscationException(String string) {
		 
		 s=string;
			}

	 public String toString() { 
	      return ("Transaction= "+s);


	 }
}
