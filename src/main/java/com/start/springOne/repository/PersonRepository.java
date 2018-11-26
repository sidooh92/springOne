package com.start.springOne.repository;


import com.start.springOne.dto.PersonDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonDto ,Long> {


}
