package phonebook;

import java.util.*;

public class HashTableDemo
{
    public static void main(String[] args)
    {
        // Create a new Hashtable to store our phonebook
        Hashtable<String,Object> phonebook = new Hashtable<String,Object>();
       
        // Add some entries to the phonebook
        phonebook.put("Simon", "01123-123123");
        phonebook.put("Thom", "01123-321321");
        phonebook.put("Lee", "01123-323323");
        phonebook.put("Adam", "01123-758493");
        phonebook.put("Jim", "01123-859473");
        phonebook.put("Alan", "01123-095763");
        phonebook.put("Peter", "01123-657482");
        phonebook.put("Fred", "01123-267483");
        phonebook.put("Sam", "01123-856472");
        phonebook.put("Liam", "01123-098765");

        Enumeration names = phonebook.keys();

      // Retrieve a single value for a given key
        
       
        Scanner kb = new Scanner(System.in);
        String choice = null;
        System.out.println("Which persons phone number do you wish to find");
        
        String name;
        while(names.hasMoreElements())
        {
        	try {
    			
    			choice = kb.nextLine();
    		}
    		catch(Exception e){
    			System.out.println("\nInvalid selection. Please try again.");
    		}
        	name = (String) names.nextElement();
        	String phone = (String)phonebook.get(choice);
            System.out.println(choice + " " + phone);
           break;
            
        }
        
    }
}

