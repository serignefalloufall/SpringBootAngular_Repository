package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.model.Client;

import java.util.List;

public interface IClientService {
    public Client save(Client client);
    public List<Client> findAll();
}
