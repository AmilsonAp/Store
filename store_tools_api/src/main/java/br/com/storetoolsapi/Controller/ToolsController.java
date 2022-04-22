package br.com.storetoolsapi.Controller;

import br.com.storetoolsapi.constant.Constant;
import br.com.storetoolsapi.model.Tools;
import br.com.storetoolsapi.service.ToolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToolsController {
    @Autowired
    private ToolsService toolsService;

    @PostMapping(Constant.URL_TOOLS)
    public void insert (@RequestBody Tools tools){
        toolsService.insert(tools);
    }

    @GetMapping(Constant.URL_TOOLS)
    public List<Tools> findAll(){
        return toolsService.findAll();
    }
}
