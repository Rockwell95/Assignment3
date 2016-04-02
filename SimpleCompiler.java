import org.antlr.v4.runtime.*;
import java.io.*;

public class SimpleCompiler {
    public static void main(String[] args) throws Exception {
		
		
		if (args.length != 1) {
			System.err.println("Error: Invalid use of command line argument, expected file name");
			System.exit(0); 			
		}

		FileInputStream in
			= new FileInputStream(args[0]);
				
			
        SimpleParser parser = new SimpleParser(args[0]);

        parser.start();
    
    }
}