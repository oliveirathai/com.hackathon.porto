package com.hackathon.porto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "DADOSVIAGEM")
public class DadosViagem {

    @Id
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "DATADASAIDA")
    private Date dataDaSaida;

    @Column(name = "QUILOMETROSPARAPERCORRER")
    private Long quilometrosParaPercorrer;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "DATAATRACACAOPREVISTA")
    private Date dataAtracacaoPrevista;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "DATAATUAL")
    private Date dataAtual;

    @Column(name = "QUILOMETROSATUAL")
    private Long quilometrosAtual;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataDaSaida() {
        return dataDaSaida;
    }

    public void setDataDaSaida(Date dataDaSaida) {
        this.dataDaSaida = dataDaSaida;
    }

    public Long getQuilometrosParaPercorrer() {
        return quilometrosParaPercorrer;
    }

    public void setQuilometrosParaPercorrer(Long quilometrosParaPercorrer) {
        this.quilometrosParaPercorrer = quilometrosParaPercorrer;
    }

    public Date getDataAtracacaoPrevista() {
        return dataAtracacaoPrevista;
    }

    public void setDataAtracacaoPrevista(Date dataAtracacaoPrevista) {
        this.dataAtracacaoPrevista = dataAtracacaoPrevista;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }

    public Long getQuilometrosAtual() {
        return quilometrosAtual;
    }

    public void setQuilometrosAtual(Long quilometrosAtual) {
        this.quilometrosAtual = quilometrosAtual;
    }
}
