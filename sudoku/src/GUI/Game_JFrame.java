package GUI;

import MODEL.Game;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Game_JFrame extends javax.swing.JFrame 
{
/**************************
        CONSTRUCTORS:
***************************/
    public Game_JFrame() 
        {
            initComponents();
            game = new Game("NAME_OF_PLAYER_NEEDS_TO_GO_HERE"); // A New_Game_Dialog should be created to get the player's name.
            display_board_values();
            Dimension l_dimension = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(l_dimension.width/2-this.getSize().width/2, l_dimension.height/2-this.getSize().height/2);
        }

    public Game_JFrame(Game a_game) 
        {
            initComponents();
            game = a_game;
            display_board_values();
            Dimension l_dimension = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(l_dimension.width/2-this.getSize().width/2, l_dimension.height/2-this.getSize().height/2);            
        }
    
/**************************
        ACTIONS:
***************************/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        help_dialog = new javax.swing.JDialog();
        help_dialog_text_pane = new javax.swing.JScrollPane();
        help_dialog_text_area = new javax.swing.JTextArea();
        help_dialog_label = new javax.swing.JLabel();
        b1_c1 = new java.awt.Label();
        b1_c2 = new java.awt.Label();
        b1_c3 = new java.awt.Label();
        b1_c4 = new java.awt.Label();
        b1_c5 = new java.awt.Label();
        b1_c6 = new java.awt.Label();
        b1_c7 = new java.awt.Label();
        b1_c8 = new java.awt.Label();
        b1_c9 = new java.awt.Label();
        b2_c1 = new java.awt.Label();
        b2_c2 = new java.awt.Label();
        b2_c3 = new java.awt.Label();
        b2_c4 = new java.awt.Label();
        b2_c5 = new java.awt.Label();
        b2_c6 = new java.awt.Label();
        b2_c7 = new java.awt.Label();
        b2_c8 = new java.awt.Label();
        b2_c9 = new java.awt.Label();
        b3_c1 = new java.awt.Label();
        b3_c2 = new java.awt.Label();
        b3_c3 = new java.awt.Label();
        b3_c4 = new java.awt.Label();
        b3_c5 = new java.awt.Label();
        b3_c6 = new java.awt.Label();
        b3_c7 = new java.awt.Label();
        b3_c8 = new java.awt.Label();
        b3_c9 = new java.awt.Label();
        b4_c1 = new java.awt.Label();
        b4_c2 = new java.awt.Label();
        b4_c3 = new java.awt.Label();
        b4_c4 = new java.awt.Label();
        b4_c5 = new java.awt.Label();
        b4_c6 = new java.awt.Label();
        b4_c7 = new java.awt.Label();
        b4_c8 = new java.awt.Label();
        b4_c9 = new java.awt.Label();
        b5_c1 = new java.awt.Label();
        b5_c2 = new java.awt.Label();
        b5_c3 = new java.awt.Label();
        b5_c4 = new java.awt.Label();
        b5_c5 = new java.awt.Label();
        b5_c6 = new java.awt.Label();
        b5_c7 = new java.awt.Label();
        b5_c8 = new java.awt.Label();
        b5_c9 = new java.awt.Label();
        b6_c1 = new java.awt.Label();
        b6_c2 = new java.awt.Label();
        b6_c3 = new java.awt.Label();
        b6_c4 = new java.awt.Label();
        b6_c5 = new java.awt.Label();
        b6_c6 = new java.awt.Label();
        b6_c7 = new java.awt.Label();
        b6_c8 = new java.awt.Label();
        b6_c9 = new java.awt.Label();
        b7_c1 = new java.awt.Label();
        b7_c2 = new java.awt.Label();
        b7_c3 = new java.awt.Label();
        b7_c4 = new java.awt.Label();
        b7_c5 = new java.awt.Label();
        b7_c6 = new java.awt.Label();
        b7_c7 = new java.awt.Label();
        b7_c8 = new java.awt.Label();
        b7_c9 = new java.awt.Label();
        b8_c1 = new java.awt.Label();
        b8_c2 = new java.awt.Label();
        b8_c3 = new java.awt.Label();
        b8_c4 = new java.awt.Label();
        b8_c5 = new java.awt.Label();
        b8_c6 = new java.awt.Label();
        b8_c7 = new java.awt.Label();
        b8_c8 = new java.awt.Label();
        b8_c9 = new java.awt.Label();
        b9_c1 = new java.awt.Label();
        b9_c2 = new java.awt.Label();
        b9_c3 = new java.awt.Label();
        b9_c4 = new java.awt.Label();
        b9_c5 = new java.awt.Label();
        b9_c6 = new java.awt.Label();
        b9_c7 = new java.awt.Label();
        b9_c8 = new java.awt.Label();
        b9_c9 = new java.awt.Label();
        value_button_1 = new java.awt.Button();
        value_button_2 = new java.awt.Button();
        value_button_3 = new java.awt.Button();
        value_button_4 = new java.awt.Button();
        value_button_5 = new java.awt.Button();
        value_button_6 = new java.awt.Button();
        value_button_7 = new java.awt.Button();
        value_button_8 = new java.awt.Button();
        value_button_9 = new java.awt.Button();
        value_field = new java.awt.TextField();
        value_label = new java.awt.Label();
        block_button_1 = new java.awt.Button();
        block_button_2 = new java.awt.Button();
        block_button_3 = new java.awt.Button();
        block_button_4 = new java.awt.Button();
        block_button_5 = new java.awt.Button();
        block_button_6 = new java.awt.Button();
        block_button_7 = new java.awt.Button();
        block_button_8 = new java.awt.Button();
        block_button_9 = new java.awt.Button();
        block_field = new java.awt.TextField();
        block_label = new java.awt.Label();
        cell_button_1 = new java.awt.Button();
        cell_button_2 = new java.awt.Button();
        cell_button_3 = new java.awt.Button();
        cell_button_4 = new java.awt.Button();
        cell_button_5 = new java.awt.Button();
        cell_button_6 = new java.awt.Button();
        cell_button_7 = new java.awt.Button();
        cell_button_8 = new java.awt.Button();
        cell_button_9 = new java.awt.Button();
        cell_field = new java.awt.TextField();
        cell_label = new java.awt.Label();
        set_value_button = new javax.swing.JButton();
        set_value_button1 = new javax.swing.JButton();
        message_label = new javax.swing.JLabel();
        game_menu_bar = new javax.swing.JMenuBar();
        file_option = new javax.swing.JMenu();
        new_game_menu_item = new javax.swing.JMenuItem();
        save_game_menu_item = new javax.swing.JMenuItem();
        load_game_menu_item = new javax.swing.JMenuItem();
        help_option = new javax.swing.JMenu();
        rules_help_menu_item = new javax.swing.JMenuItem();
        board_help_menu_item = new javax.swing.JMenuItem();
        difficulty_help_menu_item = new javax.swing.JMenuItem();
        scoring_help_menu_item = new javax.swing.JMenuItem();

        help_dialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        help_dialog.setTitle("Sudoku: Help");
        help_dialog.setAlwaysOnTop(true);
        help_dialog.setMinimumSize(new java.awt.Dimension(250, 275));
        help_dialog.setModal(true);
        help_dialog.setName("help_dialog"); // NOI18N
        help_dialog.setResizable(false);

        help_dialog_text_area.setEditable(false);
        help_dialog_text_area.setColumns(20);
        help_dialog_text_area.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        help_dialog_text_area.setLineWrap(true);
        help_dialog_text_area.setRows(5);
        help_dialog_text_area.setWrapStyleWord(true);
        help_dialog_text_area.setFocusable(false);
        help_dialog_text_area.setVerifyInputWhenFocusTarget(false);
        help_dialog_text_pane.setViewportView(help_dialog_text_area);

        help_dialog_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        help_dialog_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        help_dialog_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout help_dialogLayout = new javax.swing.GroupLayout(help_dialog.getContentPane());
        help_dialog.getContentPane().setLayout(help_dialogLayout);
        help_dialogLayout.setHorizontalGroup(
            help_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(help_dialog_text_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(help_dialog_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        help_dialogLayout.setVerticalGroup(
            help_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(help_dialogLayout.createSequentialGroup()
                .addComponent(help_dialog_label, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(help_dialog_text_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sudoku");
        setBackground(new java.awt.Color(51, 204, 255));

        b1_c1.setAlignment(java.awt.Label.CENTER);
        b1_c1.setBackground(new java.awt.Color(255, 255, 255));
        b1_c1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b1_c2.setAlignment(java.awt.Label.CENTER);
        b1_c2.setBackground(new java.awt.Color(255, 255, 255));
        b1_c2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b1_c3.setAlignment(java.awt.Label.CENTER);
        b1_c3.setBackground(new java.awt.Color(255, 255, 255));
        b1_c3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b1_c4.setAlignment(java.awt.Label.CENTER);
        b1_c4.setBackground(new java.awt.Color(255, 255, 255));
        b1_c4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b1_c5.setAlignment(java.awt.Label.CENTER);
        b1_c5.setBackground(new java.awt.Color(255, 255, 255));
        b1_c5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b1_c6.setAlignment(java.awt.Label.CENTER);
        b1_c6.setBackground(new java.awt.Color(255, 255, 255));
        b1_c6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b1_c7.setAlignment(java.awt.Label.CENTER);
        b1_c7.setBackground(new java.awt.Color(255, 255, 255));
        b1_c7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b1_c8.setAlignment(java.awt.Label.CENTER);
        b1_c8.setBackground(new java.awt.Color(255, 255, 255));
        b1_c8.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b1_c9.setAlignment(java.awt.Label.CENTER);
        b1_c9.setBackground(new java.awt.Color(255, 255, 255));
        b1_c9.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b2_c1.setAlignment(java.awt.Label.CENTER);
        b2_c1.setBackground(new java.awt.Color(255, 255, 255));
        b2_c1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b2_c2.setAlignment(java.awt.Label.CENTER);
        b2_c2.setBackground(new java.awt.Color(255, 255, 255));
        b2_c2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b2_c3.setAlignment(java.awt.Label.CENTER);
        b2_c3.setBackground(new java.awt.Color(255, 255, 255));
        b2_c3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b2_c4.setAlignment(java.awt.Label.CENTER);
        b2_c4.setBackground(new java.awt.Color(255, 255, 255));
        b2_c4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b2_c5.setAlignment(java.awt.Label.CENTER);
        b2_c5.setBackground(new java.awt.Color(255, 255, 255));
        b2_c5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b2_c6.setAlignment(java.awt.Label.CENTER);
        b2_c6.setBackground(new java.awt.Color(255, 255, 255));
        b2_c6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b2_c7.setAlignment(java.awt.Label.CENTER);
        b2_c7.setBackground(new java.awt.Color(255, 255, 255));
        b2_c7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b2_c8.setAlignment(java.awt.Label.CENTER);
        b2_c8.setBackground(new java.awt.Color(255, 255, 255));
        b2_c8.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b2_c9.setAlignment(java.awt.Label.CENTER);
        b2_c9.setBackground(new java.awt.Color(255, 255, 255));
        b2_c9.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b3_c1.setAlignment(java.awt.Label.CENTER);
        b3_c1.setBackground(new java.awt.Color(255, 255, 255));
        b3_c1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b3_c2.setAlignment(java.awt.Label.CENTER);
        b3_c2.setBackground(new java.awt.Color(255, 255, 255));
        b3_c2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b3_c3.setAlignment(java.awt.Label.CENTER);
        b3_c3.setBackground(new java.awt.Color(255, 255, 255));
        b3_c3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b3_c4.setAlignment(java.awt.Label.CENTER);
        b3_c4.setBackground(new java.awt.Color(255, 255, 255));
        b3_c4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b3_c5.setAlignment(java.awt.Label.CENTER);
        b3_c5.setBackground(new java.awt.Color(255, 255, 255));
        b3_c5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b3_c6.setAlignment(java.awt.Label.CENTER);
        b3_c6.setBackground(new java.awt.Color(255, 255, 255));
        b3_c6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b3_c7.setAlignment(java.awt.Label.CENTER);
        b3_c7.setBackground(new java.awt.Color(255, 255, 255));
        b3_c7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b3_c8.setAlignment(java.awt.Label.CENTER);
        b3_c8.setBackground(new java.awt.Color(255, 255, 255));
        b3_c8.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b3_c9.setAlignment(java.awt.Label.CENTER);
        b3_c9.setBackground(new java.awt.Color(255, 255, 255));
        b3_c9.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b4_c1.setAlignment(java.awt.Label.CENTER);
        b4_c1.setBackground(new java.awt.Color(255, 255, 255));
        b4_c1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b4_c2.setAlignment(java.awt.Label.CENTER);
        b4_c2.setBackground(new java.awt.Color(255, 255, 255));
        b4_c2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b4_c3.setAlignment(java.awt.Label.CENTER);
        b4_c3.setBackground(new java.awt.Color(255, 255, 255));
        b4_c3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b4_c4.setAlignment(java.awt.Label.CENTER);
        b4_c4.setBackground(new java.awt.Color(255, 255, 255));
        b4_c4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b4_c5.setAlignment(java.awt.Label.CENTER);
        b4_c5.setBackground(new java.awt.Color(255, 255, 255));
        b4_c5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b4_c6.setAlignment(java.awt.Label.CENTER);
        b4_c6.setBackground(new java.awt.Color(255, 255, 255));
        b4_c6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b4_c7.setAlignment(java.awt.Label.CENTER);
        b4_c7.setBackground(new java.awt.Color(255, 255, 255));
        b4_c7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b4_c8.setAlignment(java.awt.Label.CENTER);
        b4_c8.setBackground(new java.awt.Color(255, 255, 255));
        b4_c8.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b4_c9.setAlignment(java.awt.Label.CENTER);
        b4_c9.setBackground(new java.awt.Color(255, 255, 255));
        b4_c9.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b5_c1.setAlignment(java.awt.Label.CENTER);
        b5_c1.setBackground(new java.awt.Color(255, 255, 255));
        b5_c1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b5_c2.setAlignment(java.awt.Label.CENTER);
        b5_c2.setBackground(new java.awt.Color(255, 255, 255));
        b5_c2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b5_c3.setAlignment(java.awt.Label.CENTER);
        b5_c3.setBackground(new java.awt.Color(255, 255, 255));
        b5_c3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b5_c4.setAlignment(java.awt.Label.CENTER);
        b5_c4.setBackground(new java.awt.Color(255, 255, 255));
        b5_c4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b5_c5.setAlignment(java.awt.Label.CENTER);
        b5_c5.setBackground(new java.awt.Color(255, 255, 255));
        b5_c5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b5_c6.setAlignment(java.awt.Label.CENTER);
        b5_c6.setBackground(new java.awt.Color(255, 255, 255));
        b5_c6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b5_c7.setAlignment(java.awt.Label.CENTER);
        b5_c7.setBackground(new java.awt.Color(255, 255, 255));
        b5_c7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b5_c8.setAlignment(java.awt.Label.CENTER);
        b5_c8.setBackground(new java.awt.Color(255, 255, 255));
        b5_c8.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b5_c9.setAlignment(java.awt.Label.CENTER);
        b5_c9.setBackground(new java.awt.Color(255, 255, 255));
        b5_c9.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b6_c1.setAlignment(java.awt.Label.CENTER);
        b6_c1.setBackground(new java.awt.Color(255, 255, 255));
        b6_c1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b6_c2.setAlignment(java.awt.Label.CENTER);
        b6_c2.setBackground(new java.awt.Color(255, 255, 255));
        b6_c2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b6_c3.setAlignment(java.awt.Label.CENTER);
        b6_c3.setBackground(new java.awt.Color(255, 255, 255));
        b6_c3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b6_c4.setAlignment(java.awt.Label.CENTER);
        b6_c4.setBackground(new java.awt.Color(255, 255, 255));
        b6_c4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b6_c5.setAlignment(java.awt.Label.CENTER);
        b6_c5.setBackground(new java.awt.Color(255, 255, 255));
        b6_c5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b6_c6.setAlignment(java.awt.Label.CENTER);
        b6_c6.setBackground(new java.awt.Color(255, 255, 255));
        b6_c6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b6_c7.setAlignment(java.awt.Label.CENTER);
        b6_c7.setBackground(new java.awt.Color(255, 255, 255));
        b6_c7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b6_c8.setAlignment(java.awt.Label.CENTER);
        b6_c8.setBackground(new java.awt.Color(255, 255, 255));
        b6_c8.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b6_c9.setAlignment(java.awt.Label.CENTER);
        b6_c9.setBackground(new java.awt.Color(255, 255, 255));
        b6_c9.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b7_c1.setAlignment(java.awt.Label.CENTER);
        b7_c1.setBackground(new java.awt.Color(255, 255, 255));
        b7_c1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b7_c2.setAlignment(java.awt.Label.CENTER);
        b7_c2.setBackground(new java.awt.Color(255, 255, 255));
        b7_c2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b7_c3.setAlignment(java.awt.Label.CENTER);
        b7_c3.setBackground(new java.awt.Color(255, 255, 255));
        b7_c3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b7_c4.setAlignment(java.awt.Label.CENTER);
        b7_c4.setBackground(new java.awt.Color(255, 255, 255));
        b7_c4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b7_c5.setAlignment(java.awt.Label.CENTER);
        b7_c5.setBackground(new java.awt.Color(255, 255, 255));
        b7_c5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b7_c6.setAlignment(java.awt.Label.CENTER);
        b7_c6.setBackground(new java.awt.Color(255, 255, 255));
        b7_c6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b7_c7.setAlignment(java.awt.Label.CENTER);
        b7_c7.setBackground(new java.awt.Color(255, 255, 255));
        b7_c7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b7_c8.setAlignment(java.awt.Label.CENTER);
        b7_c8.setBackground(new java.awt.Color(255, 255, 255));
        b7_c8.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b7_c9.setAlignment(java.awt.Label.CENTER);
        b7_c9.setBackground(new java.awt.Color(255, 255, 255));
        b7_c9.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b8_c1.setAlignment(java.awt.Label.CENTER);
        b8_c1.setBackground(new java.awt.Color(255, 255, 255));
        b8_c1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b8_c2.setAlignment(java.awt.Label.CENTER);
        b8_c2.setBackground(new java.awt.Color(255, 255, 255));
        b8_c2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b8_c3.setAlignment(java.awt.Label.CENTER);
        b8_c3.setBackground(new java.awt.Color(255, 255, 255));
        b8_c3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b8_c4.setAlignment(java.awt.Label.CENTER);
        b8_c4.setBackground(new java.awt.Color(255, 255, 255));
        b8_c4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b8_c5.setAlignment(java.awt.Label.CENTER);
        b8_c5.setBackground(new java.awt.Color(255, 255, 255));
        b8_c5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b8_c6.setAlignment(java.awt.Label.CENTER);
        b8_c6.setBackground(new java.awt.Color(255, 255, 255));
        b8_c6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b8_c7.setAlignment(java.awt.Label.CENTER);
        b8_c7.setBackground(new java.awt.Color(255, 255, 255));
        b8_c7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b8_c8.setAlignment(java.awt.Label.CENTER);
        b8_c8.setBackground(new java.awt.Color(255, 255, 255));
        b8_c8.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b8_c9.setAlignment(java.awt.Label.CENTER);
        b8_c9.setBackground(new java.awt.Color(255, 255, 255));
        b8_c9.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b9_c1.setAlignment(java.awt.Label.CENTER);
        b9_c1.setBackground(new java.awt.Color(255, 255, 255));
        b9_c1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b9_c2.setAlignment(java.awt.Label.CENTER);
        b9_c2.setBackground(new java.awt.Color(255, 255, 255));
        b9_c2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b9_c3.setAlignment(java.awt.Label.CENTER);
        b9_c3.setBackground(new java.awt.Color(255, 255, 255));
        b9_c3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b9_c4.setAlignment(java.awt.Label.CENTER);
        b9_c4.setBackground(new java.awt.Color(255, 255, 255));
        b9_c4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b9_c5.setAlignment(java.awt.Label.CENTER);
        b9_c5.setBackground(new java.awt.Color(255, 255, 255));
        b9_c5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b9_c6.setAlignment(java.awt.Label.CENTER);
        b9_c6.setBackground(new java.awt.Color(255, 255, 255));
        b9_c6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b9_c7.setAlignment(java.awt.Label.CENTER);
        b9_c7.setBackground(new java.awt.Color(255, 255, 255));
        b9_c7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b9_c8.setAlignment(java.awt.Label.CENTER);
        b9_c8.setBackground(new java.awt.Color(255, 255, 255));
        b9_c8.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        b9_c9.setAlignment(java.awt.Label.CENTER);
        b9_c9.setBackground(new java.awt.Color(255, 255, 255));
        b9_c9.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        value_button_1.setLabel("1");
        value_button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value_button_1ActionPerformed(evt);
            }
        });

        value_button_2.setLabel("2");
        value_button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value_button_2ActionPerformed(evt);
            }
        });

        value_button_3.setLabel("3");
        value_button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value_button_3ActionPerformed(evt);
            }
        });

        value_button_4.setLabel("4");
        value_button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value_button_4ActionPerformed(evt);
            }
        });

        value_button_5.setLabel("5");
        value_button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value_button_5ActionPerformed(evt);
            }
        });

        value_button_6.setLabel("6");
        value_button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value_button_6ActionPerformed(evt);
            }
        });

        value_button_7.setLabel("7");
        value_button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value_button_7ActionPerformed(evt);
            }
        });

        value_button_8.setLabel("8");
        value_button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value_button_8ActionPerformed(evt);
            }
        });

        value_button_9.setLabel("9");
        value_button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value_button_9ActionPerformed(evt);
            }
        });

        value_field.setEditable(false);
        value_field.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        value_label.setAlignment(java.awt.Label.CENTER);
        value_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        value_label.setText("Value:");

        block_button_1.setLabel("1");
        block_button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_button_1ActionPerformed(evt);
            }
        });

        block_button_2.setLabel("2");
        block_button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_button_2ActionPerformed(evt);
            }
        });

        block_button_3.setLabel("3");
        block_button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_button_3ActionPerformed(evt);
            }
        });

        block_button_4.setLabel("4");
        block_button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_button_4ActionPerformed(evt);
            }
        });

        block_button_5.setLabel("5");
        block_button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_button_5ActionPerformed(evt);
            }
        });

        block_button_6.setLabel("6");
        block_button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_button_6ActionPerformed(evt);
            }
        });

        block_button_7.setLabel("7");
        block_button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_button_7ActionPerformed(evt);
            }
        });

        block_button_8.setLabel("8");
        block_button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_button_8ActionPerformed(evt);
            }
        });

        block_button_9.setLabel("9");
        block_button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block_button_9ActionPerformed(evt);
            }
        });

        block_field.setEditable(false);
        block_field.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        block_label.setAlignment(java.awt.Label.CENTER);
        block_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        block_label.setText("Block #:");

        cell_button_1.setLabel("1");
        cell_button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell_button_1ActionPerformed(evt);
            }
        });

        cell_button_2.setLabel("2");
        cell_button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell_button_2ActionPerformed(evt);
            }
        });

        cell_button_3.setLabel("3");
        cell_button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell_button_3ActionPerformed(evt);
            }
        });

        cell_button_4.setLabel("4");
        cell_button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell_button_4ActionPerformed(evt);
            }
        });

        cell_button_5.setLabel("5");
        cell_button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell_button_5ActionPerformed(evt);
            }
        });

        cell_button_6.setLabel("6");
        cell_button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell_button_6ActionPerformed(evt);
            }
        });

        cell_button_7.setLabel("7");
        cell_button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell_button_7ActionPerformed(evt);
            }
        });

        cell_button_8.setLabel("8");
        cell_button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell_button_8ActionPerformed(evt);
            }
        });

        cell_button_9.setLabel("9");
        cell_button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell_button_9ActionPerformed(evt);
            }
        });

        cell_field.setEditable(false);
        cell_field.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        cell_label.setAlignment(java.awt.Label.CENTER);
        cell_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cell_label.setText("Cell #:");

        set_value_button.setBackground(new java.awt.Color(0, 204, 0));
        set_value_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        set_value_button.setText("Set Value");
        set_value_button.setToolTipText("Sets the value for the currently specified block and cell.");
        set_value_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_value_buttonActionPerformed(evt);
            }
        });

        set_value_button1.setBackground(new java.awt.Color(255, 255, 0));
        set_value_button1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        set_value_button1.setText("Clear");
        set_value_button1.setToolTipText("Sets the value for the currently specified block and cell.");
        set_value_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_value_button1ActionPerformed(evt);
            }
        });

        message_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        message_label.setForeground(new java.awt.Color(255, 0, 0));

        file_option.setText("File");

        new_game_menu_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        new_game_menu_item.setText("New Game");
        new_game_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_game_menu_itemActionPerformed(evt);
            }
        });
        file_option.add(new_game_menu_item);

        save_game_menu_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save_game_menu_item.setText("Save Game");
        save_game_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_game_menu_itemActionPerformed(evt);
            }
        });
        file_option.add(save_game_menu_item);

        load_game_menu_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        load_game_menu_item.setText("Load Game");
        load_game_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_game_menu_itemActionPerformed(evt);
            }
        });
        file_option.add(load_game_menu_item);

        game_menu_bar.add(file_option);

        help_option.setText("Help");

        rules_help_menu_item.setText("Rules");
        rules_help_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rules_help_menu_itemActionPerformed(evt);
            }
        });
        help_option.add(rules_help_menu_item);

        board_help_menu_item.setText("Board");
        board_help_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                board_help_menu_itemActionPerformed(evt);
            }
        });
        help_option.add(board_help_menu_item);

        difficulty_help_menu_item.setText("Difficulty");
        difficulty_help_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficulty_help_menu_itemActionPerformed(evt);
            }
        });
        help_option.add(difficulty_help_menu_item);

        scoring_help_menu_item.setText("Scoring");
        scoring_help_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoring_help_menu_itemActionPerformed(evt);
            }
        });
        help_option.add(scoring_help_menu_item);

        game_menu_bar.add(help_option);

        setJMenuBar(game_menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b1_c4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(b1_c7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(b1_c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b7_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b7_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b7_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b5_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b5_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b5_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b8_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b8_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b8_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b8_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b8_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b8_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b8_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b8_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b8_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b6_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b6_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b6_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b9_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b9_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b9_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b9_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b9_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b9_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b9_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b9_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b9_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(256, 256, 256)
                            .addComponent(block_label, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(block_field, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(value_button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(value_button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(value_button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(value_button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(value_button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(value_button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(value_button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(value_button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(value_button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(value_label, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(value_field, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(block_button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(block_button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(block_button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(block_button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(block_button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(block_button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(block_button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(block_button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(block_button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(272, 272, 272)
                            .addComponent(cell_label, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cell_field, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cell_button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cell_button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cell_button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cell_button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cell_button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cell_button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cell_button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cell_button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cell_button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(message_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(set_value_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(set_value_button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(value_button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(value_button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(value_button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(value_button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(value_button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(value_button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(value_button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(value_button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(value_button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(value_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(value_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(block_button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(block_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(b1_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(b1_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(b1_c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b1_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b1_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b1_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(b1_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b1_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b2_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(b2_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(b2_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b2_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(b2_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(b2_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b2_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(b2_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(b2_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(b3_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(b3_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(b3_c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b3_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b3_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b3_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b3_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b3_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b3_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b4_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b4_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b4_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b4_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b4_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b4_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b4_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b4_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b4_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b5_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b5_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b5_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b5_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b5_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b5_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b5_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b5_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b5_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b6_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b6_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b6_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b6_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b6_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b6_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b6_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b6_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b6_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b9_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b9_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b9_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b9_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b9_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b9_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b8_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b8_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b8_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b8_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b8_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b8_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b8_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b8_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b8_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b7_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b7_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b7_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b7_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b7_c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b7_c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b7_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b7_c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(b7_c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b9_c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(message_label, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(set_value_button)
                                                    .addComponent(set_value_button1)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(b9_c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(b9_c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cell_button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cell_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cell_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void value_button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value_button_1ActionPerformed
        value_field.setText("1");
    }//GEN-LAST:event_value_button_1ActionPerformed

    private void value_button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value_button_2ActionPerformed
        value_field.setText("2");
    }//GEN-LAST:event_value_button_2ActionPerformed

    private void value_button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value_button_3ActionPerformed
        value_field.setText("3");
    }//GEN-LAST:event_value_button_3ActionPerformed

    private void value_button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value_button_4ActionPerformed
        value_field.setText("4");
    }//GEN-LAST:event_value_button_4ActionPerformed

    private void value_button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value_button_5ActionPerformed
        value_field.setText("5");
    }//GEN-LAST:event_value_button_5ActionPerformed

    private void value_button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value_button_6ActionPerformed
        value_field.setText("6");
    }//GEN-LAST:event_value_button_6ActionPerformed

    private void value_button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value_button_7ActionPerformed
        value_field.setText("7");
    }//GEN-LAST:event_value_button_7ActionPerformed

    private void value_button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value_button_8ActionPerformed
        value_field.setText("8");
    }//GEN-LAST:event_value_button_8ActionPerformed

    private void value_button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value_button_9ActionPerformed
        value_field.setText("9");
    }//GEN-LAST:event_value_button_9ActionPerformed

    private void block_button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_button_1ActionPerformed
        block_field.setText("1");
    }//GEN-LAST:event_block_button_1ActionPerformed

    private void block_button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_button_2ActionPerformed
        block_field.setText("2");
    }//GEN-LAST:event_block_button_2ActionPerformed

    private void block_button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_button_3ActionPerformed
        block_field.setText("3");
    }//GEN-LAST:event_block_button_3ActionPerformed

    private void block_button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_button_4ActionPerformed
        block_field.setText("4");
    }//GEN-LAST:event_block_button_4ActionPerformed

    private void block_button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_button_5ActionPerformed
        block_field.setText("5");
    }//GEN-LAST:event_block_button_5ActionPerformed

    private void block_button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_button_6ActionPerformed
        block_field.setText("6");
    }//GEN-LAST:event_block_button_6ActionPerformed

    private void block_button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_button_7ActionPerformed
        block_field.setText("7");
    }//GEN-LAST:event_block_button_7ActionPerformed

    private void block_button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_button_8ActionPerformed
        block_field.setText("8");
    }//GEN-LAST:event_block_button_8ActionPerformed

    private void block_button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block_button_9ActionPerformed
        block_field.setText("9");
    }//GEN-LAST:event_block_button_9ActionPerformed

    private void cell_button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell_button_1ActionPerformed
        cell_field.setText("1");
    }//GEN-LAST:event_cell_button_1ActionPerformed

    private void cell_button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell_button_2ActionPerformed
        cell_field.setText("2");
    }//GEN-LAST:event_cell_button_2ActionPerformed

    private void cell_button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell_button_3ActionPerformed
        cell_field.setText("3");
    }//GEN-LAST:event_cell_button_3ActionPerformed

    private void cell_button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell_button_4ActionPerformed
        cell_field.setText("4");
    }//GEN-LAST:event_cell_button_4ActionPerformed

    private void cell_button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell_button_5ActionPerformed
        cell_field.setText("5");
    }//GEN-LAST:event_cell_button_5ActionPerformed

    private void cell_button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell_button_6ActionPerformed
        cell_field.setText("6");
    }//GEN-LAST:event_cell_button_6ActionPerformed

    private void cell_button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell_button_7ActionPerformed
        cell_field.setText("7");
    }//GEN-LAST:event_cell_button_7ActionPerformed

    private void cell_button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell_button_8ActionPerformed
        cell_field.setText("8");
    }//GEN-LAST:event_cell_button_8ActionPerformed

    private void cell_button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell_button_9ActionPerformed
        cell_field.setText("9");
    }//GEN-LAST:event_cell_button_9ActionPerformed

    private void set_value_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_value_buttonActionPerformed
        if (able_to_set_value())
            {
                int Y, X, y, x;
                String l_block_y, l_block_x, l_cell_y, l_cell_x;

                l_block_y = block_field.getText();
                l_block_x = block_field.getText();
                l_cell_y = cell_field.getText();
                l_cell_x = cell_field.getText();

                Y = (Integer.parseInt(l_block_y) - 1) / 3;
                X = (Integer.parseInt(l_block_x) - 1) % 3;
                y = (Integer.parseInt(l_cell_y) - 1) / 3;
                x = (Integer.parseInt(l_cell_x) - 1) % 3;

                game.set_cell(Y, X, y, x, (value_field.getText()));
                display_board_values(); // Repaints the labels for the board
                clear_user_values();
                if(game.is_winner())
                    {
                        java.awt.EventQueue.invokeLater(new Runnable() {
                           public void run() {
                               new Winner_Dialog().setVisible(true);
                           }
                        });
                        this.dispose();
                    }
            }
        else
            {
                message_label.setText("Please enter in a value, block, and cell number.");
            }
    }//GEN-LAST:event_set_value_buttonActionPerformed

    private void set_value_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_value_button1ActionPerformed
        clear_user_values();
    }//GEN-LAST:event_set_value_button1ActionPerformed

    private void save_game_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_game_menu_itemActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Save_Game_Dialog(game).setVisible(true);
            }
        });
    }//GEN-LAST:event_save_game_menu_itemActionPerformed

    private void load_game_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_game_menu_itemActionPerformed
        final Game_JFrame l_parent_frame = this;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Load_Game_Dialog(l_parent_frame).setVisible(true);
            }
        });
    }//GEN-LAST:event_load_game_menu_itemActionPerformed

    private void rules_help_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rules_help_menu_itemActionPerformed
        help_dialog_label.setText("Rules of Sudoku:");
        help_dialog_text_area.setText("Fill in each cell with the numbers 1-9, ensuring that teach row, column, and 3x3 block has no duplicates. Each row should have it's own set of numbers starting from 1 going to 9 without duplicates. Each column and 3x3 block should do the same. There is only one solution for each game.");
        Dimension l_dimension = Toolkit.getDefaultToolkit().getScreenSize();
        help_dialog.setLocation(l_dimension.width/2-this.getSize().width/2, l_dimension.height/2-this.getSize().height/2);
        help_dialog.show();

    }//GEN-LAST:event_rules_help_menu_itemActionPerformed

    private void board_help_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_board_help_menu_itemActionPerformed
        help_dialog_label.setText("The Sudoku board:");
        help_dialog_text_area.setText("Cells - Individual boxes that you place a number into. \nRows - Set of nine cells going horizontally across the board. \nColumns - Set of nine cells going vertically across the board. \nBlocks - 3x3 set of cells \"blocked\" together. There are nine of each, all holding the numbers 1-9 with no duplicates.");
        Dimension l_dimension = Toolkit.getDefaultToolkit().getScreenSize();
        help_dialog.setLocation(l_dimension.width/2-this.getSize().width/2, l_dimension.height/2-this.getSize().height/2);
        help_dialog.show();
    }//GEN-LAST:event_board_help_menu_itemActionPerformed

    private void difficulty_help_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficulty_help_menu_itemActionPerformed
        help_dialog_label.setText("Difficulty Types:");
        help_dialog_text_area.setText("Easy: 25 cells are prefilled at the beginning of the game with 3 hints. Medium: 20 cells are prefilled at the beginning of the game with 2 hints. Hard: 10 cells are prefilled at the beginning of the game with 1 hint.");
        Dimension l_dimension = Toolkit.getDefaultToolkit().getScreenSize();
        help_dialog.setLocation(l_dimension.width/2-this.getSize().width/2, l_dimension.height/2-this.getSize().height/2);
        help_dialog.show();
    }//GEN-LAST:event_difficulty_help_menu_itemActionPerformed

    private void scoring_help_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoring_help_menu_itemActionPerformed
        help_dialog_label.setText("High Scores:");
        help_dialog_text_area.setText("First, scoring is calculated by how long it takes a player to complete a game. A high score is achieved when a player completes a board with less time than the three previous high scores. There also three categories of high scores depending on dificulty of the game played.");
        Dimension l_dimension = Toolkit.getDefaultToolkit().getScreenSize();
        help_dialog.setLocation(l_dimension.width/2-this.getSize().width/2, l_dimension.height/2-this.getSize().height/2);
        help_dialog.show();
    }//GEN-LAST:event_scoring_help_menu_itemActionPerformed

    private void new_game_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_game_menu_itemActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_JFrame().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_new_game_menu_itemActionPerformed


/**************************
       STATUS REPORT:
***************************/
    private boolean able_to_set_value()
            //
        {
            boolean l_result = false;
            
            if(!(value_field.getText().equals("")) && !(block_field.getText().equals("")) && !(cell_field.getText().equals("")))
                {
                    l_result = true;
                }
            return l_result;
        }

    
/**************************
       BASIC METHODS:
***************************/    
    private void clear_user_values()
            // Clears the values of the user input fields.
        {
            value_field.setText("");
            block_field.setText("");
            cell_field.setText("");
            message_label.setText("");
        }
    
    private void display_board_values()
            // Sets the text for all of the labels that represent the board.
        {
            b1_c1.setText("" + game.board.four_dimensional_playable[0][0][0][0]); 
            b1_c2.setText("" + game.board.four_dimensional_playable[0][0][0][1]); 
            b1_c3.setText("" + game.board.four_dimensional_playable[0][0][0][2]); 
            b1_c4.setText("" + game.board.four_dimensional_playable[0][0][1][0]); 
            b1_c5.setText("" + game.board.four_dimensional_playable[0][0][1][1]); 
            b1_c6.setText("" + game.board.four_dimensional_playable[0][0][1][2]); 
            b1_c7.setText("" + game.board.four_dimensional_playable[0][0][2][0]); 
            b1_c8.setText("" + game.board.four_dimensional_playable[0][0][2][1]); 
            b1_c9.setText("" + game.board.four_dimensional_playable[0][0][2][2]); 

            b2_c1.setText("" + game.board.four_dimensional_playable[0][1][0][0]); 
            b2_c2.setText("" + game.board.four_dimensional_playable[0][1][0][1]); 
            b2_c3.setText("" + game.board.four_dimensional_playable[0][1][0][2]); 
            b2_c4.setText("" + game.board.four_dimensional_playable[0][1][1][0]); 
            b2_c5.setText("" + game.board.four_dimensional_playable[0][1][1][1]); 
            b2_c6.setText("" + game.board.four_dimensional_playable[0][1][1][2]); 
            b2_c7.setText("" + game.board.four_dimensional_playable[0][1][2][0]); 
            b2_c8.setText("" + game.board.four_dimensional_playable[0][1][2][1]); 
            b2_c9.setText("" + game.board.four_dimensional_playable[0][1][2][2]); 

            b3_c1.setText("" + game.board.four_dimensional_playable[0][2][0][0]); 
            b3_c2.setText("" + game.board.four_dimensional_playable[0][2][0][1]); 
            b3_c3.setText("" + game.board.four_dimensional_playable[0][2][0][2]); 
            b3_c4.setText("" + game.board.four_dimensional_playable[0][2][1][0]); 
            b3_c5.setText("" + game.board.four_dimensional_playable[0][2][1][1]); 
            b3_c6.setText("" + game.board.four_dimensional_playable[0][2][1][2]); 
            b3_c7.setText("" + game.board.four_dimensional_playable[0][2][2][0]); 
            b3_c8.setText("" + game.board.four_dimensional_playable[0][2][2][1]); 
            b3_c9.setText("" + game.board.four_dimensional_playable[0][2][2][2]); 

            b4_c1.setText("" + game.board.four_dimensional_playable[1][0][0][0]); 
            b4_c2.setText("" + game.board.four_dimensional_playable[1][0][0][1]); 
            b4_c3.setText("" + game.board.four_dimensional_playable[1][0][0][2]); 
            b4_c4.setText("" + game.board.four_dimensional_playable[1][0][1][0]); 
            b4_c5.setText("" + game.board.four_dimensional_playable[1][0][1][1]); 
            b4_c6.setText("" + game.board.four_dimensional_playable[1][0][1][2]); 
            b4_c7.setText("" + game.board.four_dimensional_playable[1][0][2][0]); 
            b4_c8.setText("" + game.board.four_dimensional_playable[1][0][2][1]); 
            b4_c9.setText("" + game.board.four_dimensional_playable[1][0][2][2]); 

            b5_c1.setText("" + game.board.four_dimensional_playable[1][1][0][0]); 
            b5_c2.setText("" + game.board.four_dimensional_playable[1][1][0][1]); 
            b5_c3.setText("" + game.board.four_dimensional_playable[1][1][0][2]); 
            b5_c4.setText("" + game.board.four_dimensional_playable[1][1][1][0]); 
            b5_c5.setText("" + game.board.four_dimensional_playable[1][1][1][1]); 
            b5_c6.setText("" + game.board.four_dimensional_playable[1][1][1][2]); 
            b5_c7.setText("" + game.board.four_dimensional_playable[1][1][2][0]); 
            b5_c8.setText("" + game.board.four_dimensional_playable[1][1][2][1]); 
            b5_c9.setText("" + game.board.four_dimensional_playable[1][1][2][2]); 

            b6_c1.setText("" + game.board.four_dimensional_playable[1][2][0][0]); 
            b6_c2.setText("" + game.board.four_dimensional_playable[1][2][0][1]); 
            b6_c3.setText("" + game.board.four_dimensional_playable[1][2][0][2]); 
            b6_c4.setText("" + game.board.four_dimensional_playable[1][2][1][0]); 
            b6_c5.setText("" + game.board.four_dimensional_playable[1][2][1][1]); 
            b6_c6.setText("" + game.board.four_dimensional_playable[1][2][1][2]); 
            b6_c7.setText("" + game.board.four_dimensional_playable[1][2][2][0]); 
            b6_c8.setText("" + game.board.four_dimensional_playable[1][2][2][1]); 
            b6_c9.setText("" + game.board.four_dimensional_playable[1][2][2][2]); 

            b7_c1.setText("" + game.board.four_dimensional_playable[2][0][0][0]); 
            b7_c2.setText("" + game.board.four_dimensional_playable[2][0][0][1]); 
            b7_c3.setText("" + game.board.four_dimensional_playable[2][0][0][2]); 
            b7_c4.setText("" + game.board.four_dimensional_playable[2][0][1][0]); 
            b7_c5.setText("" + game.board.four_dimensional_playable[2][0][1][1]); 
            b7_c6.setText("" + game.board.four_dimensional_playable[2][0][1][2]); 
            b7_c7.setText("" + game.board.four_dimensional_playable[2][0][2][0]); 
            b7_c8.setText("" + game.board.four_dimensional_playable[2][0][2][1]); 
            b7_c9.setText("" + game.board.four_dimensional_playable[2][0][2][2]); 

            b8_c1.setText("" + game.board.four_dimensional_playable[2][1][0][0]); 
            b8_c2.setText("" + game.board.four_dimensional_playable[2][1][0][1]); 
            b8_c3.setText("" + game.board.four_dimensional_playable[2][1][0][2]); 
            b8_c4.setText("" + game.board.four_dimensional_playable[2][1][1][0]); 
            b8_c5.setText("" + game.board.four_dimensional_playable[2][1][1][1]); 
            b8_c6.setText("" + game.board.four_dimensional_playable[2][1][1][2]); 
            b8_c7.setText("" + game.board.four_dimensional_playable[2][1][2][0]); 
            b8_c8.setText("" + game.board.four_dimensional_playable[2][1][2][1]); 
            b8_c9.setText("" + game.board.four_dimensional_playable[2][1][2][2]); 

            b9_c1.setText("" + game.board.four_dimensional_playable[2][2][0][0]); 
            b9_c2.setText("" + game.board.four_dimensional_playable[2][2][0][1]); 
            b9_c3.setText("" + game.board.four_dimensional_playable[2][2][0][2]); 
            b9_c4.setText("" + game.board.four_dimensional_playable[2][2][1][0]); 
            b9_c5.setText("" + game.board.four_dimensional_playable[2][2][1][1]); 
            b9_c6.setText("" + game.board.four_dimensional_playable[2][2][1][2]); 
            b9_c7.setText("" + game.board.four_dimensional_playable[2][2][2][0]); 
            b9_c8.setText("" + game.board.four_dimensional_playable[2][2][2][1]); 
            b9_c9.setText("" + game.board.four_dimensional_playable[2][2][2][2]);       
        }
    

/**************************
        INSTANCE VARIABLES:
***************************/    
    private Game game;    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label b1_c1;
    private java.awt.Label b1_c2;
    private java.awt.Label b1_c3;
    private java.awt.Label b1_c4;
    private java.awt.Label b1_c5;
    private java.awt.Label b1_c6;
    private java.awt.Label b1_c7;
    private java.awt.Label b1_c8;
    private java.awt.Label b1_c9;
    private java.awt.Label b2_c1;
    private java.awt.Label b2_c2;
    private java.awt.Label b2_c3;
    private java.awt.Label b2_c4;
    private java.awt.Label b2_c5;
    private java.awt.Label b2_c6;
    private java.awt.Label b2_c7;
    private java.awt.Label b2_c8;
    private java.awt.Label b2_c9;
    private java.awt.Label b3_c1;
    private java.awt.Label b3_c2;
    private java.awt.Label b3_c3;
    private java.awt.Label b3_c4;
    private java.awt.Label b3_c5;
    private java.awt.Label b3_c6;
    private java.awt.Label b3_c7;
    private java.awt.Label b3_c8;
    private java.awt.Label b3_c9;
    private java.awt.Label b4_c1;
    private java.awt.Label b4_c2;
    private java.awt.Label b4_c3;
    private java.awt.Label b4_c4;
    private java.awt.Label b4_c5;
    private java.awt.Label b4_c6;
    private java.awt.Label b4_c7;
    private java.awt.Label b4_c8;
    private java.awt.Label b4_c9;
    private java.awt.Label b5_c1;
    private java.awt.Label b5_c2;
    private java.awt.Label b5_c3;
    private java.awt.Label b5_c4;
    private java.awt.Label b5_c5;
    private java.awt.Label b5_c6;
    private java.awt.Label b5_c7;
    private java.awt.Label b5_c8;
    private java.awt.Label b5_c9;
    private java.awt.Label b6_c1;
    private java.awt.Label b6_c2;
    private java.awt.Label b6_c3;
    private java.awt.Label b6_c4;
    private java.awt.Label b6_c5;
    private java.awt.Label b6_c6;
    private java.awt.Label b6_c7;
    private java.awt.Label b6_c8;
    private java.awt.Label b6_c9;
    private java.awt.Label b7_c1;
    private java.awt.Label b7_c2;
    private java.awt.Label b7_c3;
    private java.awt.Label b7_c4;
    private java.awt.Label b7_c5;
    private java.awt.Label b7_c6;
    private java.awt.Label b7_c7;
    private java.awt.Label b7_c8;
    private java.awt.Label b7_c9;
    private java.awt.Label b8_c1;
    private java.awt.Label b8_c2;
    private java.awt.Label b8_c3;
    private java.awt.Label b8_c4;
    private java.awt.Label b8_c5;
    private java.awt.Label b8_c6;
    private java.awt.Label b8_c7;
    private java.awt.Label b8_c8;
    private java.awt.Label b8_c9;
    private java.awt.Label b9_c1;
    private java.awt.Label b9_c2;
    private java.awt.Label b9_c3;
    private java.awt.Label b9_c4;
    private java.awt.Label b9_c5;
    private java.awt.Label b9_c6;
    private java.awt.Label b9_c7;
    private java.awt.Label b9_c8;
    private java.awt.Label b9_c9;
    private java.awt.Button block_button_1;
    private java.awt.Button block_button_2;
    private java.awt.Button block_button_3;
    private java.awt.Button block_button_4;
    private java.awt.Button block_button_5;
    private java.awt.Button block_button_6;
    private java.awt.Button block_button_7;
    private java.awt.Button block_button_8;
    private java.awt.Button block_button_9;
    private java.awt.TextField block_field;
    private java.awt.Label block_label;
    private javax.swing.JMenuItem board_help_menu_item;
    private java.awt.Button cell_button_1;
    private java.awt.Button cell_button_2;
    private java.awt.Button cell_button_3;
    private java.awt.Button cell_button_4;
    private java.awt.Button cell_button_5;
    private java.awt.Button cell_button_6;
    private java.awt.Button cell_button_7;
    private java.awt.Button cell_button_8;
    private java.awt.Button cell_button_9;
    private java.awt.TextField cell_field;
    private java.awt.Label cell_label;
    private javax.swing.JMenuItem difficulty_help_menu_item;
    private javax.swing.JMenu file_option;
    private javax.swing.JMenuBar game_menu_bar;
    private javax.swing.JDialog help_dialog;
    private javax.swing.JLabel help_dialog_label;
    private javax.swing.JTextArea help_dialog_text_area;
    private javax.swing.JScrollPane help_dialog_text_pane;
    private javax.swing.JMenu help_option;
    private javax.swing.JMenuItem load_game_menu_item;
    private javax.swing.JLabel message_label;
    private javax.swing.JMenuItem new_game_menu_item;
    private javax.swing.JMenuItem rules_help_menu_item;
    private javax.swing.JMenuItem save_game_menu_item;
    private javax.swing.JMenuItem scoring_help_menu_item;
    private javax.swing.JButton set_value_button;
    private javax.swing.JButton set_value_button1;
    private java.awt.Button value_button_1;
    private java.awt.Button value_button_2;
    private java.awt.Button value_button_3;
    private java.awt.Button value_button_4;
    private java.awt.Button value_button_5;
    private java.awt.Button value_button_6;
    private java.awt.Button value_button_7;
    private java.awt.Button value_button_8;
    private java.awt.Button value_button_9;
    private java.awt.TextField value_field;
    private java.awt.Label value_label;
    // End of variables declaration//GEN-END:variables

    
/**************************
        SETTINGS:
***************************/
    public void set_game (Game a_game)
        {
            this.game = a_game;
        }    
}
