package com.edu.ue.blacklist.infraestructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.ue.blacklist.blacklist;
import com.edu.ue.blacklist.blacklistService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/blacklist"})
public class blacklistController {





@Autowired
blacklistService service;
    

    @GetMapping("/blacklist_all")
    public List<blacklist> listar() {
        return service.listar();
    }

    @PostMapping("/blacklist/add")
    public blacklist agregar(@RequestBody blacklist p) {
        return service.add(p);
    }

    @GetMapping("/blacklist/{id}")
    public blacklist listarId(@PathVariable("id") int id) {
        return service.listarId(id);
    }

    @PutMapping("/blacklistp/{id}")
    public blacklist editar(@RequestBody blacklist p, @PathVariable("id") int id) {
        p.setId_blacklist(id);
        return service.edit(p);
    }
    
    @DeleteMapping("/blacklist/{id}")
    public blacklist delete(@PathVariable("id") int id) {
        return service.delete(id);
    }
}


