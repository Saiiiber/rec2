/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.controle;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author u10549640177
 */
public class ClienteControle1 extends AbstractTableModel {





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
       
      if (columnIndex == 0) {
             return null;
        }
        if (columnIndex == 1) {
             return null;
        }
        if (columnIndex == 2) {
             return null;
        }
        if (columnIndex == 3) {
             return null;
        
        }
       return null;
    }
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "nome";
        }
        if (columnIndex == 2) {
             return "apelido";
        }
        if (columnIndex == 3) {
             return "cpf";
        }
       
    return null;
    }
}
