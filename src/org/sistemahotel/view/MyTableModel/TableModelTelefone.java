/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.view.MyTableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.sistemahotel.Model.Telefone;

/**
 *
 * @author GILIARD
 */
public class TableModelTelefone extends  AbstractTableModel{
    List<Telefone> linhas = null;
    String[] cabecalho = new String[]{"DDI", "DDD", "TELEFONE"};
    
    public TableModelTelefone(){
       
    }
    public TableModelTelefone(List<Telefone> lista){
        this.linhas = lista;
    }

    @Override
    public int getRowCount() {
        int tam;
        if(linhas == null){
            tam = 0;
        }else{
            tam = linhas.size();
        }
        return tam;
    }

    @Override
    public int getColumnCount() {
        return cabecalho.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Telefone tel = linhas.get(rowIndex);
        String value = "";
        switch(columnIndex){
            case 0:
                value = tel.getDdi();
                break;
            case 1:
                value = tel.getDdd();
                break;
            case 2:
                value = tel.getTelefone();
                break;
            default:
                value = "Não encontrado";
                break;
        }
        return value;
    }
    
    @Override
    public String getColumnName(int column){
        return cabecalho[column];
    }
    
    public List<Telefone> getRows(){
        return this.linhas;
    }
    
    public void setRows(List<Telefone> novaslinhas){
        this.linhas = novaslinhas;
        // notifica a JTable que todos os dados da tabela podem ter sido alterados
        fireTableDataChanged();
    }
    
    public void addTelefone(Telefone telefone){
        
        int ultimoIndice = this.linhas.indexOf(telefone);
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    public void updateTelefone(Telefone telefone){
        int linha = this.linhas.indexOf(telefone);
        fireTableRowsUpdated(linha, linha);
    }
    
    public void removeTelefone(Telefone telefone){
        int linha = this.linhas.indexOf(telefone);
        linhas.remove(telefone);
        
        fireTableRowsDeleted(linha, linha);
    }
}
