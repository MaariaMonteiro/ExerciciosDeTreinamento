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

public class Exercicio04 extends JFrame{
    JPasswordField caixa;
    JLabel rotulo, exibir;
    JButton mostrar;
    public Exercicio04(){
        super("Exemplo com Jpassworfield");
        Container tela= getContentPane();
        setLayout(null);
        
       rotulo = new JLabel("Senha");
       caixa = new JPasswordField(10);
       exibir = new JLabel("A senha digitada é ");
       mostrar = new JButton("mostrar");
       
       exibir.setVisible(false);
       
       rotulo.setBounds(50,20,100,20);
       caixa.setBounds(50,60,200,20);
       exibir.setBounds(50,120,200,20);
       mostrar.setBounds(150, 100, 80, 20);
       
      mostrar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String senha = new String(caixa.getPassword());
        exibir.setVisible(true);
        exibir.setText("A senha digitada é: " + senha);
    }
});
       
       tela.add(rotulo);
       tela.add(caixa);
       tela.add(exibir);
       tela.add(mostrar);
       setSize(400,250);
       setVisible(true);
       
    }
    public static void main(String[] args) {
            Exercicio04 app = new Exercicio04();
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
