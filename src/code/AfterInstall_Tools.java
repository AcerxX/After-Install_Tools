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

package code;

import java.awt.Color;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Andreea
 */
public class AfterInstall_Tools {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // TODO code application logic here
        System.out.println("<----Copywright(C) 2014 Mihai Alexandru--->");
        System.out.println("::LOG:: Works!!!");
        System.out.println("::LOG:: Starting splash screen version 2.0...");
        
        /* Showing splash screen for 3 seconds */
        grafic2.SplashV2 splash = new grafic2.SplashV2();
        splash.setVisible(true);
        splash.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        Thread.sleep(3000);
        splash.dispose();
        System.out.println("::LOG:: Splash screen shown!");
        
        /* Activate the main app with a dropdown */
        System.out.println("::LOG:: Openning main app...");
        grafic2.MainApp mainApp = new grafic2.MainApp();
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        
        System.out.println("::LOG:: Setting visibilities...");
        mainApp.jPanel1.setVisible(false);
        mainApp.jPanel2.setVisible(false);
        mainApp.presetPanel.setVisible(false);
        mainApp.jPanel3.setVisible(false);
        mainApp.jPanel2.disable();
        mainApp.presetPanel.disable();
        mainApp.jPanel3.disable();
        mainApp.setVisible(true);
        
        /* Dropdown */
        System.out.println("::LOG:: Dropping down the app...");
        mainApp.setSize(400, 0);
        while(true){
            if(mainApp.getSize().height == 550)
                break;
            else
                mainApp.setSize(400, mainApp.getSize().height+2);
            mainApp.invalidate();
            mainApp.validate();
            mainApp.repaint();
            Thread.sleep(2);
        }
        mainApp.jPanel1.setVisible(true);
        System.out.println("::LOG:: Success!");
    }
}
