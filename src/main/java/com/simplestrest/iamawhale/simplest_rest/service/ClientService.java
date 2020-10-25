package com.simplestrest.iamawhale.simplest_rest.service;

import com.simplestrest.iamawhale.simplest_rest.model.Client;

import java.util.List;

public interface ClientService {
    void create (Client client);
    List<Client> readAll();
    Client read (int id);
    boolean update (Client client, int id);
    boolean delete (int id);

}
