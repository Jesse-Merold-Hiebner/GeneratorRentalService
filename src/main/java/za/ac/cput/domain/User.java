package za.ac.cput.domain;

public class User
{
    private int userID; //Primary Key
    private String userName;
    private String userEmail;
    private int employeeID; //Foreign Key

    //insert private constructor


    private User(Builder builder)
    {
        this.userID = builder.userID;
        this.userName = builder.userName;
        this.userEmail = builder.userEmail;
        this.employeeID = builder.employeeID;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }

    public static class Builder
    {
        private int userID; //Primary Key
        private String userName;
        private String userEmail;
        private int employeeID; //Foreign Key

        public Builder setUserID(int userID) {
            this.userID = userID;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public Builder setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
            return this;
        }

        public Builder copy(User user)
        {
            this.userID = user.userID;
            this.userName = user.userName;
            this.userEmail = user.userEmail;
            this.employeeID = user.employeeID;

            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }
}
