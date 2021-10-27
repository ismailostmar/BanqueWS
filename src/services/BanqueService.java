package services;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "ConversionEuroToDH")
    public double Converstion(@WebParam(name = "Montant") double mt){
        return mt*11;
    }

    public Compte getCompte(@WebParam(name = "code") Long code){
        return new Compte(code,Math.random()*200000 , new Date());
    }

    @WebMethod
    public List<Compte> listComptes(){
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1L,Math.random()*200000 , new Date()));
        comptes.add(new Compte(1L,Math.random()*200000 , new Date()));
        comptes.add(new Compte(1L,Math.random()*200000 , new Date()));
        return comptes;
    }
}
