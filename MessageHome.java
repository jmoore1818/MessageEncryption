package com.messageEncryption;

import java.util.Scanner;

public class MessageHome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter a phrase to encrypt and write:");
		String phrase = scan.nextLine();

		DataWriter.write(Bitshifter.encrypt(phrase));

	}

}
