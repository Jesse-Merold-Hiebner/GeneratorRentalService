package za.ac.cput.domain;

/*
 * Employee.java
 * Entity for the Employee.java
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 28/03/2023
 */

public class Employee
{
    private int employeeID;
    private String firstName;
    private String lastName;
    private String employeeAddress;
    private String contactNumber;
    private int jobID;

    //insert private constructor here
    private Employee(Builder builder)
    {
        this.employeeID = builder.employeeID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.employeeAddress = builder.employeeAddress;
        this.contactNumber = builder.contactNumber;
        this.jobID = builder.jobID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public int getJobID() {
        return jobID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", jobID=" + jobID +
                '}';
    }

    public static class Builder
    {
        private int employeeID;
        private String firstName;
        private String lastName;
        private String employeeAddress;
        private String contactNumber;
        private int jobID;

        public Builder setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmployeeAddress(String employeeAddress) {
            this.employeeAddress = employeeAddress;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder setJobID(int jobID) {
            this.jobID = jobID;
            return this;
        }

        public Builder copy(Employee employee)
        {
            this.employeeID = employee.employeeID;
            this.firstName = employee.lastName;
            this.employeeAddress = employee.employeeAddress;
            this.contactNumber = employee.contactNumber;
            this.jobID = employee.jobID;

            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }

    }

}
