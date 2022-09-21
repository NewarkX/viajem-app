package com.bruno.reserva;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.bruno.cliente.Cliente;

@Path("/reserva-cli")
public class ReservaResource {
    
    @Inject
    @RestClient
    ReservaService reservaService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("newReserva")
    public String newReserva(){
        Cliente cliente = Cliente.of(2, "");
        return reservaService.newReserva(cliente);
    }
}
