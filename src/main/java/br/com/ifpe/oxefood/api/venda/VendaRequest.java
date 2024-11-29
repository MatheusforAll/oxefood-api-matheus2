package br.com.ifpe.oxefood.api.venda;

import br.com.ifpe.oxefood.modelo.venda.Venda;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VendaRequest {

     
   private String cliente;

   
   private String produto;

  
   private String statusVenda;

   private String dataVenda;

  
   private Double valorTotal;

  
   private String observacao;

  
   private Boolean retiradaEmLoja;


     public Venda build() {

       return Venda.builder()
           .cliente(cliente)
           .produto(produto)
           .statusVenda(statusVenda)
           .dataVenda(dataVenda)
           .valorTotal(valorTotal)
           .observacao(observacao)
           .retiradaEmLoja(retiradaEmLoja)
           .build();
   }
    
}
