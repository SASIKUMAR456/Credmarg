package com.demo.Credmarg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Credmarg.model.Vendors;

public interface VendorRepository extends JpaRepository<Vendors, String>{

	List<Vendors> findByStatus(int i);

}
