package org.example.emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String companyEmail = "ajibcolour.com";

    //  Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        commented this out because we don't need it information appearing twice
//    System.out.println("EMAIL CREATED: " + this.firstName +" "+this.lastName);

    //   Call a method calling for the department - return the department
        this.department = setDepartment();
//        System.out.println("Department: " + this.department);

    //   Call a method that return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password );

    //   Combine elements to generate email
    //   email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyEmail;
        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + companyEmail;
//        System.out.println("Your email is: " + email);
    }

    //   Ask for the department
    private String setDepartment() {
        System.out.println("New worker: " + firstName + ". Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none" + "\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){return "Sales";}
        else if (depChoice == 2) {return "Development";}
        else if (depChoice == 3) {return "Account";}
        else {return " ";}
    }
    //   Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOP0RSTUVWXYZ123456789";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
    //    System.out.println(passwordSet.charAt(rand));
        }
        return new String(password);
    }

    //   Set the mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    //   Set the alternative email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //   Change the password
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

     //    Setting Getter's the mailbox capacity,alternateEmail & changePassword
    public int getMailBoxCapacity() {return mailBoxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}

     //    To get methods to display the name, email and mailbox capacity
    public String showinfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }

}