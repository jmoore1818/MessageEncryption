package com.messageEncryption;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


import java.io.BufferedReader;
import java.io.BufferedWriter;

public class MessageHome {

	public static void main(String[] args) {
		boolean contApp = true;
		String phrase = null;
		String phrase2 = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("***Welcome to Justin's Encryption Application***");
		System.out.println();
		do {
		System.out.println();
		System.out.println("Type 1 to encrypt or type 2 to decrypt");
		String menuInput = scan.nextLine();
		
		ArrayList<String> fromOurTextFile = new ArrayList<>();
		
		Path ourNewestPath = Paths.get("\\Users\\admin\\newWorkspace\\Thursday\\src\\com\\messageEncryption\\output.txt");
		File aNewFile = ourNewestPath.toFile();
		
		
			switch (menuInput) {
			case "1":

				fromOurTextFile = Bitshifter.ourReader(fromOurTextFile, aNewFile);

				System.out.println("Enter text to be encrypted");
				phrase = scan.nextLine();
				DataWriter.write(Bitshifter.encrypt(phrase));
				break;

			case "2":
				System.out.println("Enter text to be decrypted");
				phrase2 = scan.nextLine();
				DataWriter.write(Bitshifter.decrypt(phrase2));
				break;

			}
		} while (contApp);
		
		
		

		
		
	
	}

}