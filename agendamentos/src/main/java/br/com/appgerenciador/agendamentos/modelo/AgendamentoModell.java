package br.com.appgerenciador.agendamentos.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "agendamentos")
@Getter
@Setter
public class AgendamentoModell {

    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long agendamentoId;
    private Long pessoaId;
    private Date dataInicio;
    private Date dataFinal;
    private CategoriaAfastamento tipoAfastamento;



    
    
}
