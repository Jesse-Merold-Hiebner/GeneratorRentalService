package za.ac.cput.repository;

/*
 * IRepository.java
 * Entity for the IRepository
 * Author: Jesse Merold Hiebner (220357676)
 * Date: 27/03/2023
 */

public interface IRepository< T , ID>
{
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);

}

