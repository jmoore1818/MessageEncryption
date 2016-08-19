package com.messageEncryption;

import java.io.File;
import java.util.ArrayList;

public class Bitshifter {

	private static final int[] chain = { 2, 4, 5, 6, 7, 8, 9
	};

	public static String encrypt(String key) {
		String result = "";
		int l = key.length();
		char ch;
		int ck = 0;
		for (int i = 0; i < l; i++) {
			if (ck >= chain.length - 1)
				ck = 0;
			ch = key.charAt(i);
			ch += chain[ck];
			result += ch;
			ck++;

		}

		return result;
	}

	public static String decrypt(String key) {
		String result = "";
		int l = key.length();
		char ch;
		int ck = 0;
		for (int i = 0; i < l; i++) {
			if (ck >= chain.length - 1)
				ck = 0;
			ch = key.charAt(i);
			ch -= chain[ck];
			result += ch;
			ck++;
		}

		return result;
	}

	public static ArrayList<String> ourReader(ArrayList<String> fromOurTextFile, File aNewFile) {
		// TODO Auto-generated method stub
		return null;
	}
}