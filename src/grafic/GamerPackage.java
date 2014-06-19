/**Copyright [2014] [MIHAI Alexandru]
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
**/

package grafic;

import code.CmdProcessBuilder;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexa_000
 */
public class GamerPackage extends javax.swing.JFrame {

    /**
     * Creates new form GamerPackage
     */
    public GamerPackage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("After-Install v1.1.2");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Applications to be installed:");

        jLabel2.setText("Skype");

        jLabel3.setText("Google Chrome");

        jLabel4.setText("WinRAR");

        jLabel5.setText("VLC Media Player");

        jLabel6.setText("Java 7");

        jLabel7.setText("Office 2013");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Automatic Install:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Click to Install:");

        jButton1.setText("Steam");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Adobe Reader");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setText("uTorrent");

        jButton2.setText("League of Legends");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Done");
        jCheckBox1.setToolTipText("");
        jCheckBox1.setEnabled(false);

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Done");
        jCheckBox2.setToolTipText("");
        jCheckBox2.setEnabled(false);

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Done");
        jCheckBox3.setToolTipText("");
        jCheckBox3.setEnabled(false);

        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Done");
        jCheckBox4.setToolTipText("");
        jCheckBox4.setEnabled(false);

        jCheckBox5.setSelected(true);
        jCheckBox5.setText("Done");
        jCheckBox5.setToolTipText("");
        jCheckBox5.setEnabled(false);

        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Done");
        jCheckBox6.setToolTipText("");
        jCheckBox6.setEnabled(false);

        jCheckBox7.setSelected(true);
        jCheckBox7.setText("Done");
        jCheckBox7.setToolTipText("");
        jCheckBox7.setEnabled(false);

        jCheckBox8.setSelected(true);
        jCheckBox8.setText("Done");
        jCheckBox8.setToolTipText("");
        jCheckBox8.setEnabled(false);

        jButton3.setText("START");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem2.setText("DAFUQ is happening?");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel9)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jCheckBox8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox3))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.out.println("::TRIGGER:: DAFUQ is happening?");
        Help.main(new String[0]);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.out.println("::TRIGGER:: Exit Gamer Package");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setEnabled(false);
        jButton3.update(jButton3.getGraphics());
        CmdProcessBuilder processList = new CmdProcessBuilder();
        
        if("x64".equals((String)System.getProperty("os.arch"))){
            processList.add("setupFiles\\ChromeSetup.exe", "Google Chrome");
            processList.add("setupFiles\\SkypeSetup.exe", "Skype");
            processList.add("setupFiles\\winrar-x64-501.exe", "WinRAR x64");
            processList.add("setupFiles\\vlc-2.1.3-win64.exe", "VLC Media Player x64");
            processList.add("setupFiles\\chromeinstall-7u55.exe", "Java for Chrome 7");
            processList.add("setupFiles\\Office_not_found.jar", "Office 2013 x64");
            processList.add("setupFiles\\install_reader11_en_mssd_aaa_aih.exe", "Adobe Reader 11");
            processList.add("setupFiles\\uTorrent.exe", "uTorrent");
        }
        else{
            processList.add("setupFiles\\ChromeSetup.exe", "Google Chrome");
            processList.add("setupFiles\\SkypeSetup.exe", "Skype");
            processList.add("setupFiles\\wrar501.exe", "WinRAR x86");
            processList.add("setupFiles\\vlc-2.1.3-win32.exe", "VLC Media Player x86");
            processList.add("setupFiles\\chromeinstall-7u55.exe", "Java for Chrome 7");
            processList.add("setupFiles\\Office_not_found.jar", "Office 2013 x86");
            processList.add("setupFiles\\install_reader11_en_mssd_aaa_aih.exe", "Adobe Reader 11");
            processList.add("setupFiles\\uTorrent.exe", "uTorrent");
            try {
                processList.openApps(true,4, "gamer");
            } catch (    InterruptedException | IOException ex) {
                Logger.getLogger(GamerPackage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        jButton3.setEnabled(true);
        jButton3.update(jButton3.getGraphics());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setEnabled(false);
        jButton2.update(jButton2.getGraphics());
        CmdProcessBuilder processList = new CmdProcessBuilder();
        processList.add("setupFiles\\LeagueofLegends_EUNE_Installer_04_21_14.exe", "League of Legends");
        try {
                processList.openApps(false,1, "gamer");
            } catch (    InterruptedException | IOException ex) {
                Logger.getLogger(GamerPackage.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void modProgressBar(int n){
        switch(n){
                    case 0: jProgressBar1.setValue(0);                        
                        break;
                    case 1: jProgressBar1.setValue(12);
                        jProgressBar1.update(jProgressBar1.getGraphics());
                        break;
                    case 2: jProgressBar1.setValue(25);
                        jProgressBar1.update(jProgressBar1.getGraphics());
                        break;
                    case 3: jProgressBar1.setValue(37);
                        jProgressBar1.update(jProgressBar1.getGraphics());
                        break;
                    case 4: jProgressBar1.setValue(50);
                        jProgressBar1.update(jProgressBar1.getGraphics());
                        break;
                    case 5: jProgressBar1.setValue(62);
                        jProgressBar1.update(jProgressBar1.getGraphics());
                        break;
                    case 6: jProgressBar1.setValue(75);
                        jProgressBar1.update(jProgressBar1.getGraphics());
                        break;
                    case 7: jProgressBar1.setValue(87);
                        jProgressBar1.update(jProgressBar1.getGraphics());
                        break;
                    case 8: jProgressBar1.setValue(100);
                        jProgressBar1.update(jProgressBar1.getGraphics());
                        break;
                }
    }
    
    public static void modCheckedBox(int n){
        switch(n){
            case 1: jCheckBox8.setEnabled(true);
                jCheckBox8.update(jCheckBox8.getGraphics());
                break;
            case 2: jCheckBox2.setEnabled(true);
                jCheckBox2.update(jCheckBox2.getGraphics());
                break;
            case 3: jCheckBox4.setEnabled(true);
                jCheckBox4.update(jCheckBox4.getGraphics());
                break;
            case 4: jCheckBox1.setEnabled(true);
                jCheckBox1.update(jCheckBox1.getGraphics());
                break;
            case 5: jCheckBox5.setEnabled(true);
                jCheckBox5.update(jCheckBox5.getGraphics());
                break;
            case 6: jCheckBox6.setEnabled(true);
                jCheckBox6.update(jCheckBox6.getGraphics());
                break;
            case 7: jCheckBox7.setEnabled(true);
                jCheckBox7.update(jCheckBox7.getGraphics());
                break;
            case 8: jCheckBox3.setEnabled(true);
                jCheckBox3.update(jCheckBox3.getGraphics());
                break;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamerPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GamerPackage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private static javax.swing.JCheckBox jCheckBox1;
    private static javax.swing.JCheckBox jCheckBox2;
    private static javax.swing.JCheckBox jCheckBox3;
    private static javax.swing.JCheckBox jCheckBox4;
    private static javax.swing.JCheckBox jCheckBox5;
    private static javax.swing.JCheckBox jCheckBox6;
    private static javax.swing.JCheckBox jCheckBox7;
    private static javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private static javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
