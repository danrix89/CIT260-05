package sudoku;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import static sudoku.Menu_View.print;


public class Save_Game_Dialog extends javax.swing.JFrame 
{
/**************************
       CONSTRUCTORS:
***************************/
    public Save_Game_Dialog(Game a_game) 
        {
            initComponents();
            game = a_game;
            Dimension l_dimension = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(l_dimension.width/2-this.getSize().width/2, l_dimension.height/2-this.getSize().height/2);
        }
    
    
/**************************
       ACTIONS:
***************************/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jFileChooser1.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jFileChooser1.setApproveButtonText("Save");
        jFileChooser1.setApproveButtonToolTipText("Save your sudoku game");
        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Users\\Larry\\Documents\\NetBeansProjects\\CIT260-05\\sudoku"));
        jFileChooser1.setDialogTitle("Save Your Sudoku Game");
        jFileChooser1.setSelectedFile(new java.io.File("C:\\Program Files\\NetBeans 8.0\\.game"));
        jFileChooser1.setToolTipText("");
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        set_file_name(this.jFileChooser1.getSelectedFile().getName());
        save_game_to_file(file_name);
        this.dispose();
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    
/**************************
       BASIC METHODS:
***************************/    
    public void save_game_to_file(String a_file_name)
            // Saves Current to file.
        {       
            try
                {
                    FileOutputStream l_file_to_save = new FileOutputStream(a_file_name);
                    ObjectOutputStream l_output_stream = new ObjectOutputStream(l_file_to_save);
                    l_output_stream.writeObject(game);
                    l_output_stream.close();
                }
            catch (FileNotFoundException l_exception) 
                {
                    this.dispose();
                } 
            catch (IOException l_io_exception) 
                {
                    this.dispose();
                } 
        }

    public void load_game_from_file(String a_file_name) throws ClassNotFoundException
            // Load a game from file using a_file_name.
        {
            try
                {
                    FileInputStream l_file_to_load = new FileInputStream(a_file_name + ".game");
                    ObjectInputStream l_input_stream = new ObjectInputStream(l_file_to_load);
                    
                    Game l_loaded_game = (Game)l_input_stream.readObject();
                }
            catch (FileNotFoundException l_error) 
                {
                    this.dispose();
                } 
            catch (IOException l_error) 
                {
                    this.dispose();
                }
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
