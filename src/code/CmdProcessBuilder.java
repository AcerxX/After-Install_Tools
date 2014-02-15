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

import java.io.*;
import java.util.*;

public class CmdProcessBuilder {
    private final ArrayList<String> appsPath;
    private final ArrayList<String> appsName;
    
    public CmdProcessBuilder(){
        this.appsPath = new ArrayList<>();
        this.appsName = new ArrayList<>();
    }
    
    public void add(String app, String name){
        this.appsPath.add(app);
        this.appsName.add(name);
    }
    
    public void openApps() throws InterruptedException,IOException{
        for(int i=0;i<this.appsPath.size();i++){
            ArrayList<String> command = new ArrayList<>();
            command.add(this.appsPath.get(i));


            ProcessBuilder builder = new ProcessBuilder(command);
            Map<String, String> environ = builder.environment();

            Process process = builder.start();
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println((String)this.appsName.get(i)+" program terminated!");
        }
    }
    
    /*public static void main(String args[]) throws InterruptedException, IOException{
        CmdProcessBuilder s = new CmdProcessBuilder();
        s.add("C:\\SkypeSetup.exe","Skype");
        s.add("C:\\uTorrent.exe", "uTorrent");
        s.openApps();
    }*/
}