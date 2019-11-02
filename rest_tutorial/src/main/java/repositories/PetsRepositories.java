package repositories;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import models.Pets;
/*Adding Repository to Spring Boot Project*/

public interface PetsRepositories extends MongoRepository <Pets,String>{
	Pets findBy_id(ObjectId _id);

}
