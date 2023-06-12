package za.ac.cput.factory;
/*
 * User.java
 * Entity for the JobFactory.java
 * Author: Tumelo Mzaca (206006330)
 * Date: 28/03/2023
 */

import za.ac.cput.Util.Helper;
import za.ac.cput.domain.Job;


public class JobFactory {

    public static Job createJob(int job_id, String job_title, int wage){
        if (job_id < 0)
            return null;

        if (job_title.equals("") || job_title == null)
            return null;

        if (Helper.isNullorEmpty(job_title))
            return null;

        if (wage < 0)
            return null;

        return new Job.Builder()
                .setJob_id(job_id)
                .setJob_title(job_title)
                .setWage(wage)
                .build();
    }
}
