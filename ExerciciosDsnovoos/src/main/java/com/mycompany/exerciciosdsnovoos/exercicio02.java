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

public class exercicio02 extends JFrame{
    JPasswordField caixa;
    JLabel rotulo;
    
    public exercicio02 (){
        super("Exemplo com JPasswordField");
        Container tela = getContentPane();
        setLayout(null);
      
        rotulo = new JLabel("senha");
        caixa = new JPasswordField(10);
        
        rotulo.setBounds(50,60,100,20);
        caixa.setBounds(50,60,100,20);
        
        tela.add(rotulo);
        tela.add(caixa);
        
        setSize(400,250);
        setVisible(true);
        
        
    }
    public static void main(String[] args) {
        exercicio02 app = new exercicio02();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
