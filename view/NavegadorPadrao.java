/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormularioPadrao.java
 *
 * Created on 30/06/2011, 17:53:07
 */
package view;

/**
 *
 * @author eduardo
 */
public class NavegadorPadrao extends javax.swing.JPanel {

    /** Creates new form FormularioPadrao */
    public NavegadorPadrao() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPadrao = new javax.swing.JPanel();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout());

        panelPadrao.setLayout(new java.awt.GridLayout());

        btnIncluir.setText("Incluir");
        panelPadrao.add(btnIncluir);

        btnAlterar.setText("Alterar");
        panelPadrao.add(btnAlterar);

        btnCancelar.setText("Cancelar");
        panelPadrao.add(btnCancelar);

        btnGravar.setText("Gravar");
        panelPadrao.add(btnGravar);

        btnPesquisar.setText("Pesquisar");
        panelPadrao.add(btnPesquisar);

        add(panelPadrao);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel panelPadrao;
    // End of variables declaration//GEN-END:variables
}