package za.ac.cput.repository;
/*
 * User.java
 * Entity for the IJobRepository.java
 * Author: Tumelo Mzaca (206006330)
 * Date: 28/03/2023
 */

import za.ac.cput.domain.Job;


import java.util.Set;

public interface IJobRepository extends IRepository <Job, String> {
    Job read(Integer job_id);

    boolean delete(Integer job_id);

    public Set<Job> getAll();
}

