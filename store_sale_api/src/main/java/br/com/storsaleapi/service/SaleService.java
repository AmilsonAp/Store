package br.com.storsaleapi.service;

import br.com.storsaleapi.model.Sale;
import br.com.storsaleapi.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public void insert (Sale sale){
        saleRepository.save(sale);
    }

    public List<Sale> findAll(){
        return saleRepository.findAll();
    }
}
