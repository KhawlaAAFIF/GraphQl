package ma.projet.graph.DTO;

import lombok.Data;
import ma.projet.graph.entities.TypeTransaction;

import java.util.Date;

@Data
public class TransactionRequest {

    private Long compteId;
    private double montant;
    private TypeTransaction type;
    private Date date;


}
