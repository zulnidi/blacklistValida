package com.edu.ue.blacklist;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class blacklistServices implements blacklistService {
    @Autowired
    private blacklistRepository repositorio;

    @Override
    public List<blacklist> listar() {
        return repositorio.findAll();
    }

    @Override
    public blacklist listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public blacklist add(blacklist p) {
        return repositorio.save(p);
    }

    @Override
    public blacklist edit(blacklist p) {
        return repositorio.save(p);
    }


    @Override
    public blacklist delete(int id) {
        blacklist p = repositorio.findById(id);
        if (p != null) {
            repositorio.delete(p);
        }
        return p;
    }
    
    
}
