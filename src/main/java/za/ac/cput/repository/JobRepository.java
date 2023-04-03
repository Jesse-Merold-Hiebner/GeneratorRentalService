package za.ac.cput.repository;
/*
 * User.java
 * Entity for the JobRepository.java
 * Author: Tumelo Mzaca (206006330)
 * Date: 28/03/2023
 */

import za.ac.cput.domain.Job;
import java.util.HashSet;
import java.util.Set;

public class JobRepository implements IJobRepository{
    private static JobRepository repository = null;
    private Set<Job> jobDB = null;

    private JobRepository(){
        jobDB = new HashSet<Job>();
    }

    public static JobRepository getRepository(){
        if (repository == null)
            repository = new JobRepository();

        return repository;
    }

    @Override
    public Job create(Job job)
    {
        boolean success = jobDB.add(job);
        if (!success)
            return null;
        return job;
    }

    @Override
    public Job read(String s) {
        return null;
    }


    @Override
    public Job read(Integer job_id)
    {   //linear or sequential search (compact)
        for (Job r : jobDB)
        {
            if (r.getJob_id().equals(job_id)) ;
            return r;
        }
        return null;

    }

    @Override
    public Job update(Job job)
    {
        Job oldJob = read(job.getJob_id());
        if (oldJob != null){
            jobDB.remove(oldJob); //removing old employee information
            jobDB.add(job);       //replacing with new employee information
            return job;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }


    @Override
    public boolean delete(Integer job_id) {

        Job oldJobToDelete = read(job_id);
        if (oldJobToDelete == null)
            return false;
        jobDB.remove(oldJobToDelete);
        return true;
    }

    @Override
    public Set<Job> getAll(){
        return jobDB;
    }
}
