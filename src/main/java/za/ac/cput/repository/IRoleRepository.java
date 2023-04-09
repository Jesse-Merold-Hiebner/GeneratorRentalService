package za.ac.cput.repository;

/*
 * IRoleRepository.java
 * Entity for the IRoleRepository.java
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 09/04/2023
 */
import za.ac.cput.domain.Role;

import java.util.Set;

public interface IRoleRepository extends IRepository<Role, Long>{
    public Set<Role> getAll();
}
