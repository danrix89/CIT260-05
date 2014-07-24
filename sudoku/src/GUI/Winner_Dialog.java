package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Winner_Dialog extends javax.swing.JFrame 
{


/**************************
       CONSTRUCTORS:
***************************/    
    public Winner_Dialog() 
        {
            initComponents();
            Dimension l_dimension = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(l_dimension.width/2-this.getSize().width/2, l_dimension.height/2-this.getSize().height/2);
        }
    
    
/**************************
         ACTIONS:
***************************/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        youve_won_label = new javax.swing.JLabel();
        back_to_menu_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        youve_won_label.setBackground(new java.awt.Color(0, 153, 255));
        youve_won_label.setFont(new java.awt.Font("Arial", 2, 36)); // NOI18N
        youve_won_label.setForeground(new java.awt.Color(0, 153, 51));
        youve_won_label.setText("YOU'VE WON!");

        back_to_menu_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_to_menu_button.setText("Back to Main Menu");
        back_to_menu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_menu_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(youve_won_label)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_to_menu_button)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(youve_won_label, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back_to_menu_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void back_to_menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_menu_buttonActionPerformed
        // Open a new Main Menu jfram...
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu_JFrame().setVisible(true);
            }
        });
        // ...close the dialog.
        this.dispose();       
    }//GEN-LAST:event_back_to_menu_buttonActionPerformed

    
/**************************
    INSTANCE VARIABLES:
***************************/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_menu_button;
    private javax.swing.JLabel youve_won_label;
    // End of variables declaration//GEN-END:variables
}
