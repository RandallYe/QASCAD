package org.eclipse.epsilon.ad2prism.tools;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AD2PRISM_Tools {
	static final String word = "[a-zA-Z][a-zA-Z0-9_]*";
	public String parseReachesAt(String prop) { 
		// activity_name reaches at activity_name::...::node_name
        Pattern pat = Pattern.compile(
        		"(" + word + ")\\s+reaches\\s+at\\s+(" + 
        		"(" + word + "\\s*::\\s*)+" + "(" + word + "))");
        		//"([a-zA-Z][a-zA-Z0-9_]*)\\s*reaches\\s*at\\s*(([a-zA-Z][a-zA-Z0-9_]*::)+([a-zA-Z][a-zA-Z0-9_]*))");
		 
		Matcher m = pat.matcher(prop);
		  
		if (m.find( )) {
			/*System.out.println("Matched: " + m.group(0) );
		    System.out.println("Activity name: " + m.group(1) );
		    System.out.println("FQN Node name: " + m.group(2) );
		    System.out.println("FQN: " + m.group(3) );
		    System.out.println("Node name: " + m.group(4) );*/
		    return m.group(0) + "$" + m.group(1) + "$" + m.group(2) 
		    	   + "$" + m.group(3) + "$" + m.group(4);
		} else {
		    //System.out.println("NO MATCH");
		    return "";
		}
    }
	
	public String parseTerminated(String prop) {
		// activity_name terminated successfully
        Pattern pat = Pattern.compile(
        		"(" + word + ")\\s+terminated\\s+successfully\\s*");
		 
		Matcher m = pat.matcher(prop);
		  
		if (m.find( )) {
			/*System.out.println("Matched: " + m.group(0) );
		    System.out.println("Activity name: " + m.group(1) );*/
		    return m.group(0) + "$" + m.group(1);
		} else {
		    //System.out.println("NO MATCH");
		    return "";
		}
	}
	
	public String parseFailed(String prop) {
		// activity_name failed
        Pattern pat = Pattern.compile(
        		"(" + word + ")\\s+failed\\s*");
		 
		Matcher m = pat.matcher(prop);
		  
		if (m.find( )) {
			/*System.out.println("Matched: " + m.group(0) );
		    System.out.println("Activity name: " + m.group(1) );*/
		    return m.group(0) + "$" + m.group(1);
		} else {
		    //System.out.println("NO MATCH");
		    return "";
		}
	}
	
	public String parseTerm(String prop) {
		// activity_name terminated
        Pattern pat = Pattern.compile(
        		"(" + word + ")\\s+terminated\\s*");
		 
		Matcher m = pat.matcher(prop);
		  
		if (m.find( )) {
			/*System.out.println("Matched: " + m.group(0) );
		    System.out.println("Activity name: " + m.group(1) );*/
		    return m.group(0) + "$" + m.group(1);
		} else {
		    //System.out.println("NO MATCH");
		    return "";
		}
	}
}
