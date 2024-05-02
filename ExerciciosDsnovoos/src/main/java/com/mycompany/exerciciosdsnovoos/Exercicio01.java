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
public class Exercicio01 extends JFrame {
    JButton botao1, botao2, botao3, botao4;
    public Exercicio01(){
        super("Exemplo com JButton");
        Container tela = getContentPane();
        setLayout(null);
        botao1 = new JButton ("Procurar");
        botao2 = new JButton ("voltar>>");
        botao3 = new JButton ("Próximo>>");
        botao4 = new JButton ("Abrir");
        
       //adicionando as posições
        botao1.setBounds(50,20,100,20);
       //colocando a cor
      // botao1.setBackground(Color.yellow);
       //adicionando atalhos
       botao1.setMnemonic(KeyEvent.VK_P);
       
        botao2.setBounds(50,60,100,20);
       // botao2.setBackground(Color.red);
        botao2.setMnemonic(KeyEvent.VK_V);
       
        botao3.setBounds(50,100,100,20);
       //botao3.setBackground(Color.blue);
        botao3.setMnemonic(KeyEvent.VK_X);
        
        botao4.setBounds(50,140,100,20);
       //botao4.setBackground(Color.white);
         botao3.setMnemonic(KeyEvent.VK_S);

        
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        tela.add(botao4);
        
        setSize(400,250);
        setVisible(true);
    }
    
   


    
  public static void main(String[] args) {
        Exercicio01 app = new Exercicio01();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}