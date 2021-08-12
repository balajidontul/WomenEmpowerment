package com.team6.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.team6.model.PersonalDetail;

@Repository
public interface PersonalDetailRepository extends JpaRepository<PersonalDetail, Integer>{

}
