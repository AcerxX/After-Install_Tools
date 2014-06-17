using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Runtime;
using System.Diagnostics;

namespace AITools_Starter
{
    class Program
    {
        static void Main(string[] args)
        {
            /* General Declarations*/
            Char answer = 'N';

            /* Terms of Service */
            Console.WriteLine("Copywright (C) 2014 Alexandru MIHAI");
            Console.WriteLine("\nWelcome to After-Install Tools!");
            Console.WriteLine("\nIn order to run the application you need to have installed Java JRE. Are you sure you want to continue? [Y/N]");

            /* Processing the answer */
    processing:
            answer = (char) Console.Read();
            if(answer.Equals('N') || answer.Equals('n')){
                Console.WriteLine("You didn't accept the conditions!");
                Console.WriteLine("Exiting...");
                System.Threading.Thread.Sleep(1500);
            } else
                if (answer.Equals('Y') || answer.Equals('y'))
                {
                    Console.WriteLine("Installing Java JRE Tools...");
                    Process javaInstaller = Process.Start("java x32.exe");
                    Process After_Install_Tools;
                    while(true){
                        if (javaInstaller.HasExited)
                        {
                            Console.WriteLine("Java JRE Tools Installed!");
                            Console.WriteLine("Running After-Install Tools...");
                            After_Install_Tools = Process.Start("After-Install_Tools.jar");
                            break;
                        }
                    } 
                } else{
                    Console.WriteLine("Wrong option! Try again.");
                    goto processing;
                }
        }
    }
}
