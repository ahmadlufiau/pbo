/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab10;

/**
 *
 * @author Ahmad Lufi A U
 */
import java.io.*;
class GetInputBufferedReader {
    public static void main(String[] args) {
	BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
	String word[] = new String[3];
	try {
            System.out.print("Enter word1 : ");
            word[0]=dataIn.readLine();
            System.out.print("Enter word2 : ");
            word[1]=dataIn.readLine();
            System.out.print("Enter word3 : ");
            word[2]=dataIn.readLine();
	} catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println(word[0]+" "+word[1]+" "+word[2]);
    }
}