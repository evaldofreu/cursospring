package io.github.evaldofreu.service;

import org.springframework.stereotype.Service;

import io.github.evaldofreu.repository.ClienteRepository;

@Service("ClienteService")
public class ClienteService {
    /*via atributo
    @Autowired
    ClienteRepository repository;
    */
    
    /*
    via setter
        
    private ClienteRepository repository;
    @Autowired
    public void setRepository(ClienteRepository repository) {
        this.repository = repository;
    }
    */

    /* Via construtor - via construtor não necessita autowired */
    public ClienteService(ClienteRepository clienteRepository){
        this.repository = clienteRepository;
    }
    
    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        clienteRepository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){


    }
}
