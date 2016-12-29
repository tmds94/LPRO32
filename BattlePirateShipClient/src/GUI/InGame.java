
package GUI;

import java.awt.Color;

/**
 * This class contains the Ingame Window, that shows player's information and both player's boards. It allows the player to play the game.
 */
public class InGame extends javax.swing.JFrame {

    
    private final int gameid;
    
    public InGame(int gameid) {
     /**
     * Creates new form InGame
     * @param gameid receives the gameid that was given when creating or joining a game
     */
        initComponents();
        this.gameid = gameid;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton122 = new javax.swing.JButton();
        jButton123 = new javax.swing.JButton();
        jButton124 = new javax.swing.JButton();
        jButton125 = new javax.swing.JButton();
        jButton126 = new javax.swing.JButton();
        jButton127 = new javax.swing.JButton();
        jButton128 = new javax.swing.JButton();
        jButton129 = new javax.swing.JButton();
        jButton130 = new javax.swing.JButton();
        jButton131 = new javax.swing.JButton();
        jButton140 = new javax.swing.JButton();
        jButton141 = new javax.swing.JButton();
        jButton142 = new javax.swing.JButton();
        jButton143 = new javax.swing.JButton();
        jButton144 = new javax.swing.JButton();
        jButton145 = new javax.swing.JButton();
        jButton146 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton220 = new javax.swing.JButton();
        jButton224 = new javax.swing.JButton();
        jButton225 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jButton267 = new javax.swing.JButton();
        jButton264 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jButton268 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jButton106 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton120 = new javax.swing.JButton();
        jButton121 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        jButton133 = new javax.swing.JButton();
        jButton134 = new javax.swing.JButton();
        jButton135 = new javax.swing.JButton();
        jButton136 = new javax.swing.JButton();
        jButton147 = new javax.swing.JButton();
        jButton148 = new javax.swing.JButton();
        jButton149 = new javax.swing.JButton();
        jButton150 = new javax.swing.JButton();
        jButton151 = new javax.swing.JButton();
        jButton152 = new javax.swing.JButton();
        jButton153 = new javax.swing.JButton();
        jButton154 = new javax.swing.JButton();
        jButton155 = new javax.swing.JButton();
        jButton156 = new javax.swing.JButton();
        jButton157 = new javax.swing.JButton();
        jButton158 = new javax.swing.JButton();
        jButton159 = new javax.swing.JButton();
        jButton160 = new javax.swing.JButton();
        jButton161 = new javax.swing.JButton();
        jButton162 = new javax.swing.JButton();
        jButton163 = new javax.swing.JButton();
        jButton164 = new javax.swing.JButton();
        jButton165 = new javax.swing.JButton();
        jButton166 = new javax.swing.JButton();
        jButton167 = new javax.swing.JButton();
        jButton168 = new javax.swing.JButton();
        jButton169 = new javax.swing.JButton();
        jButton170 = new javax.swing.JButton();
        jButton171 = new javax.swing.JButton();
        jButton172 = new javax.swing.JButton();
        jButton173 = new javax.swing.JButton();
        jButton174 = new javax.swing.JButton();
        jButton175 = new javax.swing.JButton();
        jButton176 = new javax.swing.JButton();
        jButton177 = new javax.swing.JButton();
        jButton178 = new javax.swing.JButton();
        jButton179 = new javax.swing.JButton();
        jButton180 = new javax.swing.JButton();
        jButton181 = new javax.swing.JButton();
        jButton182 = new javax.swing.JButton();
        jButton183 = new javax.swing.JButton();
        jButton184 = new javax.swing.JButton();
        jButton185 = new javax.swing.JButton();
        jButton186 = new javax.swing.JButton();
        jButton187 = new javax.swing.JButton();
        jButton188 = new javax.swing.JButton();
        jButton189 = new javax.swing.JButton();
        jButton190 = new javax.swing.JButton();
        jButton191 = new javax.swing.JButton();
        jButton192 = new javax.swing.JButton();
        jButton193 = new javax.swing.JButton();
        jButton194 = new javax.swing.JButton();
        jButton195 = new javax.swing.JButton();
        jButton196 = new javax.swing.JButton();
        jButton197 = new javax.swing.JButton();
        jButton198 = new javax.swing.JButton();
        jButton199 = new javax.swing.JButton();
        jButton200 = new javax.swing.JButton();
        jButton201 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jButton139 = new javax.swing.JButton();
        jButton228 = new javax.swing.JButton();
        jButton226 = new javax.swing.JButton();
        jButton227 = new javax.swing.JButton();
        jButton229 = new javax.swing.JButton();
        jButton230 = new javax.swing.JButton();
        jButton231 = new javax.swing.JButton();
        jButton232 = new javax.swing.JButton();
        jButton233 = new javax.swing.JButton();
        jButton234 = new javax.swing.JButton();
        jButton235 = new javax.swing.JButton();
        jButton236 = new javax.swing.JButton();
        jButton238 = new javax.swing.JButton();
        jButton240 = new javax.swing.JButton();
        jButton246 = new javax.swing.JButton();
        jButton253 = new javax.swing.JButton();
        jButton254 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton222 = new javax.swing.JButton();
        jButton219 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton137 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jButton269 = new javax.swing.JButton();
        jButton270 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jButton271 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton255 = new javax.swing.JButton();
        jButton256 = new javax.swing.JButton();
        jButton257 = new javax.swing.JButton();
        jButton258 = new javax.swing.JButton();
        jButton259 = new javax.swing.JButton();
        jButton260 = new javax.swing.JButton();
        jButton261 = new javax.swing.JButton();
        jButton262 = new javax.swing.JButton();
        jButton263 = new javax.swing.JButton();
        jButton265 = new javax.swing.JButton();
        jButton266 = new javax.swing.JButton();
        jButton272 = new javax.swing.JButton();
        jButton273 = new javax.swing.JButton();
        jButton274 = new javax.swing.JButton();
        jButton275 = new javax.swing.JButton();
        jButton276 = new javax.swing.JButton();
        jButton277 = new javax.swing.JButton();
        jButton278 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton223 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setEnabled(false);
        jPanel2.setFocusable(false);
        jPanel2.setOpaque(false);
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setMnemonic('b');
        jButton2.setToolTipText("");
        jButton2.setActionCommand("boton1");
        jButton2.setName("boton1"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 24, 25, 25));
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 24, 25, 25));
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 24, 25, 25));
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 24, 25, 25));
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 24, 25, 25));
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 24, 25, 25));
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 24, 25, 25));
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 24, 25, 25));
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 24, 25, 25));
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 24, 25, 25));
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 49, 25, 25));
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 49, 25, 25));
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 49, 25, 25));
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 49, 25, 25));
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 49, 25, 25));
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 49, 25, 25));
        jPanel2.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 49, 25, 25));
        jPanel2.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 49, 25, 25));
        jPanel2.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 49, 25, 25));
        jPanel2.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 49, 25, 25));
        jPanel2.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 74, 25, 25));
        jPanel2.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 74, 25, 25));
        jPanel2.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 74, 25, 25));
        jPanel2.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 74, 25, 25));
        jPanel2.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 74, 25, 25));
        jPanel2.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 74, 25, 25));
        jPanel2.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 74, 25, 25));
        jPanel2.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 74, 25, 25));
        jPanel2.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 74, 25, 25));
        jPanel2.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 74, 25, 25));
        jPanel2.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 99, 25, 25));
        jPanel2.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 99, 25, 25));
        jPanel2.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 99, 25, 25));
        jPanel2.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 99, 25, 25));

        jButton51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 99, 25, 25));
        jPanel2.add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 99, 25, 25));
        jPanel2.add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 99, 25, 25));
        jPanel2.add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 99, 25, 25));
        jPanel2.add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 99, 25, 25));
        jPanel2.add(jButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 99, 25, 25));
        jPanel2.add(jButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 124, 25, 25));
        jPanel2.add(jButton63, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 124, 25, 25));
        jPanel2.add(jButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 124, 25, 25));
        jPanel2.add(jButton65, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 124, 25, 25));

        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 124, 25, 25));
        jPanel2.add(jButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 124, 25, 25));
        jPanel2.add(jButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 124, 25, 25));
        jPanel2.add(jButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 124, 25, 25));
        jPanel2.add(jButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 124, 25, 25));
        jPanel2.add(jButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 124, 25, 25));
        jPanel2.add(jButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 149, 25, 25));
        jPanel2.add(jButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 149, 25, 25));
        jPanel2.add(jButton79, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 149, 25, 25));
        jPanel2.add(jButton80, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 149, 25, 25));
        jPanel2.add(jButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 149, 25, 25));
        jPanel2.add(jButton82, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 149, 25, 25));
        jPanel2.add(jButton83, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 149, 25, 25));
        jPanel2.add(jButton84, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 149, 25, 25));
        jPanel2.add(jButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 149, 25, 25));
        jPanel2.add(jButton86, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 149, 25, 25));
        jPanel2.add(jButton92, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 174, 25, 25));
        jPanel2.add(jButton93, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 174, 25, 25));
        jPanel2.add(jButton94, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 174, 25, 25));
        jPanel2.add(jButton95, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 174, 25, 25));
        jPanel2.add(jButton96, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 174, 25, 25));
        jPanel2.add(jButton97, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 174, 25, 25));
        jPanel2.add(jButton98, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 174, 25, 25));
        jPanel2.add(jButton99, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 174, 25, 25));
        jPanel2.add(jButton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 174, 25, 25));
        jPanel2.add(jButton101, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 174, 25, 25));
        jPanel2.add(jButton107, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 199, 25, 25));
        jPanel2.add(jButton108, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 199, 25, 25));
        jPanel2.add(jButton109, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 199, 25, 25));
        jPanel2.add(jButton110, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 199, 25, 25));
        jPanel2.add(jButton111, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 199, 25, 25));
        jPanel2.add(jButton112, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 199, 25, 25));
        jPanel2.add(jButton113, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 199, 25, 25));
        jPanel2.add(jButton114, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 199, 25, 25));
        jPanel2.add(jButton115, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 199, 25, 25));
        jPanel2.add(jButton116, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 199, 25, 25));
        jPanel2.add(jButton122, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 224, 25, 25));
        jPanel2.add(jButton123, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 224, 25, 25));
        jPanel2.add(jButton124, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 224, 25, 25));
        jPanel2.add(jButton125, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 224, 25, 25));
        jPanel2.add(jButton126, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 224, 25, 25));
        jPanel2.add(jButton127, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 224, 25, 25));
        jPanel2.add(jButton128, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 224, 25, 25));
        jPanel2.add(jButton129, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 224, 25, 25));
        jPanel2.add(jButton130, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 224, 25, 25));
        jPanel2.add(jButton131, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 224, 25, 25));
        jPanel2.add(jButton140, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 249, 25, 25));
        jPanel2.add(jButton141, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 249, 25, 25));
        jPanel2.add(jButton142, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 249, 25, 25));
        jPanel2.add(jButton143, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 249, 25, 25));
        jPanel2.add(jButton144, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 249, 25, 25));
        jPanel2.add(jButton145, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 249, 25, 25));
        jPanel2.add(jButton146, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 249, 25, 25));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 7, 25, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 7, 25, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 7, 25, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 7, 25, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 7, 25, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 7, 25, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 7, 25, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 7, 25, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("9");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 7, 25, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 7, 25, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("A");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 24, 10, 25));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("B");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 49, 10, 25));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("C");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 74, 10, 25));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("D");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 99, -1, 25));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("E");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 124, 10, 25));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("F");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 149, 10, 25));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("G");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 174, 10, 25));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("H");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 199, -1, 25));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("I");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 224, 10, 25));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("J");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 249, 10, 25));
        jPanel2.add(jButton220, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 249, 25, 25));
        jPanel2.add(jButton224, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 249, 25, 25));
        jPanel2.add(jButton225, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 249, 25, 25));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "PIRATE2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Charlemagne Std", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Avatar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel43.setFont(new java.awt.Font("Charlemagne Std", 0, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 153, 0));
        jLabel43.setText("HIts");

        jButton267.setText("#ID201605017");
        jButton267.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton267.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton267ActionPerformed(evt);
            }
        });

        jButton264.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton264.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton264ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Charlemagne Std", 0, 11)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(153, 153, 0));
        jLabel46.setText("Login name");

        jButton268.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton268.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton268ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Charlemagne Std", 0, 11)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(153, 153, 0));
        jLabel47.setText("Rank");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton268, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton264, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jButton267, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton268, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButton264, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton267, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel5.setDoubleBuffered(false);
        jPanel5.setEnabled(false);
        jPanel5.setFocusable(false);
        jPanel5.setOpaque(false);
        jPanel5.setRequestFocusEnabled(false);

        jButton12.setMnemonic('b');
        jButton12.setToolTipText("");
        jButton12.setActionCommand("boton1");
        jButton12.setName("boton1"); // NOI18N

        jButton136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton136ActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("1");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("2");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("3");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("4");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("5");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("6");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("7");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("8");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("9");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("10");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("A");

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("B");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("C");

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("D");

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("E");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("F");

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("G");

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("H");

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("I");

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("J");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton133, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton134, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton135, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton147, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton148, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton149, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton150, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton151, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton152, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton153, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton154, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton155, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton156, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton157, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton158, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton159, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton160, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton161, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton162, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton163, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton164, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton165, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton166, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton167, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton168, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton169, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton170, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton171, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton192, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton193, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton194, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton195, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton196, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton197, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton198, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton199, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton200, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton201, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton182, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton183, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton184, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton185, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton186, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton187, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton188, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton189, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton190, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton191, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton172, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton173, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton174, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton175, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton176, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton177, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton178, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton179, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton180, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton181, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11))
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton121, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton133, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton134, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton135, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton147, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton148, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton149, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton150, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton151, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton152, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton153, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton154, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton155, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton156, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton157, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton158, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton159, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton160, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton161, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton162, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton163, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton164, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton165, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton166, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton167, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton168, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton169, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton170, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton171, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton172, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton173, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton174, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton175, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton176, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton177, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton178, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton179, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton180, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton181, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton182, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton183, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton184, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton185, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton186, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton187, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton188, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton189, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton190, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton191, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton192, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton193, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton194, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton195, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton196, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton197, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton198, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton199, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton200, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton201, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My boats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Charlemagne Std", 0, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton139ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton139, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 30, 30));

        jButton228.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton228.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton228ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton228, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jButton226.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton226.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton226ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton226, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 30, 30));

        jButton227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton227.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton227ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton227, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 30, 30));

        jButton229.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton229.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton229ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton229, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 30, 30));

        jButton230.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton230.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton230ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton230, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 30, 30));

        jButton231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton231ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton231, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 30, 30));

        jButton232.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton232.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton232ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton232, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 30, 30));

        jButton233.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton233.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton233ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton233, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 30, 30));

        jButton234.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton234.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton234ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton234, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, 30));

        jButton235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton235ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton235, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 30, 30));

        jButton236.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton236.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton236ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton236, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 30, 30));

        jButton238.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton238.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton238ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton238, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 30, 30));

        jButton240.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton240.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton240ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton240, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 30, 30));

        jButton246.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton246.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton246ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton246, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 30, 30));

        jButton253.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton253.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton253ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton253, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 30));

        jButton254.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jButton254.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton254ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton254, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 30, 30));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chat", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Charlemagne Std", 0, 10))); // NOI18N

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Play time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Charlemagne Std", 0, 10))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jButton222.setBackground(new java.awt.Color(102, 102, 102));
        jButton222.setFont(new java.awt.Font("Charlemagne Std", 0, 10)); // NOI18N
        jButton222.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/avatar-2.png"))); // NOI18N
        jButton222.setText("Add as friend ");
        jButton222.setToolTipText("");
        jButton222.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton219.setText("#GAME_ID");
        jButton219.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton219ActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "PIRATE1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Charlemagne Std", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton137.setForeground(new java.awt.Color(255, 255, 255));
        jButton137.setText("Avatar");
        jButton137.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel48.setFont(new java.awt.Font("Charlemagne Std", 0, 11)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(153, 153, 0));
        jLabel48.setText("Hits");

        jButton269.setText("#ID201605017");
        jButton269.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jButton269.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton269ActionPerformed(evt);
            }
        });

        jButton270.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton270.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton270ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Charlemagne Std", 0, 11)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(153, 153, 0));
        jLabel49.setText("Login name");

        jButton271.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton271.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton271ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Charlemagne Std", 0, 11)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(153, 153, 0));
        jLabel50.setText("Rank");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton269, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton270, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton271, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton271, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton270, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton269, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My boats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Charlemagne Std", 0, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton255.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton255, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 30, 30));

        jButton256.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton256, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jButton257.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton257, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 30, 30));

        jButton258.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton258, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 30, 30));

        jButton259.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton259, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 30, 30));

        jButton260.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton260, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 30, 30));

        jButton261.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton261, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 30, 30));

        jButton262.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton262, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 30, 30));

        jButton263.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton263, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 30, 30));

        jButton265.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton265, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, 30));

        jButton266.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton266, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 30, 30));

        jButton272.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton272, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 30, 30));

        jButton273.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton273, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 30, 30));

        jButton274.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton274, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 30, 30));

        jButton275.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton275, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 30, 30));

        jButton276.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton276, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 30));

        jButton277.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/old-galleon.png"))); // NOI18N
        jPanel10.add(jButton277, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 30, 30));

        jButton278.setBackground(new java.awt.Color(51, 51, 51));
        jButton278.setFont(new java.awt.Font("Charlemagne Std", 0, 12)); // NOI18N
        jButton278.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/gallows-2.png"))); // NOI18N
        jButton278.setText("Surrender");
        jButton278.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Who's Seeing", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Charlemagne Std", 0, 10))); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Login Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jButton223.setBackground(new java.awt.Color(51, 51, 51));
        jButton223.setFont(new java.awt.Font("Charlemagne Std", 0, 10)); // NOI18N
        jButton223.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder/replay-arrow.png"))); // NOI18N
        jButton223.setText("Replay ");
        jButton223.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton223, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton219, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton222)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(910, 910, 910)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(920, 920, 920)
                        .addComponent(jButton278, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton223, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton219, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton222, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton278, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton267ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton267ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton267ActionPerformed

    private void jButton264ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton264ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton264ActionPerformed

    private void jButton268ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton268ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton268ActionPerformed

    private void jButton136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton136ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton136ActionPerformed

    private void jButton139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton139ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton139ActionPerformed

    private void jButton228ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton228ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton228ActionPerformed

    private void jButton226ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton226ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton226ActionPerformed

    private void jButton227ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton227ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton227ActionPerformed

    private void jButton229ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton229ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton229ActionPerformed

    private void jButton230ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton230ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton230ActionPerformed

    private void jButton231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton231ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton231ActionPerformed

    private void jButton232ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton232ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton232ActionPerformed

    private void jButton233ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton233ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton233ActionPerformed

    private void jButton234ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton234ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton234ActionPerformed

    private void jButton235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton235ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton235ActionPerformed

    private void jButton236ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton236ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton236ActionPerformed

    private void jButton238ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton238ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton238ActionPerformed

    private void jButton240ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton240ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton240ActionPerformed

    private void jButton246ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton246ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton246ActionPerformed

    private void jButton253ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton253ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton253ActionPerformed

    private void jButton254ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton254ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton254ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton219ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton219ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton219ActionPerformed

    private void jButton269ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton269ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton269ActionPerformed

    private void jButton270ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton270ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton270ActionPerformed

    private void jButton271ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton271ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton271ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton2ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton100;
    public javax.swing.JButton jButton101;
    public javax.swing.JButton jButton102;
    public javax.swing.JButton jButton103;
    public javax.swing.JButton jButton104;
    public javax.swing.JButton jButton105;
    public javax.swing.JButton jButton106;
    public javax.swing.JButton jButton107;
    public javax.swing.JButton jButton108;
    public javax.swing.JButton jButton109;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton110;
    public javax.swing.JButton jButton111;
    public javax.swing.JButton jButton112;
    public javax.swing.JButton jButton113;
    public javax.swing.JButton jButton114;
    public javax.swing.JButton jButton115;
    public javax.swing.JButton jButton116;
    public javax.swing.JButton jButton117;
    public javax.swing.JButton jButton118;
    public javax.swing.JButton jButton119;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton120;
    public javax.swing.JButton jButton121;
    public javax.swing.JButton jButton122;
    public javax.swing.JButton jButton123;
    public javax.swing.JButton jButton124;
    public javax.swing.JButton jButton125;
    public javax.swing.JButton jButton126;
    public javax.swing.JButton jButton127;
    public javax.swing.JButton jButton128;
    public javax.swing.JButton jButton129;
    public javax.swing.JButton jButton13;
    public javax.swing.JButton jButton130;
    public javax.swing.JButton jButton131;
    public javax.swing.JButton jButton132;
    public javax.swing.JButton jButton133;
    public javax.swing.JButton jButton134;
    public javax.swing.JButton jButton135;
    public javax.swing.JButton jButton136;
    private javax.swing.JButton jButton137;
    public javax.swing.JButton jButton139;
    public javax.swing.JButton jButton14;
    public javax.swing.JButton jButton140;
    public javax.swing.JButton jButton141;
    public javax.swing.JButton jButton142;
    public javax.swing.JButton jButton143;
    public javax.swing.JButton jButton144;
    public javax.swing.JButton jButton145;
    public javax.swing.JButton jButton146;
    public javax.swing.JButton jButton147;
    public javax.swing.JButton jButton148;
    public javax.swing.JButton jButton149;
    public javax.swing.JButton jButton15;
    public javax.swing.JButton jButton150;
    public javax.swing.JButton jButton151;
    public javax.swing.JButton jButton152;
    public javax.swing.JButton jButton153;
    public javax.swing.JButton jButton154;
    public javax.swing.JButton jButton155;
    public javax.swing.JButton jButton156;
    public javax.swing.JButton jButton157;
    public javax.swing.JButton jButton158;
    public javax.swing.JButton jButton159;
    public javax.swing.JButton jButton16;
    public javax.swing.JButton jButton160;
    public javax.swing.JButton jButton161;
    public javax.swing.JButton jButton162;
    public javax.swing.JButton jButton163;
    public javax.swing.JButton jButton164;
    public javax.swing.JButton jButton165;
    public javax.swing.JButton jButton166;
    public javax.swing.JButton jButton167;
    public javax.swing.JButton jButton168;
    public javax.swing.JButton jButton169;
    public javax.swing.JButton jButton17;
    public javax.swing.JButton jButton170;
    public javax.swing.JButton jButton171;
    public javax.swing.JButton jButton172;
    public javax.swing.JButton jButton173;
    public javax.swing.JButton jButton174;
    public javax.swing.JButton jButton175;
    public javax.swing.JButton jButton176;
    public javax.swing.JButton jButton177;
    public javax.swing.JButton jButton178;
    public javax.swing.JButton jButton179;
    public javax.swing.JButton jButton18;
    public javax.swing.JButton jButton180;
    public javax.swing.JButton jButton181;
    public javax.swing.JButton jButton182;
    public javax.swing.JButton jButton183;
    public javax.swing.JButton jButton184;
    public javax.swing.JButton jButton185;
    public javax.swing.JButton jButton186;
    public javax.swing.JButton jButton187;
    public javax.swing.JButton jButton188;
    public javax.swing.JButton jButton189;
    public javax.swing.JButton jButton19;
    public javax.swing.JButton jButton190;
    public javax.swing.JButton jButton191;
    public javax.swing.JButton jButton192;
    public javax.swing.JButton jButton193;
    public javax.swing.JButton jButton194;
    public javax.swing.JButton jButton195;
    public javax.swing.JButton jButton196;
    public javax.swing.JButton jButton197;
    public javax.swing.JButton jButton198;
    public javax.swing.JButton jButton199;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton20;
    public javax.swing.JButton jButton200;
    public javax.swing.JButton jButton201;
    public javax.swing.JButton jButton21;
    private javax.swing.JButton jButton219;
    public javax.swing.JButton jButton22;
    public javax.swing.JButton jButton220;
    private javax.swing.JButton jButton222;
    private javax.swing.JButton jButton223;
    public javax.swing.JButton jButton224;
    public javax.swing.JButton jButton225;
    public javax.swing.JButton jButton226;
    public javax.swing.JButton jButton227;
    public javax.swing.JButton jButton228;
    public javax.swing.JButton jButton229;
    public javax.swing.JButton jButton23;
    public javax.swing.JButton jButton230;
    public javax.swing.JButton jButton231;
    public javax.swing.JButton jButton232;
    public javax.swing.JButton jButton233;
    public javax.swing.JButton jButton234;
    public javax.swing.JButton jButton235;
    public javax.swing.JButton jButton236;
    public javax.swing.JButton jButton238;
    public javax.swing.JButton jButton24;
    public javax.swing.JButton jButton240;
    public javax.swing.JButton jButton246;
    public javax.swing.JButton jButton25;
    public javax.swing.JButton jButton253;
    public javax.swing.JButton jButton254;
    public javax.swing.JButton jButton255;
    public javax.swing.JButton jButton256;
    public javax.swing.JButton jButton257;
    public javax.swing.JButton jButton258;
    public javax.swing.JButton jButton259;
    public javax.swing.JButton jButton26;
    public javax.swing.JButton jButton260;
    public javax.swing.JButton jButton261;
    public javax.swing.JButton jButton262;
    public javax.swing.JButton jButton263;
    private javax.swing.JButton jButton264;
    public javax.swing.JButton jButton265;
    public javax.swing.JButton jButton266;
    private javax.swing.JButton jButton267;
    private javax.swing.JButton jButton268;
    private javax.swing.JButton jButton269;
    public javax.swing.JButton jButton27;
    private javax.swing.JButton jButton270;
    private javax.swing.JButton jButton271;
    public javax.swing.JButton jButton272;
    public javax.swing.JButton jButton273;
    public javax.swing.JButton jButton274;
    public javax.swing.JButton jButton275;
    public javax.swing.JButton jButton276;
    public javax.swing.JButton jButton277;
    private javax.swing.JButton jButton278;
    public javax.swing.JButton jButton28;
    public javax.swing.JButton jButton29;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton30;
    public javax.swing.JButton jButton31;
    public javax.swing.JButton jButton32;
    public javax.swing.JButton jButton33;
    public javax.swing.JButton jButton34;
    public javax.swing.JButton jButton35;
    public javax.swing.JButton jButton36;
    public javax.swing.JButton jButton37;
    public javax.swing.JButton jButton38;
    public javax.swing.JButton jButton39;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton40;
    public javax.swing.JButton jButton41;
    public javax.swing.JButton jButton42;
    public javax.swing.JButton jButton43;
    public javax.swing.JButton jButton44;
    public javax.swing.JButton jButton45;
    public javax.swing.JButton jButton46;
    public javax.swing.JButton jButton47;
    public javax.swing.JButton jButton48;
    public javax.swing.JButton jButton49;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton50;
    public javax.swing.JButton jButton51;
    public javax.swing.JButton jButton52;
    public javax.swing.JButton jButton53;
    public javax.swing.JButton jButton54;
    public javax.swing.JButton jButton55;
    public javax.swing.JButton jButton56;
    public javax.swing.JButton jButton57;
    public javax.swing.JButton jButton58;
    public javax.swing.JButton jButton59;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton60;
    public javax.swing.JButton jButton61;
    public javax.swing.JButton jButton62;
    public javax.swing.JButton jButton63;
    public javax.swing.JButton jButton64;
    public javax.swing.JButton jButton65;
    public javax.swing.JButton jButton66;
    public javax.swing.JButton jButton67;
    public javax.swing.JButton jButton68;
    public javax.swing.JButton jButton69;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton70;
    public javax.swing.JButton jButton71;
    public javax.swing.JButton jButton72;
    public javax.swing.JButton jButton73;
    public javax.swing.JButton jButton74;
    public javax.swing.JButton jButton75;
    public javax.swing.JButton jButton76;
    public javax.swing.JButton jButton77;
    public javax.swing.JButton jButton78;
    public javax.swing.JButton jButton79;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton80;
    public javax.swing.JButton jButton81;
    public javax.swing.JButton jButton82;
    public javax.swing.JButton jButton83;
    public javax.swing.JButton jButton84;
    public javax.swing.JButton jButton85;
    public javax.swing.JButton jButton86;
    public javax.swing.JButton jButton87;
    public javax.swing.JButton jButton88;
    public javax.swing.JButton jButton89;
    public javax.swing.JButton jButton9;
    public javax.swing.JButton jButton90;
    public javax.swing.JButton jButton91;
    public javax.swing.JButton jButton92;
    public javax.swing.JButton jButton93;
    public javax.swing.JButton jButton94;
    public javax.swing.JButton jButton95;
    public javax.swing.JButton jButton96;
    public javax.swing.JButton jButton97;
    public javax.swing.JButton jButton98;
    public javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
