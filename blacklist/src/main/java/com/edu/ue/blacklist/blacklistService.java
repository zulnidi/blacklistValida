package com.edu.ue.blacklist;

import java.util.List;

public interface blacklistService {


    List<blacklist> listar();

    blacklist listarId(int id);

    blacklist add(blacklist p);

    blacklist edit(blacklist p);

    blacklist delete(int id);


}
