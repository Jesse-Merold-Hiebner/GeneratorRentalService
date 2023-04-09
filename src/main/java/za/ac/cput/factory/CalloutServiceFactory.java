package za.ac.cput.factory;

import za.ac.cput.domain.CalloutService;

//Author: Lutho Nondala (219369399)

import java.util.Date;

public class CalloutServiceFactory {
    public static CalloutService createCalloutService(long service_id, Date date_of_callout){
        if (!(service_id >= 0)){
            throw new IllegalArgumentException("Service ID is required!");
        }
        if (date_of_callout == null){
            throw new IllegalArgumentException("Date of callout is required!");
        }

        return new CalloutService.Builder().service_id(service_id).date_of_callout(date_of_callout).build();
    }
}
