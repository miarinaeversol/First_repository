/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatting.application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Miarina
 */
public class WriteToText {
    public static void main(String[] args) throws IOException{
        File file = new File("src/Essaie/test.txt");
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println("");
        pw.println("");
        pw.println("");
        
        pw.close();
    }
}
