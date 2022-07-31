package com.hackathon.porto.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Response {

    Date dataPrevista;

    Date dataAtual;

    Integer quantidadeDiasPercorrido;

    boolean atrasado;

    boolean noPrazo;

    float porcentagemQuilometragem;
    float porcentagemDiasPercorridos;

    public float getPorcentagemQuilometragem() {
        return porcentagemQuilometragem;
    }

    public void setPorcentagemQuilometragem(float porcentagemQuilometragem) {
        this.porcentagemQuilometragem = porcentagemQuilometragem;
    }

    public float getPorcentagemDiasPercorridos() {
        return porcentagemDiasPercorridos;
    }

    public void setPorcentagemDiasPercorridos(float porcentagemDiasPercorridos) {
        this.porcentagemDiasPercorridos = porcentagemDiasPercorridos;
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }

    public Integer getQuantidadeDiasPercorrido() {
        return quantidadeDiasPercorrido;
    }

    public void setQuantidadeDiasPercorrido(Integer quantidadeDiasPercorrido) {
        this.quantidadeDiasPercorrido = quantidadeDiasPercorrido;
    }

    public boolean isAtrasado() {
        return atrasado;
    }

    public void setAtrasado(boolean atrasado) {
        this.atrasado = atrasado;
    }

    public boolean isNoPrazo() {
        return noPrazo;
    }

    public void setNoPrazo(boolean noPrazo) {
        this.noPrazo = noPrazo;
    }
}
