package com.fpt.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.fpt.models.entities.Barang;

public interface BarangRepo extends CrudRepository<Barang, Long> {
    
}
