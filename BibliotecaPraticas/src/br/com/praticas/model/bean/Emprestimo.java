/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.praticas.model.bean;

import java.util.Date;

/**
 *
 * @author VAAR
 */
public class Emprestimo {
    
    private int id;
    private boolean reserva;
    private Date data;
    private int dataPrevista;
    private Date Entrega;

    public Emprestimo() {
    }

    public Emprestimo(int id, boolean reserva, Date data, int dataPrevista, Date Entrega) {
        this.id = id;
        this.reserva = reserva;
        this.data = data;
        this.dataPrevista = dataPrevista;
        this.Entrega = Entrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(int dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public Date getEntrega() {
        return Entrega;
    }

    public void setEntrega(Date Entrega) {
        this.Entrega = Entrega;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "id=" + id + ", reserva=" + reserva + ", data=" + data + ", dataPrevista=" + dataPrevista + ", Entrega=" + Entrega + '}';
    }
    
}