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

package code2;

/**
 *
 * @author Andreea
 */
public class AfterInstall_Tools_v2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("<----Copywright(C) 2014 Mihai Alexandru--->");
        System.out.println("::LOG:: Works!");
        System.out.println("::LOG:: Starting splash app...");
        grafic2.SplashV2 splash = new grafic2.SplashV2();
        splash.setVisible(true);
        Thread.sleep(2000);
        splash.dispose();
    }
}
