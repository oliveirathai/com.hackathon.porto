package com.hackathon.porto.service;

import com.hackathon.porto.controller.Response;
import com.hackathon.porto.model.DadosViagem;
import com.hackathon.porto.repository.DadoViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

@Service
public class PortoService {

    private DadoViagemRepository repository;

    @Autowired
    public PortoService(DadoViagemRepository repository) {
        this.repository = repository;
    }

    public Response buscaViagemPorId(Long id)  {
        Response response = new Response();
        Optional<DadosViagem> dadosViagem = this.repository.findById(id);
        if(dadosViagem.isPresent()){
            DadosViagem dados = dadosViagem.get();
            float percentage;
            percentage = (dados.getQuilometrosAtual() * 100/ dados.getQuilometrosParaPercorrer());
            response.setPorcentagemQuilometragem(percentage);

            long diferencaDiasPrevisto = calcular(dados.getDataDaSaida().toString(), dados.getDataAtracacaoPrevista().toString());

            long diferencaDiasPercorridosAteoMomento = calcular(dados.getDataDaSaida().toString(), dados.getDataAtual().toString());

            float percentage2;
            percentage2 = (diferencaDiasPercorridosAteoMomento * 100/ diferencaDiasPrevisto);

            response.setPorcentagemDiasPercorridos(percentage2);

            response.setDataPrevista(dados.getDataAtracacaoPrevista());

            response.setDataAtual(dados.getDataAtual());

            response.setQuantidadeDiasPercorrido(Integer.parseInt(String.valueOf(diferencaDiasPercorridosAteoMomento)));

            response.setAtrasado(diferencaDiasPercorridosAteoMomento > diferencaDiasPrevisto  ? true : false);

            response.setNoPrazo(diferencaDiasPrevisto > diferencaDiasPercorridosAteoMomento  ? true : false);

            return response;
        }else{
            return response;
        }
    }


    /** Calcula o número de dias entre duas datas. */
    public static long calcular (String inicio, String fim)  {
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dtInicial = null;
        try {
            dtInicial = df.parse (inicio);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Date dtFinal = null;
        try {
            dtFinal = df.parse (fim);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return
                (dtFinal.getTime() - dtInicial.getTime() + 3600000L) / 86400000L;
    }


}
