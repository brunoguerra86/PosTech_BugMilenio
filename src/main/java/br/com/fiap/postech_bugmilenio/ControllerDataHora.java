package br.com.fiap.postech_bugmilenio;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


@Named(value = "controleDataHora")
@RequestScoped
public class ControllerDataHora {

    @EJB
    private BeanDataHora beanDataHora;

    public ControllerDataHora(){}

    public BeanDataHora getBeanDataHora() {
        return this.beanDataHora;
    }

    public void setBeanDataHora(BeanDataHora beanDataHora) {
        this.beanDataHora = beanDataHora;
    }
}