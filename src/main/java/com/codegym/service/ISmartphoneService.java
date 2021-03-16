package com.codegym.service;

import com.codegym.model.Smartphone;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();
    Smartphone findById(Integer id);
    Smartphone save(Smartphone phone);
    Smartphone remove(Integer id);
}