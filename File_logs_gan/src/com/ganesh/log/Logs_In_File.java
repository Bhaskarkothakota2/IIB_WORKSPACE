package com.ganesh.log;



import java.io.IOException;
import java.io.PrintWriter;


public class Logs_In_File {

public static void req(String str_req,String str_res) {
	

	try {
		PrintWriter writer = new PrintWriter ("C:/Users/Sreenivas Bandaru/Music/jam/output.txt");
		//FileWriter writer = new FileWriter("output.txt");
        //writer.write("req:"+str_req+"\n");
        //writer.write("res:"+str_res+"\n");
        writer.append("res:"+str_res+"\n");
        writer.close();
        System.out.println("Data written to the file successfully.");
    } catch (IOException e) {
        System.out.println("An error occurred while writing to the file: " + e.getMessage());
}
}	
}





    /*public static void main(String[] args) throws IOException
   // {
        // Open the file.
        PrintWriter pr = new PrintWriter("oceans.txt"); // Step 2

        // Write the name of four oceans to the file
   
        pr.println(req("ban"));
        pr.println(req("sur2"));
     
         

        // Close the file.
        pr.close();  // Step 4
    }
*/
