package com.perscholas.jenkins_hello;

public class HelloJenkins {

	public static void main(String[] args) {
		System.out.println(helloJenkins());
		System.out.println(helloJenkinsAgain());
		System.out.println("Did I pull this back to eclipse");
	}
	
	public static String helloJenkins() {
		return "Hello Jenkins!";
	}
	
	public static String helloJenkinsAgain() {
		return "Hello Jenkins again!!!";
	}

}
