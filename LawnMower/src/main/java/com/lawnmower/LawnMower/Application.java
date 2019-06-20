package com.lawnmower.LawnMower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

import com.lawnmower.LawnMower.models.Lawn;

/**
 * 
 * @author GHRAB Saif
 *
 *         18 juin 2019
 */
public class Application {
	private static final Logger LOGGER = Logger.getLogger(Application.class.getName());
	private static final String FILE_PATH = "/instructions.txt";
	static Lawn lawn = new Lawn();

	public static void main(String[] args) throws IOException {

	}
}
