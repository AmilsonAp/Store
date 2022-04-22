package br.com.storetoolsapi.service;

import br.com.storetoolsapi.model.Tools;
import br.com.storetoolsapi.repositpory.ToolsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolsService {

    @Autowired
    private ToolsRepository toolsRepository;

    public void insert (Tools tools){
        toolsRepository.save(tools);
    }

    public List<Tools> findAll(){
        return toolsRepository.findAll();
    }
}
