package com.tutorial.demo;

public class CommissionEmployee {
    //creating the private fields
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    public double grossSales;
    public double commissionRate;

    //setting up the constructor to initialize the values
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        setGrossSales(grossSales); // Use setter for validation
        setCommissionRate(commissionRate); // Use setter for validation
    }

    //creating a setter for the grosssales field
    public void setGrossSales(double grossSales) {
        /*we have to create an exception for this field */
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales cannot be less than 0");
        }
        //now we create the setter for this field
        this.grossSales = grossSales;
    }

    /*making a setter for commissionsales*/
    public void setCommissionRate(double commissionRate) {
        /*we have to create an exception for this field */
        if (commissionRate < 0.0 || commissionRate > 1.0) {
            throw new IllegalArgumentException("Commission Rate must be between 0 and 1");
        }
        //now we create the setter for this field
        this.commissionRate = commissionRate;
    }

    /*Creating the getters to accept values*/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    //*creating a method to calculate the earnings
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("CommissionEmployee: %s %s%nSocial Security Number: %s%nGross Sales: %.2f%nCommission Rate: %.2f", firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }

    //now we start with the main method
    public static void main(String[] args) {
        try {
            //creating the commissionemployee object
            CommissionEmployee worker = new CommissionEmployee("Ama", "Winston", "789-654-321", 7000.89, 0.2);

            //outputting employee info
            System.out.println(worker);
            System.out.printf("Earnings: %.2f%n%n", worker.earnings());

            //next we update the values for the grossSales and commissionRate
            worker.setGrossSales(8601.09);
            worker.setCommissionRate(0.1);

            //then the updated details are displayed
            System.out.println("After updating the values, we have:");
            System.out.println(worker);
            System.out.printf("Earnings: %.2f%n%n", worker.earnings());

            //testing to see if the exception works
            System.out.println("Testing invalid values...");
            worker.setGrossSales(-601.0); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            CommissionEmployee worker2 = new CommissionEmployee("John", "Doe", "123-45-6789", 5000.0, -0.1); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}