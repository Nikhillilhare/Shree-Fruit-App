package com.shreefruit.shreefruitapp.repository;

import com.shreefruit.shreefruitapp.model.SaleEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleEntryRepository extends JpaRepository<SaleEntry,Long> {
}
