package in.hcl.firstspringdemo.main;

import in.hcl.firstspringdemo.util.Greeting;

/**
 * Hello world!
 *
 */
public class WithoutSpringTest 
{
    public static void main(String[] args)
    {
    	//hard coding 
        Greeting greeting = new  Greeting();
        greeting.greet();
    }
    
}


