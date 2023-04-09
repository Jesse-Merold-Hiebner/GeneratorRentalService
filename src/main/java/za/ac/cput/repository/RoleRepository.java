package za.ac.cput.repository;

//Author: Jesse Hiebner (220357676)

import za.ac.cput.domain.Role;

import java.util.HashSet;
import java.util.Set;

public class RoleRepository implements IRoleRepository{
    private static RoleRepository REPOSITORY;
    private Set<Role> db;

    public RoleRepository(){
        this.db = new HashSet<>();
    }

    public static RoleRepository getRepository(){
        if (REPOSITORY == null){
            REPOSITORY = new RoleRepository();
        }
        return REPOSITORY;
    }
    @Override
    public Set<Role> getAll() {
        return db;
    }

    @Override
    public Role create(Role Role) {
        this.db.add(Role);
        return Role;
    }

    @Override
    public Role read(Long RoleID) {
        for (Role r : db){
            if (r.getRoleID().equals(RoleID)){
                return r;
            }
        }
        return null;
    }

    @Override
    public Role update(Role role) {
        Role r = read(role.getRoleID());
        if (r != null){
            db.remove(r);
            db.add(role);
            return role;
        }
        return null;
    }

    @Override
    public boolean delete(Long RoleID) {
        Role r = read(RoleID);
        if (r != null){
            db.remove(r);
            return true;
        }
        return false;
    }
}
