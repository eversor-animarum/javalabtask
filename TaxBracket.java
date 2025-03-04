package com.tutorial.demo;
import java.util.Scanner;

 //Overall score 6/10, learn the SOLID principles

/*This program is to figure out the taxes to be paid by a citizen of certain status
either married or single*/
interface TaxBracket{
    static void main(String[] args){
        Scanner userInput= new Scanner(System.in);

        //We'd first ask of the user's name
        System.out.println("What's your name:");
        String name=userInput.nextLine();
        
        
        //States condition to prevent errors
        if (name.isEmpty() || !name.matches("[a-zA-Z\\s]+") )
        {System.out.println("Input is invalid ");}


        //asks for user's income
        System.out.println("What's your income:");
        double income=userInput.nextDouble();
        userInput.nextLine();
         System.out.printf("Your income is: %.2f%n",income);
         //To prevent negatives
         if (income<=0){
         System.out.println("You can proceed to exit the program");
         }


        //asks for marital status
        System.out.println(name +" "+"Are you married or single?");
        System.out.println("Enter 'm' for married and 's' for single");
 
        //Let's use a switch case for the conditions
        String maritalStatus=userInput.nextLine();
        System.out.println("Input either 'm' or 's' to proceed");
        if (maritalStatus.isEmpty()){
            System.out.println("Input either 'm' or 's' to proceed");
        }

            //Introduces the switch case
            switch (maritalStatus){
             case "m":
             if(income<=64_000){
             double taxRate= 0.1;
             double taxes= income*taxRate;
             System.out.println("You're to pay"+" "+ taxes+ " "+"in taxes");
            }
                //Higher income earners
            else if(income>64_000){
            double newTaxRate= 0.25;
            double tax1= income*0.1;
            double tax2= tax1 + (income*newTaxRate);
            System.out.println("You're to pay"+" "+ tax2+ " "+"in taxes");
            }
             break;
            

                //if the user is single
            case "s":
            if(income<=32_000){
            double taxRate= 0.1;
            double taxes= income*taxRate;
            System.out.println("You're to pay"+" "+ taxes+ " "+"in taxes");
            }
             //for those with a higher taxbracket
            else if(income>32_000){
            double newTaxRate= 0.25;
            double tax1= income*0.1;
            double tax2= tax1 + (income*newTaxRate);
            System.out.println("You're to pay"+" "+ tax2+ " "+"in taxes");
             }
             break;
               
            default:
            System.out.println("Invalid input");
            break;
            }

    //We close the scanner method
        userInput.close();
    }
}