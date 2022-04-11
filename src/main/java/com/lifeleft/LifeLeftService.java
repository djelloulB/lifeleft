package com.lifeleft;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.Year;

@WebService(serviceName = "lifeLeft")
public class LifeLeftService {
    private static final Integer ESPERANCE_VIE_HOMME = 79;
    private static final Integer ESPERANCE_VIE_FEMME = 85;

    String homme = "homme";
    String femme = "femme";
    int evDeRefecence = 0;

    @WebMethod
    public String anneeRestanteAvivre(String prenom , String sexe, Integer anneedeNaissance){
        if(sexe.equals(homme)) evDeRefecence = ESPERANCE_VIE_HOMME;
        else evDeRefecence = ESPERANCE_VIE_FEMME;

        int anneeRestantes = evDeRefecence - (Year.now().getValue() - anneedeNaissance);

        return "Bonjour " + prenom +", il vous reste à vivre " + anneeRestantes + " années";
    }
}
