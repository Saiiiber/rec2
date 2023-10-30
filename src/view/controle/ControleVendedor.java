/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import bean.VeccVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author u10549640177
 */
public class ControleVendedor extends AbstractTableModel {
    
    private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public VeccVendedor getbean(int linha){
return (VeccVendedor) lista.get(linha);
}


    @Override
    public int getRowCount() {
    return 4;
    }

    @Override
    public int getColumnCount() {
      return 4;
    }

    @Override
        
      public Object getValueAt(int rowIndex, int columnIndex) {
        VeccVendedor vendedor = (VeccVendedor) lista.get(rowIndex);
      if (columnIndex == 0) {
             return vendedor.getVeccIdvendedor();
        }
        if (columnIndex == 1) {
             return vendedor.getVeccNome();
        }
        if (columnIndex == 2) {
             return vendedor.getVeccCpf();
        }
        if (columnIndex == 3) {
             return vendedor.getVeccEndereco();
        
        }
       return null;
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Nome";
        }
        if (columnIndex == 2) {
             return "Cpf";
        }
        if (columnIndex == 3) {
             return "Endereco";
        }
       
    return null;
    }
}
