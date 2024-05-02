/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosdsnovoos;

/**
 *
 * @author aange
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio05 extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir;

    public Exercicio05() {
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);

        rotulo1 = new JLabel("1°Numero:");
        rotulo2 = new JLabel("2°Numero:");

      

        exibir = new JLabel("");
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton("Dividir");
        
          texto1 = new JTextField(5);
        texto2 = new JTextField(5);

        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);
        somar.setBounds(50, 100, 80, 20);
        subtrair.setBounds(50, 140, 80, 20);
        multiplicar.setBounds(50, 180, 80, 20);
        dividir.setBounds(50, 220, 80, 20);
        texto1.setBounds(120, 20, 80, 20);
        texto2.setBounds(120, 60, 80, 20);

        exibir.setBounds(50, 260, 300, 20);


        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());

                int soma = numero1 + numero2;
                exibir.setText("A soma é: " + soma);
            }
        });

        subtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());

                int subtracao = numero1 - numero2; 
                exibir.setText("A subtração é: " + subtracao);
            }
        });

        // metodo para o botão de multiplicação
        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());

                int multiplicacao = numero1 * numero2;
                exibir.setText("A multiplicação é: " + multiplicacao);
            }
        });

        // metodo para o botão de divisão
        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());

                if (numero2 != 0) {
                    double divisao = (double) numero1 / numero2;
                    exibir.setText("A divisão é: " + divisao);
                } else {
                    exibir.setText("Erro: Divisão por zero");
                }
            }
        });

        exibir.setVisible(true);

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(texto1);
        tela.add(texto2);
        

        setSize(400, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        Exercicio05 app = new Exercicio05();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


     
