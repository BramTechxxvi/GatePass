package org.bram.data.repository;

import org.bram.data.models.Resident;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepository extends MongoRepository<Resident, String> {

}
