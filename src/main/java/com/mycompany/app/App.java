// Simple Java-Maven project to test
// the jenkins javadoc plugin
 
/**
* <h1>App</h1>
* class that prints Hello World!
*
* @author  Harsha3991
* @version 1.0
* @since   08/30/2021
* <img src="doc-files/maven.png">
*/
package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
