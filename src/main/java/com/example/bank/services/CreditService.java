package com.example.bank.services;


import com.example.bank.models.Credit;
import com.example.bank.repositories.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditService {


    @Autowired
    CreditRepository creditRepository;


    public Credit addCredit(Credit credit){
        return creditRepository.save(credit);
    }


}
