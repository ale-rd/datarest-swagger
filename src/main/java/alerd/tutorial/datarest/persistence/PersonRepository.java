package alerd.tutorial.datarest.persistence;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import alerd.tutorial.datarest.entities.Person; 

@RepositoryRestResource(collectionResourceRel = "people", path="people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>{
    
    List<Person> findByLastName(@Param("name") String name);

}
