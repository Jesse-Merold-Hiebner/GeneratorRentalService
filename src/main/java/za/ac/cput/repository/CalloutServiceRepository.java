package za.ac.cput.repository;

//Author: Lutho Nondala (219369399)

import za.ac.cput.domain.CalloutService;

import java.util.HashSet;
import java.util.Set;

public class CalloutServiceRepository implements ICalloutServiceRepository{
    private static CalloutServiceRepository REPOSITORY;
    private Set<CalloutService> db;

    public CalloutServiceRepository(){
        this.db = new HashSet<>();
    }

    public static CalloutServiceRepository getRepository(){
        if (REPOSITORY == null){
            REPOSITORY = new CalloutServiceRepository();
        }
        return REPOSITORY;
    }
    @Override
    public Set<CalloutService> getAll() {
        return db;
    }

    @Override
    public CalloutService create(CalloutService calloutService) {
        this.db.add(calloutService);
        return calloutService;
    }

    @Override
    public CalloutService read(Long service_id) {
        for (CalloutService cs : db){
            if (cs.getService_id() == service_id){
                return cs;
            }
        }
        return null;
    }

    @Override
    public CalloutService update(CalloutService service) {
        CalloutService s = read(service.getService_id());
        if (s != null){
            db.remove(s);
            db.add(service);
            System.out.println("Callout service updated");
            return service;
        }
        return null;
    }

    @Override
    public boolean delete(Long service_id) {
        CalloutService s = read(service_id);
        if (s != null){
            db.remove(s);
            System.out.println("Callout service Deleted");
            return true;
        }
        return false;
    }
}
