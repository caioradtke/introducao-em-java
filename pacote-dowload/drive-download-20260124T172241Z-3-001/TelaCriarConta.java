/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.udesc.testedesoftware;

import javax.swing.JOptionPane;

public class TelaCriarConta extends javax.swing.JFrame {

    private Banco banco;

    public TelaCriarConta(Banco banco) {
        this.banco = banco;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        btnCriarConta = new javax.swing.JButton();
        ckContaPoupanca = new javax.swing.JCheckBox();
        lbNomeCorrentista = new javax.swing.JLabel();
        txtNomeCorrentista = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCriarConta.setText("Criar Conta");
        btnCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarContaActionPerformed(evt);
            }
        });

        ckContaPoupanca.setText("É conta poupança? ");

        lbNomeCorrentista.setText("Nome Correntista");

        txtNomeCorrentista.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeCorrentista)
                    .addComponent(txtNomeCorrentista, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCriarConta)
                        .addComponent(ckContaPoupanca)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbNomeCorrentista)
                .addGap(18, 18, 18)
                .addComponent(txtNomeCorrentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ckContaPoupanca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnCriarConta)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarContaActionPerformed

        //Recuperar os dados da tela
        String nomeCorrentista = txtNomeCorrentista.getText();
        Boolean isContaPoupanca = ckContaPoupanca.isSelected();

        //Exercutar RN - criarConta
        if (validarDados()) {
            ContaCorrente conta = criarConta(nomeCorrentista, isContaPoupanca);

            //Exibir os dados na tela
            apresentarDados(getTipoConta(conta)+": "+conta.getNome());

            //Limpar os dados da tela
            limparTela();
        } else {
            apresentarDados("Preencha os dados corretamente");
        }

    }//GEN-LAST:event_btnCriarContaActionPerformed

    public ContaCorrente criarConta(String nomeCorrentista, Boolean isContaPoupanca) {
        if (isContaPoupanca) {
            return banco.criarContaPoupanca(nomeCorrentista);
        }
        return banco.criarContaCorrente(nomeCorrentista);
    }

    /**
     * @param args the command line arguments
     */

    public void apresentarDados(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void limparTela() {
        txtNomeCorrentista.setText("");
        ckContaPoupanca.setSelected(false);
    }

    public boolean validarDados() {
        if (txtNomeCorrentista.getText().equals("")) {
            return false;
        }
        return true;
    }
    
    public String getTipoConta(ContaCorrente conta){
        if(conta instanceof ContaPoupanca)
            return "Conta Poupanca";
        else
            return "Conta Corrente";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JCheckBox ckContaPoupanca;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lbNomeCorrentista;
    private javax.swing.JTextField txtNomeCorrentista;
    // End of variables declaration//GEN-END:variables
}
