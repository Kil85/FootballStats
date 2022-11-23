/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pl.polsl.kamil.Window;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import pl.polsl.kamil.Model.AllTeams;
import pl.polsl.kamil.Model.Game;
import pl.polsl.kamil.Model.PastGames;

/**
 *
 * @author kil85
 */
public class AddGame extends javax.swing.JFrame {

    private PastGames table;
    private AllTeams teams;
    private JDialog jDialog1;

    public AddGame(PastGames Table, AllTeams Teams) {
        initComponents();

        this.table = Table;
        this.teams = Teams;

        SpinnerModel hModel = new SpinnerListModel(teams.namesOfTeams());
        SpinnerModel gModel = new SpinnerListModel(teams.namesOfTeams());
        hostSpinner.setModel(hModel);
        guestSpinner.setModel(gModel);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        hostSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        guestSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        hostScoreField = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        guestScoreField = new javax.swing.JFormattedTextField();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Wybierz gospodarza");

        hostSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"Item 0", "Item 1", "Item 2", "Item 3"}));

        jLabel2.setText("Wybierz goscia");

        guestSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"Item 0", "Item 1", "Item 2", "Item 3"}));

        jLabel3.setText("Podaj wynik");

        hostScoreField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        hostScoreField.setToolTipText("Host points");
        hostScoreField.setActionCommand(null);
        hostScoreField.setName(""); // NOI18N
        hostScoreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostScoreFieldActionPerformed(evt);
            }
        });

        jLabel4.setText(":");

        guestScoreField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        guestScoreField.setToolTipText("Guest points");
        guestScoreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestScoreFieldActionPerformed(evt);
            }
        });

        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setText("Dodaj");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guestSpinner)
                            .addComponent(hostSpinner)
                            .addComponent(hostScoreField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guestScoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hostSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(guestSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hostScoreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(guestScoreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(addButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        dispose();

        java.awt.EventQueue.invokeLater(() -> {
            new OpenWindow(table, teams).setVisible(true);
        });


    }//GEN-LAST:event_backButtonActionPerformed

    private void hostScoreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostScoreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostScoreFieldActionPerformed

    private void guestScoreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestScoreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestScoreFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        if (hostScoreField.getValue() == null || guestScoreField.getValue() == null) {
            this.jDialog1 = new JDialog(this, "Error");
            JLabel l = new JLabel("     Nie wszystkie pola sa zapelnione");
            jDialog1.setSize(240, 80);
            jDialog1.add(l);
            jDialog1.setVisible(true);
        } else {

            int hScore = Integer.parseInt(hostScoreField.getValue().toString());
            int gScore = Integer.parseInt(guestScoreField.getValue().toString());

            if (hScore < 0 || gScore < 0) {
                this.jDialog1 = new JDialog(this, "Error");
                JLabel l = new JLabel("     Wynik nie moze byc ujemny");
                jDialog1.setSize(240, 80);
                jDialog1.add(l);
                jDialog1.setVisible(true);
            } else {

                String hName = hostSpinner.getValue().toString();
                String gName = guestSpinner.getValue().toString();

                Game tmp = new Game(this.teams.GetTeam(hName), this.teams.GetTeam(gName), hScore, gScore);
                table.AddGame(tmp);

            }
        }


    }//GEN-LAST:event_addButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JFormattedTextField guestScoreField;
    private javax.swing.JSpinner guestSpinner;
    private javax.swing.JFormattedTextField hostScoreField;
    private javax.swing.JSpinner hostSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
