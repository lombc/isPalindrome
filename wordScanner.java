package wordscanner;

import java.awt.Color;
import javax.swing.JOptionPane;


/**
 * File Name: wordScanner.java
 * Program: Word Scanner (Assignment 3)
 * Author: Cyrus Lomibao
 * Student ID: s0486875
 * E-mail Address: cyrus_juin.lomibao@lethbridgecollege.ca
 * Brief Summary: A program that reads input, then counts certain characters
 *                that appear from the text and then detects if the
 *                the input is a palindrome. It then displays results on
 *                designated text fields
 * Last Modified: February 05, 2019
 */


public class wordScanner extends javax.swing.JFrame {
    
    // Initializes program
    public wordScanner() {
        
        JOptionPane.showMessageDialog(this, "Welcome to Word Scanner!");
        
        initComponents();
        
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
    }

    /*  Reads and counts occurrences of certain characters
        and stores them in an array of int */
    private int[] stringStats(String textInput) {
        int wordLedger[];
        wordLedger = new int[6];
        int inputLength = textInput.length();        
        
        for(int count = 0; count < inputLength; ++count) {
            if(Character.isAlphabetic(textInput.charAt(count))) {
                ++wordLedger[0]; 
                if(Character.isUpperCase(textInput.charAt(count))) {
                    ++wordLedger[4];
                }else {
                    ++wordLedger[3];
                }                
            }else if(Character.isDigit(textInput.charAt(count))) {
                ++wordLedger[1];
            }else if(Character.isISOControl(textInput.charAt(count))) {
                ++wordLedger[2];
            }else if(Character.isWhitespace(textInput.charAt(count))) {
                ++wordLedger[5];
            }
        }       
                
        return wordLedger;
    }
    
    /* Detects if input is a palindrome, but removes all
       non-alphabetic and non-digit characters first */
    private boolean isPalindrome(String userInput) {
        String originalHolder = userInput;
        StringBuilder tempHolder = new StringBuilder();
        StringBuilder newHolder = new StringBuilder();
        int inputLength = userInput.length();        
               
        for(int x = 0; x < inputLength; ++x) {
            if(Character.isDigit(originalHolder.charAt(x))) {
                newHolder.append(originalHolder.charAt(x));
                tempHolder.append(originalHolder.charAt(x));
            } else if(Character.isAlphabetic(originalHolder.charAt(x))) {
                if(Character.isUpperCase(originalHolder.charAt(x))) {                   
                    newHolder.append(Character.toLowerCase(originalHolder.charAt(x)));
                    tempHolder.append(Character.toLowerCase(originalHolder.charAt(x)));
                } else {
                    newHolder.append(originalHolder.charAt(x));
                    tempHolder.append(originalHolder.charAt(x));
                }
            }
        }

        newHolder = newHolder.reverse();
        
        return newHolder.toString().equals(tempHolder.toString());
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Scanner");
        setBackground(new java.awt.Color(51, 55, 55));
        getContentPane().setLayout(new java.awt.GridLayout(5, 0, 5, 10));

        jPanel1.setLayout(new java.awt.GridLayout(2, 3, 20, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alphabetic Characters:");
        jPanel1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Numeric Digits:");
        jPanel1.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Control Characters:");
        jPanel1.add(jLabel3);

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField1);

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField2);

        jTextField3.setEditable(false);
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField3);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(2, 3, 20, 0));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lowercase Characters:");
        jPanel2.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Uppercase Characters:");
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Whitespace Characters:");
        jPanel2.add(jLabel6);

        jTextField4.setEditable(false);
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField4);

        jTextField5.setEditable(false);
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField5);

        jTextField6.setEditable(false);
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField6);

        getContentPane().add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Is the input a palindrome?");
        jPanel3.add(jLabel7);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jTextField7);

        getContentPane().add(jPanel3);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(2, 0, 0, 5));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Press to analyze the text");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeText(evt);
            }
        });
        jPanel5.add(jButton1);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Press to clear the all fields");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButton(evt);
            }
        });
        jPanel5.add(jButton2);

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Runs all the methods stated above and displays the results
       from said methods to their designated textfields */
    private void analyzeText(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeText
        
        if(jTextArea1.getText().equals("")) {
            jTextField7.setText("Please enter text!");
            return;
        } else {
            stringStats(jTextArea1.getText());
            isPalindrome(jTextArea1.getText());  
        }      
        
        int outputResult[];
        outputResult = stringStats(jTextArea1.getText());
        boolean palindromeResult = isPalindrome(jTextArea1.getText());
        
        jTextField1.setText(Integer.toString(outputResult[0]));
        jTextField2.setText(Integer.toString(outputResult[1]));
        jTextField3.setText(Integer.toString(outputResult[2]));
        jTextField4.setText(Integer.toString(outputResult[3]));
        jTextField5.setText(Integer.toString(outputResult[4]));
        jTextField6.setText(Integer.toString(outputResult[5]));       
        jTextField7.setText(Boolean.toString(palindromeResult));
        
        if(palindromeResult == false) {
            jTextField7.setBackground(Color.red);
        } else {
            jTextField7.setBackground(Color.green);           
        }
    }//GEN-LAST:event_analyzeText

    // Clears all the text fields in the GUI
    private void resetButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButton
        jTextArea1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");       
        jTextField7.setText("");
        jTextField7.setBackground(Color.white);        
    }//GEN-LAST:event_resetButton

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(wordScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wordScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wordScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wordScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wordScanner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
