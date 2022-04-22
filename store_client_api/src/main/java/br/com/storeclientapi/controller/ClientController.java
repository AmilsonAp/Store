package br.com.storeclientapi.controller;

import br.com.storeclientapi.constant.Constant;
import br.com.storeclientapi.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.storeclientapi.service.ClientService;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(Constant.URL_CLIENT)
    public void insert (@RequestBody Client client){
        clientService.insert(client);
    }

    @GetMapping(Constant.URL_CLIENT)
    public List<Client> findAll(){
        return clientService.findAll();
    }
}
