package com.nilavo.DevosTest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class DevosTest1Application {

	public static void main(String[] args) throws IOException {

		String inputfile ="D:\\Nilavo\\Mumbai Diary\\input.txt";
		String outputfile="D:\\Nilavo\\Mumbai Diary\\output.csv";

	    try(BufferedReader reader = new BufferedReader(new FileReader(inputfile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputfile)))
		{
			String line;
			while((line=reader.readLine())!=null)
			{
				writer.write(line);
				writer.newLine();

			}
			System.out.println("File copied successfully");
			System.out.println("File copied successfully");


		}catch (Exception e)
		{
			e.printStackTrace();
		}






	}

}
