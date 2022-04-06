package ua.yaremechko.test.proxyband.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ua.yaremechko.test.proxyband.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
