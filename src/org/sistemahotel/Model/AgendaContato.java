/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model;

import java.util.List;

/**
 *
 * @author GILIARD
 */
public interface AgendaContato {
    
    public List<Telefone> getListaTelefone();
    public void setListaTelefone(List<Telefone> lista);
    public String getNomeProprietarioAgenda();
    
}
