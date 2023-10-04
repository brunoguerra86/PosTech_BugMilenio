package br.com.fiap.postech_bugmilenio;

import jakarta.ejb.Stateless;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Stateless
public class BeanDataHora {

    //Método para retornar a data e hora do servidor
    public String getDataEHoraDoServidor() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return simpleDateFormat.format(Calendar.getInstance().getTime());
    }

}