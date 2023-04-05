package za.ac.cput.domain;

public class Employee {
    private long employee_id;
    private String first_name;
    private String last_name;
    private String contact_no;

    public Employee(){}

    public Employee(Builder builder){
        this.employee_id = builder.employeeId;
        this.first_name = builder.firstName;
        this.last_name = builder.lastName;
        this.contact_no = builder.contactNo;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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
            this.employeeId = employee.employee_id;
            this.firstName = employee.first_name;
            this.lastName = employee.last_name;
            this.contactNo = employee.contact_no;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

}
