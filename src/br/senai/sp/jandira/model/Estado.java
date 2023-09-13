package br.senai.sp.jandira.model;

public class Estado {

    public String Estado(String estado){

        String estadoTarefa = null;

        switch (estado){
            case "1":
                 estadoTarefa = "Concluída!!";
                break;
            case "2":
                estadoTarefa = "Pendente!!";
        }

        return  estadoTarefa;
    }
}
