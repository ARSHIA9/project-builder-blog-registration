package businesslogic;

import java.util.regex.*;


public class RegistrationValidation
{
	//creating checkuserdetails method that invoke validpassword and validemail method 
	public boolean checkUserDetails(String email, String password, String confirmPassword)
	{
		System.out.println(email);
		System.out.println(password);
		System.out.println(confirmPassword);
		if(validPassword(password,confirmPassword) && validEmail(email)) 
		{
			System.out.println("True");
		    return true;
		}
	
		  return false;
		
	}
	private boolean validPassword(String password, String confirmPassword) 
	{
//		System.out.println("validPassword");
	    //checking password constraints
		String passwordConstraints = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
//		System.out.println(passwordConstraints);
       Pattern p = Pattern.compile(passwordConstraints);
       if(password.equals(confirmPassword)) {
    	   System.out.println("condition");
       if ((p.matcher(password).matches()) && ( p.matcher(confirmPassword).matches()) ){
          return true;
       }
       }
       else {
          return false;
       }
	return false;
    
	
   }
	
	private boolean validEmail(String email) 
	{
		//checking email constraints
		System.out.println("validEmail");
		String emailConstraint = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailConstraint);
        //Matcher mat = pat.matcher(emailConstraint);
        if(pat.matcher(email).matches()) {
        	return true;
        }
        else {
        	return false;
        }

	
	}
	
}

