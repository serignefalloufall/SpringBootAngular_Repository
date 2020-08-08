package com.devoir.gestioncommande.service;

import com.devoir.gestioncommande.dao.CategorieRepository;
import com.devoir.gestioncommande.dao.ClientRepository;
import com.devoir.gestioncommande.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }
}
