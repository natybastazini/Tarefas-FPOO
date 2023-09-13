package br.senai.sp.jandira.model;


import java.util.Scanner;

public class CadastrarTarefa {

    Tarefa tarefa = new Tarefa();

    Scanner teclado = new Scanner(System.in);

    public Tarefa CadastrarTarefas(){
        System.out.println("----------------------------------------");
        System.out.println("---------- Cadastro da Tarefa ----------");
        System.out.println("----------------------------------------");

        System.out.println("Qual será o título?? ");
        tarefa.titulo = teclado.nextLine();
        System.out.println("Adicione uma descrição: ");
        tarefa.descricao = teclado.nextLine();
        System.out.println("Adicione uma data de vencimento: ");
        tarefa.dataVencimento = teclado.nextLine();
        System.out.println("Qual : [1-Concluída || 2- Pendente]");
        tarefa.estado = teclado.nextLine();

        return tarefa;
    }







}
