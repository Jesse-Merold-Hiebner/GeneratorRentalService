package za.ac.cput.repository;

//Author: Lutho Nondala (219369399)

import za.ac.cput.domain.CalloutService;

import java.util.Set;

public interface ICalloutServiceRepository extends IRepository<CalloutService, Long>{
    public Set<CalloutService> getAll();
}
