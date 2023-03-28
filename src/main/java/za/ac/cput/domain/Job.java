package za.ac.cput.domain;
import java.util.Objects;

public class Job {
    private String job_id;
    private String job_title;
    private String wage;

    //private constructor
    private Job(Builder builder){
        this.job_id = builder.job_id;
        this.job_title = builder.job_title;
        this.wage = builder.wage;
    }


    public String getJob_id() {
        return job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public String getWage() {
        return wage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return job_id.equals(job.job_id) && job_title.equals(job.job_title) && wage.equals(job.wage) ;
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
        private String job_id;
        private String job_title;
        private String wage;

        public Builder setJob_id(String job_id) {
            this.job_id = job_id;
            return this;
        }

        public Builder setJob_title(String job_title) {
            this.job_title = job_title;
            return this;
        }

        public Builder setWage(String wage) {
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
