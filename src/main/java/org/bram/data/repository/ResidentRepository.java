package org.bram.data.repository;

import org.bram.data.models.Resident;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResidentRepository extends MongoRepository<Resident, String> {

}
