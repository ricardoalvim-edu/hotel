/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.view.MyTableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author GILIARD
 * 
 * referências: http://www.guj.com.br/articles/147
 *              https://devsv.wordpress.com/2012/07/08/como-implementar-um-tablemodel/
 */
public final class MyTableModel extends AbstractTableModel{
    
    private List linhas = null;
    private String[] colunas = null;
    private boolean[] colEditaveis;
    
    public MyTableModel(){
    
    }
    
    public MyTableModel(List linhas){
       this.setLinhas(linhas);
       String[] cabecalhoPreDefinido = new String[] {""};
       this.setColunas(cabecalhoPreDefinido);
       this.inicializaColunasEditaveisFalse(this.getColumnCount());
    }
    
    public MyTableModel(List linhas, String[] colunas){
        this.setLinhas(linhas);
        this.setColunas(colunas);
        this.inicializaColunasEditaveisFalse(this.getColumnCount());
    }
    
    public MyTableModel(List linhas, String[] colunas, boolean[] colEditaveis){
        this.setLinhas(linhas);
        this.setColunas(colunas);
        this.setColunasEditaveis(colEditaveis);
    }
    
    private void inicializaColunasEditaveisFalse(int colunas){
        this.colEditaveis = new boolean[colunas];
        for (int i = 0; i < colunas; i++) {
            this.colEditaveis[i] = false;          
        }
    }
    
    @Override
    public int getRowCount() {
        return this.getLinhas().size();
    }

    @Override
    public int getColumnCount() {
        return getColunas().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Obtém os valores de uma linha
        String[] linha = (String[]) this.getLinhas().get(rowIndex);
        //Retorna o valor da coluna para aquela linha especificada
        return linha[columnIndex];
    }
    
    public void setValueAt(Object value, int rowIndex, int columnIndex){
        
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return this.colEditaveis[columnIndex];
    }   

    public List getLinhas() {
        return linhas;
    }

    public String[] getColunas() {
        return colunas;
    }
    
    public boolean[] getColunasEditaveis(){
        return colEditaveis;
    }

    public final void setLinhas(List linhas) {
        this.linhas = linhas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    public void setColunasEditaveis(boolean[] colEditaveis){
        this.colEditaveis = colEditaveis;
    }
    
    
    
}
