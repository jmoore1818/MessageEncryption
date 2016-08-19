package com.messageEncryption;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DataWriter {

	public static void write(String stuff) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(
					new File("\\Users\\admin\\newWorkspace\\Thursday\\src\\com\\messageEncryption\\output.txt")));

			writer.write(stuff);
			writer.flush();
			writer.close();
			System.out.println("Done!");
			System.out.println("Your converted text is: " + stuff);

		} catch (IOException e) {
			e.printStackTrace();
			
			
		}
	}
}


		



