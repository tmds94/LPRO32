package BusinessLogic;

import Communications.PirateProtocol; 
import Communications.SocketClient;

    /** 
     * This class represents the Authentication of the client.
     * It has methods to validate parameters passed from the interface package,
     * a method to encrypt the password and login/register methods.
     */

public class Authentication  {
    
     private final SocketClient client;
        
     //codes to signal what we will be passing to other layers
     private static final int REGISTER = 1;  
     private static final int LOGIN = 2;
   
     //class variables
     PirateProtocol pirate;       // variable to use the protocol methods
     
     
        /**
        * the constructor initializes the class variables
        */
   
     public Authentication(SocketClient client) 
     {
        this.client = client;
        pirate = new PirateProtocol(client);
     }
     
     
     /** 
          *This method checks if the user and pass strings have more than 3 chars.
          *
          * @param user string that's going to be checked
          * @param pass string that's going to be checked
          *
          * @return true if user and pass are valid, false if either of them fail the test.
          */
     
     public boolean validate(String user, String pass)
     {
         
         if( user.equals("") || pass.equals("") || (user.length() < 3) || (pass.length() < 3) )
         return false;
         
         else 
         return true;        
     }
     
    /**
         * This method checks if the email is a valid email address
         *
         * @param email string that's going to be checked
         *
         * @return 1 if the email is valid and 0 if the the email isn't valid
         */
          
    
     public boolean emailcheck(String email)
     {
        String regex; // This string has the parameters we want to check the email with.
        regex = "^([a-zA-Z0-9]+[a-zA-Z0-9._%\\-\\+]*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,4})$";
        
        return email.matches(regex);        
     }
     
     
     /**
        * This method encrypts the str using the MD5 algorithm
        *
        * @param str string that's going to be encrypted
        *
        * @return encrypted string if it worked, null if it didn't
        */
     
    public String encrypt(String str)
    {
        try 
        {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(str.getBytes());
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < array.length; ++i) 
            {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } 
        catch (java.security.NoSuchAlgorithmException e) 
        {
            return null;
        }
    }
    
     /**
        * This method attempts to logs a user in.
        * <p> 
        * It starts by sending the username and password ( encrypted ), encoded using the protocol through a socket.
        * Afterwards, we wait for a response,decode it using the protocol and return the appropriate value ( either success or failure ).
        *
        * @param user username of the person trying to login
        * @param pass password of the person trying to login ( This password must not be encrypted )
        *
        * @return 1 if it worked, zero in case of an exception and -1 if an unkown error occured
        *
        * @see BusinessLogic.Authentication#encrypt(String str)
        * @see Communications.PirateProtocol#encode(int, java.lang.String[], int)
        * @see Communications.PirateProtocol#decode(String)
        * @see Communications.SocketClient#send(String message)
        * @see Communications.SocketClient#receive()
        */
    
    public String login(String user, String pass) 
    {
        
       // String variables
       String[] decoded;                // variable that stores the decoded version of the received message
       String[] aux = new String[2];    // variable that contains the information to be encoded
       
       // encrypting the password
       pass = encrypt(pass);
       
       // placing user and pass on a String array so we can pass it to the encode function
       aux[0] = user;
       aux[1] = pass;
       
       decoded = pirate.run(LOGIN,aux,2);
       
       // checking what we received and returning
       if (decoded[0].equals("2") && decoded[1].equals("OK"))
       {
          // User logged in successfully
          return decoded[2]; 
       }
       else if (decoded[0].equals("2") && decoded[1].equals("BANNED"))
       {
           // Error while trying to login the user
           return decoded[1];
       }
       else 
       {
           // Unkown error occurred
           return "ERROR";
       }
      
    }
    
    /** This method attempts to register a user in the database.
        * <p>
        * It starts by sending the name, username, password ( encrypted ), email, security question and answer encoded using the protocol through a socket.
        * Afterwards, we wait for a response,decode it using the protocol and return the appropriate value ( either success or failure ).
        *
        * @param name           string containing the name
        * @param user           string containing the username
        * @param pass           string containing the password
        * @param email          string containing the email
        * @param question       string containing the security question
        * @param answer         string containing the answer to the security question
        *
        * @return 1 if it worked, zero in case of an exception and -1 if an unkown error occured
        *
        * @see BusinessLogic.Authentication#encrypt(String str)                                       
        * @see Communications.PirateProtocol#encode(int, java.lang.String[], int)      
        * @see Communications.PirateProtocol#decode(String )                               
        * @see Communications.SocketClient#send(String message)                                
        * @see Communications.SocketClient#receive()
        */
    
    public int register(String name, String user, String pass,String email, String question, String answer ) 
    {
       
       // string variables
       String lockpass;                 // variable that stores the encrypted pass
       String[] aux = new String[6];    // variable that stores the information we are encoding
       String[] decoded;                // variable that stores the decoded information from the received message
       
       // encrypting the password
       lockpass = encrypt(pass);
       
       // placing the information on a String array so we can pass it to the encode function
       aux[0] = name;
       aux[1] = user;
       aux[2] = lockpass;
       aux[3] = email;
       aux[4] = question;
       aux[5] = answer;
       
       // calling the protocol with the information and waiting for an answer
       decoded = pirate.run(REGISTER,aux,6);
       
       //checking what we received and returning
       if (decoded[0].equals("1") && decoded[1].equals("OK"))
       {
          return 1; 
       }
       else if (decoded[0].equals("1") && decoded[1].equals("ERROR"))
       {
           return 0; // Error occurred
       }
       else 
       {
           return -1; //unkown Error occurred
       }
       
    }   

}
