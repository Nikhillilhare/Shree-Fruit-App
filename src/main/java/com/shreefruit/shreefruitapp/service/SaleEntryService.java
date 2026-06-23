package com.shreefruit.shreefruitapp.service;

import com.shreefruit.shreefruitapp.model.SaleEntry;
import com.shreefruit.shreefruitapp.repository.SaleEntryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SaleEntryService {
    private final SaleEntryRepository repository;
    public SaleEntry saveSale(SaleEntry entry){
        return repository.save(entry);
    }
    public List<SaleEntry> getAllSales(){
        return repository.findAll();
    }
}
