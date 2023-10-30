/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.ArrayList;
import java.util.List;
import bean.VeccUsuario;
import bean.VeccUsuario;
import java.util.Collections;


/**
 *
 * @author u13766540670
 */
public class LintUse {

    public static void main(String[] args) {
        VeccUsuario teste = new VeccUsuario();
        teste.setVeccIdusuario(1);
        teste.setVeccNome("nome");
        teste.setVeccApelido("apelido");
        teste.setVeccCpf("123");
        teste.setVeccTelefone("12345");
        teste.setVeccEndereco("abc");

        VeccUsuario teste1 = new VeccUsuario();
        teste1.setVeccIdusuario(2);
        teste1.setVeccNome("nome2");
        teste1.setVeccApelido("apelido2");
        teste1.setVeccCpf("456");
        teste1.setVeccTelefone("678910");
        teste1.setVeccEndereco("def");

        List lista = new ArrayList();
        lista.add(teste);
        lista.add(teste1);
        Collections.sort(lista);

        for (Object usuarios : lista) {
            System.out.println(((VeccUsuario) usuarios).getVeccNome());
        }

    }

}
