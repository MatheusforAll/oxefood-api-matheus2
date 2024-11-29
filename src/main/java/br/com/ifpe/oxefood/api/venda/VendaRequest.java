package br.com.ifpe.oxefood.api.venda;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

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

   @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataVenda;

    private Double valorTotal;

    private String observacao;

    private Boolean retiradaEmLoja;






}
