package za.ac.cput.domain;

//Author: Lutho Nondala (219369399)

import java.util.Set;

public class Employee {
    private long employee_id;
    private String first_name;
    private String last_name;
    private String contact_no;
    private Address address;
    private Job job;

    public Employee(){}

    public Employee(Builder builder){
        this.employee_id = builder.employeeId;
        this.first_name = builder.firstName;
        this.last_name = builder.lastName;
        this.contact_no = builder.contactNo;
        this.job = builder.job;
        this.address = builder.address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public static class Builder{
        private long employeeId;
        private String firstName, lastName, contactNo;
        private Job job;
        private Address address;

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

        public Builder job(Job job){
            this.job = job;
            return this;
        }

        public Builder address(Address address){
            this.address = address;
            return this;
        }

        public Builder copy(Employee employee){
            this.employeeId = employee.employee_id;
            this.firstName = employee.first_name;
            this.lastName = employee.last_name;
            this.contactNo = employee.contact_no;
            this.job = employee.job;
            this.address = employee.address;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

}
