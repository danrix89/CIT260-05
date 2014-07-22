package sudoku;

public class Main_Menu_JFrame extends javax.swing.JFrame 
{
/**************************
       CONSTRUCTORS:
***************************/
    public Main_Menu_JFrame() 
        {
            initComponents();
        }

/**************************
          ACTIONS:
***************************/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        new_game_button = new java.awt.Button();
        load_game_button = new java.awt.Button();
        exit_game_button = new java.awt.Button();
        sudoku_label = new java.awt.Label();
        main_menu_label = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku: Main Menu");

        new_game_button.setLabel("New Game");
        new_game_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_game_buttonActionPerformed(evt);
            }
        });

        load_game_button.setLabel("Load Game");
        load_game_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_game_buttonActionPerformed(evt);
            }
        });

        exit_game_button.setLabel("Exit");
        exit_game_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_game_buttonActionPerformed(evt);
            }
        });

        sudoku_label.setAlignment(java.awt.Label.CENTER);
        sudoku_label.setFont(new java.awt.Font("Impact", 2, 24)); // NOI18N
        sudoku_label.setForeground(new java.awt.Color(204, 0, 51));
        sudoku_label.setText("SUDOKU");

        main_menu_label.setAlignment(java.awt.Label.CENTER);
        main_menu_label.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        main_menu_label.setForeground(new java.awt.Color(0, 0, 153));
        main_menu_label.setText("Main Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sudoku_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(main_menu_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_game_button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(load_game_button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_game_button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sudoku_label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_menu_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(new_game_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(load_game_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit_game_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void load_game_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_game_buttonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Load_Game_Dialog().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_load_game_buttonActionPerformed

    private void new_game_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_game_buttonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_JFrame_1().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_new_game_buttonActionPerformed

    private void exit_game_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_game_buttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exit_game_buttonActionPerformed

    
/**************************
          MAIN:
***************************/
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
            java.util.logging.Logger.getLogger(Main_Menu_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu_JFrame().setVisible(true);
            }
        });
    }
    
    
/**************************
       INSTANCE VARIABLES:
***************************/    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button exit_game_button;
    private java.awt.Button load_game_button;
    private java.awt.Label main_menu_label;
    private java.awt.Button new_game_button;
    private java.awt.Label sudoku_label;
    // End of variables declaration//GEN-END:variables
}
