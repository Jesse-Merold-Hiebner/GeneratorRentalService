package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Job;

import static org.junit.jupiter.api.Assertions.*;

class jobFactoryTest {

    @Test
    public void testWithSuccess() {
        Job job = jobFactory.createJob(01, "Manage", 10500);
        System.out.println(job.toString());
        assertNotNull(job);
    }

    @Test
    public void testWithFailure(){
        Job job = jobFactory.createJob(01, "", 10500);
        System.out.println(job.toString());
        assertNotNull(job);
    }

}