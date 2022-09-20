/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemplo1;
//package abrir;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

/**
 *
 * @author Edi
 */

//Programa 1PDI
//Este programa unicamente abre una imagen que se encuentre en el disco duro raiz
//de C;, la ruta puede cambiarse, unicamente las diagonales a utilizar son (/) en lugar
//de las diagonales invertidas
public class Ejemplo1 extends Frame {

    public Image imagen;
    int Ancho;
    int Largo;
    String cAncho, cLargo;

    public Ejemplo1() {
        this.setTitle("Aplicacion 1 PDI");
        this.setSize(800, 600);
        this.setVisible(true);
        imagen = Toolkit.getDefaultToolkit().getImage("C:/prueba.jpg");
        this.addWindowListener(
                new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        }
        );
    }

    public static void main(String[] args) {
        new Ejemplo1();
    }

    public void paint(Graphics g) {
        NumberFormat convertir = NumberFormat.getCurrencyInstance();

        Largo = imagen.getHeight(this);
        Ancho = imagen.getWidth(this);
        g.drawImage(imagen, 2, 2, Ancho, Largo, this);
    }

}
