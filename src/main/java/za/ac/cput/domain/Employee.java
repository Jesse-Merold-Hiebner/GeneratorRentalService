package za.ac.cput.domain;

public class Employee {
    private long employeeID;
    private String firstName;
    private String lastName;
    private String contact_no;

    public Employee(){}

    public Employee(Builder builder){
        this.employeeID = builder.employeeId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.contact_no = builder.contactNo;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

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

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public static class Builder{
        private long employeeId;
        private String firstName, lastName, contactNo;

        public Builder employeeId(long employeeId){
            this.employeeId = employeeId;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder contactNo(String contactNo){
            this.contactNo = contactNo;
            return this;
        }

        public Builder copy(Employee employee){
            this.employeeId = employee.employeeID;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            this.contactNo = employee.contact_no;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

}
