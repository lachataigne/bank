package com.example.bank.controllers;

import com.example.bank.models.Credit;
import com.example.bank.services.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/credits")
public class CreditController {

    @Autowired
    CreditService creditService;


    @PostMapping(
            path = "/add",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Credit addCredit(Credit credit){
        return creditService.addCredit(credit);
    }
}
