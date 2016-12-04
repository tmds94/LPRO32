
package GUI;

/**
 * This class contains the window that shows informations on How To Play the BattleShip Fame
 */
public class HowToPlay extends javax.swing.JFrame {

    /**
     * Creates new form HowToPlay
     */
    public HowToPlay() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Batalha naval é um jogo de tabuleiro de dois jogadores, no qual os jogadores \ntêm de adivinhar em que quadrados estão os navios do oponente. \nEmbora o primeiro jogo em tabuleiro comercializado e publicado pela \nMilton Bradley Company em 1931, o jogo foi originalmente jogado com \nlápis e papel. Seu objectivo é derrubar os barcos do oponente adversário,\nganha quem derrubar todos os navios adversários primeiro.\nO jogo original é jogado em duas grelhas para cada jogador — uma que \nrepresenta a disposição dos barcos do jogador, e outra que representa \na do oponente. As grelhas são tipicamente quadradas, estando identificadas \nna horizontal por números e na vertical por letras. Em cada grelha o jogador \ncoloca os seus navios e regista os tiros do oponente.\nAntes do início do jogo, cada jogador coloca os seus navios nos quadros,\nalinhados horizontalmente ou verticalmente. O número de navios permitidos \né igual para ambos jogadores e os navios não podem se sobrepor.\nApós os navios terem sido posicionados o jogo continua numa série de turnos, \nem cada turno um jogador diz um quadrado na grelha do oponente, se houver \num navio nesse quadrado, é colocada uma marca vermelha, senão houver é \ncolocada uma marca branca.\nOs tipos de navios são: porta-aviões (5 quadrados adjacentes em filinha pirilau), \nbarcos de dois, três e quatro canos. Numa das variações deste jogo, \nas grelhas são de dimensão 10x10, e o \nnúmero de navios são: 1, 4, 3, 2, 1, respectivamente.\n");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextArea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
