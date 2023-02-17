package com.example.practicaapi;

import javax.swing.*;
// Clase principal
public class Main {
    public static void main(String[] args) {
        int opc_menu = -1;
        String[]botones = {"1. ver Gatos", "2. salir"};
        do {
            //MENU PRINCIPAL
            String option = (String) JOptionPane.showInputDialog(null,"Gatitos java","MENU PRINCIPAL PRIMERA API" +
                            "",JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);
            // Validamos opcion del usuario
            for (int i = 0; i < botones.length; i++) {
                if (option.equals(botones[i])){
                    opc_menu = i;
                }
            }
            // validacion de la opcion que se realizo por consola
            switch (opc_menu){
                case 0:
                    GatosService.verGatos();
                    break;
                default:
                    System.out.println("salir");
                    break;
            }
        }while(opc_menu !=1);

    }
}
