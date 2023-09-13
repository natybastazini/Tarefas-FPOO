package br.senai.sp.jandira;

import br.senai.sp.jandira.model.CadastrarTarefa;
import br.senai.sp.jandira.model.ListarTarefas;
import br.senai.sp.jandira.model.Tarefa;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);


    public void Menu() {

        CadastrarTarefa cadastrarTarefa = new CadastrarTarefa();
        ListarTarefas listarTarefas = new ListarTarefas();

        System.out.println("****************************************");
        System.out.println("**********  MENU DE TAREFAS  **********");
        System.out.println("****************************************");

        System.out.println("Qual função deseja realizar: [1-Cadastrar || 2-Listar ]");

        int opcaoUsuario = teclado.nextInt();

        switch (opcaoUsuario){
            case 1:
                cadastrarTarefa.CadastrarTarefas();

                break;
            case 2:
//                listarTarefas.;
                break;
        }



    }
}
