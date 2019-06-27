package com.mumu.customercenter.controller;

import com.mumu.customercenter.service.CreditQuotaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 * Created by Mumu on 2019/6/28
 */
@RestController
@RequiredArgsConstructor
public class CreditQuotaController {
    private final CreditQuotaService creditQuotaService;

    @GetMapping("/query/{id}")
    public String query(@PathVariable("id") Long id){
        creditQuotaService.query(id);
        return "success";
    }
}
