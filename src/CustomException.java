import java.util.Scanner;

// TODO: Create class InvalidAgeException extends Exception
// Create a constructor that accepts a message string and passes it to super(message)

class InvalidAgeException extends Exception{

	public InvalidAgeException(String msg){
		
		super(msg);
	}
}

public class CustomException {
    
    // TODO: Create a static method validate(int age) that throws InvalidAgeException
    // Check if age < 18, throw new InvalidAgeException("Not eligible to vote")
    // Else print "Eligible to vote"

	static void validate(int age) throws InvalidAgeException{

		if(age<18){

			throw new InvalidAgeException("Not eligible to vote");

		}else{

			System.out.println("Eligible to vote");

		}

	}

    
        // TODO: Read age
        
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int age= sc.nextInt();
		
		try{

			validate(age);

		}
		catch(InvalidAgeException e){

			System.out.println("Exception: "+e.getMessage());
	
		}
		
		sc.close();
	}
}