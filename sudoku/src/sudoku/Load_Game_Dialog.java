package sudoku;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Load_Game_Dialog extends javax.swing.JFrame 
{
/**************************
       CONSTRUCTORS:
***************************/
    public Load_Game_Dialog() 
        {
            initComponents();
        }

    
/**************************
          ACTIONS:
***************************/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Users\\Larry\\Documents\\NetBeansProjects\\CIT260-05\\sudoku"));
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        set_file_name(this.jFileChooser1.getSelectedFile().getName());
        try 
            {
                load_game_from_file(file_name);
            } 
        catch (ClassNotFoundException ex) 
            {
                Logger.getLogger(Load_Game_Dialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        this.dispose();
    }//GEN-LAST:event_jFileChooser1ActionPerformed


    
/**************************
       BASIC METHODS:
***************************/    
    public void load_game_from_file(final String a_file_name) throws ClassNotFoundException
            // Load a game from file using a_file_name.
        {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try
                    {
                        FileInputStream l_file_to_load = new FileInputStream(a_file_name);
                        ObjectInputStream l_input_stream = new ObjectInputStream(l_file_to_load);

                        Game l_loaded_game = (Game)l_input_stream.readObject();                            

                        new Game_JFrame_1(l_loaded_game).setVisible(true);
                    }
                    catch (FileNotFoundException l_error)
                        {
                        }
                    catch (IOException l_error)
                        {
                        } 
                    catch (ClassNotFoundException ex) 
                        {
                            Logger.getLogger(Load_Game_Dialog.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
            });

         }
    
    
/**************************
    INSTANCE VARIABLES:
***************************/    
    private Game game;
    boolean save_game;
    String file_name;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables

       
/**************************
        SETTINGS:
***************************/ 
    public void set_file_name(String a_file_name) 
        {
            this.file_name = a_file_name;
        }    
}
