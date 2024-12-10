package com.edu.ue.blacklist;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface blacklistRepository extends Repository<blacklist, Integer> {

        List<blacklist> findAll();
    
        blacklist findById(int id);
    
        blacklist save(blacklist p);
    
        void delete(blacklist p);
    }

