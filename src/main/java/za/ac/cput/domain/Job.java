package za.ac.cput.domain;
/*
 * User.java
 * Entity for the Job.java
 * Author: Tumelo Mzaca (206006330)
 * Date: 27/03/2023
 */
import java.util.Objects;

public class Job {
    private int job_id;
    private String job_title;
    private int wage;

    //private constructor
    private Job(Builder builder){
        this.job_id = builder.job_id;
        this.job_title = builder.job_title;
        this.wage = builder.wage;
    }


    public Integer getJob_id() {
        return job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public Integer getWage() {
        return wage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return job_id == job.job_id && wage == job.wage && job_title.equals(job.job_title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job_id, job_title, wage);
    }

    @Override
    public String toString() {
        return "Job{" +
                "job_id='" + job_id + '\'' +
                ", job_title='" + job_title + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }


    //start the builder class

    public static class Builder{
        private Integer job_id;
        private String job_title;
        private Integer wage;

        public Builder setJob_id(Integer job_id) {
            this.job_id = job_id;
            return this;
        }

        public Builder setJob_title(String job_title) {
            this.job_title = job_title;
            return this;
        }

        public Builder setWage(Integer wage) {
            this.wage = wage;
            return this;
        }


        public Builder copy(Job job){
            this.job_id = job.job_id;
            this.job_title = job.job_title;
            this.wage = job.wage;
            return this;
        }

        public Job build(){
            return new Job(this);
        }
    }
}
