/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_r;
import java.io.*;
import java.util.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author shreehari
 */
public class fifo_final extends javax.swing.JFrame {

    /**
     * Creates new form fifo_final
     */
    private JTextField text;
    private JTextField text2;
    private JTextField text3;
    private JTextField text4;
    private JTextField text5;
    private JTextArea text6;
    private JScrollPane scroll;

    public fifo_final() {
        //initComponents();
        initialize();
    }
    
    private void initialize() {
		setBounds(0, 0, 1251, 695);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("        FIFO");
		lblNewLabel.setFont(new Font("Purisa",Font.BOLD + Font.ITALIC, 44));
		lblNewLabel.setBounds(380, 21, 578, 50);
		getContentPane().add(lblNewLabel);
		
		text = new JTextField();
		text.setBounds(118, 145, 401, 28);
		getContentPane().add(text);
	
		
		JLabel input = new JLabel("   INPUT ");
		input.setFont(new Font("Tahoma", Font.BOLD, 13));
		input.setBounds(30, 150, 61, 23);
		getContentPane().add(input);
		
		//hits
		text2 = new JTextField();
		text2.setBounds(118, 184, 401, 28);
		getContentPane().add(text2);
		text2.setColumns(10);
		
		JLabel output = new JLabel("HITS");
		output.setFont(new Font("Tahoma", Font.BOLD, 13));
		output.setBounds(40, 191, 68, 14);
		getContentPane().add(output);
		//finish
		
		//faults
		text4 = new JTextField();
		text4.setBounds(118, 223, 401, 28);
		getContentPane().add(text4);
		text4.setColumns(10);
		
		JLabel lblOutput1 = new JLabel("FAULTS");
		lblOutput1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOutput1.setBounds(40, 232, 68, 14);
		getContentPane().add(lblOutput1);
		//finish
		
		//hit ratio
		text5 = new JTextField();
		text5.setBounds(118, 262, 401, 28);
		getContentPane().add(text5);
		text5.setColumns(10);
		
		JLabel lblOutput3 = new JLabel("HIT RATIO");
		lblOutput3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOutput3.setBounds(80, 273, 75, 14);
		getContentPane().add(lblOutput3);
		//finish
		
		text6 = new JTextArea();
		text6.setBounds(118, 305, 401, 118);
		getContentPane().add(text6);
		text6.setColumns(10);
		JScrollPane scroll = new JScrollPane(text6);
        scroll.setBounds(118, 305, 401, 118);
		getContentPane().add(scroll);

		
		JLabel lblOutput5 = new JLabel("SOLUTION");
		lblOutput5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOutput5.setBounds(40, 314, 68, 14);
		getContentPane().add(lblOutput5);		

		
		//frames 
		text3 = new JTextField();
		text3.setBounds(435, 114, 86, 20);
		getContentPane().add(text3);
		text3.setColumns(10);
		
		JLabel lblFrame = new JLabel("No. of Frames");
		lblFrame.setBounds(347, 117, 106, 14);
		getContentPane().add(lblFrame);
		//finish 
		/*FIFO START*/
		JButton button = new JButton("FIFO");
		button.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				text6.setText("");
				 String Val,v="",w="",x="",y="";
				Val = text.getText();
				convert z = new convert(Val);
				int[] L= z.method1();
				int h = Integer.parseInt(text3.getText());
				int frames = h, pointer = 0, hit = 0, fault = 0,ref_len;
		        int buffer[];
		        int reference[];
		        int mem_layout[][];
		        ref_len = L.length;
		        
		        reference = new int[ref_len];
		        mem_layout = new int[ref_len][frames];
		        buffer = new int[frames];
		        for(int j = 0; j < frames; j++)
		                buffer[j] = -1;
		        
		        for(int i = 0; i < ref_len; i++)
		        {
		            reference[i] = L[i];
		        }
		        for(int i = 0; i < ref_len; i++)
		        {
		         int search = -1;
		         for(int j = 0; j < frames; j++)
		         {
		          if(buffer[j] == reference[i])
		          {
		           search = j;
		           hit++;
		           break;
		          } 
		         }
		         if(search == -1)
		         {
		          buffer[pointer] = reference[i];
		          fault++;
		          pointer++;
		          if(pointer == frames)
		           pointer = 0;
		         }
		            for(int j = 0; j < frames; j++)
		                mem_layout[i][j] = buffer[j];
		        }
		       
		       for(int i = 0; i < frames; i++)
		        {
		            for(int j = 0; j < ref_len; j++) {
		            	y=""+mem_layout[j][i];
		            	text6.setText(text6.getText()+y+"\t");
		            }
		            text6.setText(text6.getText()+"\n");
		        }
		         w=w+""+hit;
				 v=v+""+fault;
				 x=x+""+(float)((float)hit/ref_len);
				text4.setText(v);
				text2.setText(w);
				text5.setText(x);
				
										
			}
		});
		button.setBounds(202, 72, 89, 23);
		getContentPane().add(button);
		//FCFS Ends
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fifo window = new fifo();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
