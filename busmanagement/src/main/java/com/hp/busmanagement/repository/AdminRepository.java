package com.hp.busmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hp.busmanagement.entity.AdminEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long>{

}
