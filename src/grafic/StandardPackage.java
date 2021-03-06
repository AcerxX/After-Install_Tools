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
public class StandardPackage extends javax.swing.JFrame {

    /**
     * Creates new form StandardPackage
     */
    public StandardPackage() {
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

        jLabel1 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("After-Install Tools");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Applications to be installed:");

        jCheckBox8.setSelected(true);
        jCheckBox8.setText("Done");
        jCheckBox8.setEnabled(false);

        jCheckBox7.setSelected(true);
        jCheckBox7.setText("Done");
        jCheckBox7.setEnabled(false);

        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Done");
        jCheckBox4.setEnabled(false);

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Done");
        jCheckBox3.setEnabled(false);

        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Done");
        jCheckBox6.setEnabled(false);

        jLabel2.setText("Skype");

        jCheckBox5.setSelected(true);
        jCheckBox5.setText("Done");
        jCheckBox5.setEnabled(false);

        jLabel11.setText("uTorrent");

        jLabel5.setText("VLC Media Player");

        jLabel6.setText("Java 7");

        jLabel7.setText("Office 2013");

        jLabel8.setText("Adobe Reader");

        jLabel4.setText("WinRAR");

        jLabel3.setText("Google Chrome");

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Done");
        jCheckBox2.setEnabled(false);

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Done");
        jCheckBox1.setEnabled(false);

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

        jMenu3.setText("Help");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem2.setText("What should I do now?");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox6)
                                            .addComponent(jCheckBox5)
                                            .addComponent(jCheckBox1)
                                            .addComponent(jCheckBox4)
                                            .addComponent(jCheckBox7)))
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(52, 52, 52)
                                        .addComponent(jCheckBox3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(62, 62, 62)
                                        .addComponent(jCheckBox2)))))
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jCheckBox8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCheckBox2))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jCheckBox3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jCheckBox4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBox5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jCheckBox6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jCheckBox7))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.out.println("::TRIGGER:: What should I do now");
        Help.main(new String[0]);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.out.println("::TRIGGER:: Exit Standard Package");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
                processList.openApps(true,4,"standard");
            } catch (InterruptedException | IOException ex) {
                Logger.getLogger(GamerPackage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        jButton3.setEnabled(true);
        jButton3.update(jButton3.getGraphics());
    }//GEN-LAST:event_jButton3ActionPerformed
    
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
            case 3: jCheckBox3.setEnabled(true);
                jCheckBox3.update(jCheckBox3.getGraphics());
                break;
            case 4: jCheckBox4.setEnabled(true);
                jCheckBox4.update(jCheckBox4.getGraphics());
                break;
            case 5: jCheckBox1.setEnabled(true);
                jCheckBox1.update(jCheckBox1.getGraphics());
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
            java.util.logging.Logger.getLogger(StandardPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StandardPackage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private static javax.swing.JCheckBox jCheckBox1;
    private static javax.swing.JCheckBox jCheckBox2;
    private static javax.swing.JCheckBox jCheckBox3;
    private static javax.swing.JCheckBox jCheckBox4;
    private static javax.swing.JCheckBox jCheckBox5;
    private static javax.swing.JCheckBox jCheckBox6;
    private static javax.swing.JCheckBox jCheckBox7;
    private static javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private static javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
