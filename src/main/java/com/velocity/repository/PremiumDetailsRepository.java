package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.PremiumDetails;
import com.velocity.model.User;
@Repository
public interface PremiumDetailsRepository extends JpaRepository<PremiumDetails,Integer>{

}
