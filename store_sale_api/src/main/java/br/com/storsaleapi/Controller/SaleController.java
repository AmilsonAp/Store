package br.com.storsaleapi.Controller;

import br.com.storsaleapi.constant.Constant;
import br.com.storsaleapi.model.Sale;
import br.com.storsaleapi.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping(Constant.URL_SALE)
    public void insert(@RequestBody Sale sale) {
        saleService.insert(sale);
    }

    @GetMapping(Constant.URL_SALE)
    public List<Sale> findAll() {
        return saleService.findAll();
    }

}