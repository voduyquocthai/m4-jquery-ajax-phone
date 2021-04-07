package com.ryan.repository;

import com.ryan.model.Smartphone;
import org.springframework.data.repository.CrudRepository;

public interface SmartPhoneRepository extends CrudRepository<Smartphone, Integer> {
}
