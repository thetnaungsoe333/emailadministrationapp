import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private String email;
    private String companySuffix = "aeycompany.com";
    private int mailboxCapacity = 500;
    private int passwordLength = 10;

    // Constructor to receive the first name and last name
    public Email(String firstname, String lastname){
        this.firstName = firstname;
        this.lastName = lastname;
        //System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method that asking for the department and return this department
        this.department = setDepartment();
        System.out.println("Department : " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(passwordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your email is: " + email);
    }

    // Ask for the department
    private String setDepartment(){
        System.out.print("New Employee: Welcome " + firstName + "! Type Your department code: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) {
            return "sales";
        }else if(depChoice == 2){
            return "development";
        }else if(depChoice == 3){
            return "accounting";
        }else{
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++ ){
            int rand = (int)(Math.random() * passwordSet.length());
            //System.out.println(rand);       // 20
            password[i] = passwordSet.charAt(rand);
            //System.out.println(password[i]);    // U    (return String)
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // get the mailbox capacity
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altemail){
        this.alternateEmail = altemail;
    }

    // Get the alternate email
    public String getAlternateEmail(){
        return alternateEmail;
    }

    // Set the password
    public void setPassword(String password){
        this.password = password;
    }

    // Get the password
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

}
