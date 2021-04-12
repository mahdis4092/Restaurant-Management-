import java.lang.*;
import java.io.*;
package SELLINFORMATION;
class FileReadWrite
{
	//private File file;			//to create a File
	private FileWriter writer;		//to write in a file
	private FileReader reader;		//to read from a file
	private BufferedReader bfr;		//to read file content
	
	
	public void writeInFile(String s, String fname)
	{
		try
		{
			File file = new File(fname);	
			file.createNewFile();					
			writer = new FileWriter(file,true);	
			writer.write(s+"\r"+"\n");				
			writer.flush();							
			writer.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile(String fname) 
	{
		
		try
		{
			File file = new File(fname);
			reader = new FileReader(file);			
			bfr = new BufferedReader(reader);		
			String fullText="", singleLine;					
			
			while((singleLine=bfr.readLine())!=null)		
			{
				// String sp[] = singleLine.split(" ");
				// System.out.println(sp[0]);
				// System.out.println(Double.parseDouble(sp[1])+(Double.parseDouble(sp[1])*0.15)+" With 15% VAT");
				// System.out.println(sp[2]);
				
				fullText=fullText+singleLine+"\n\r";			
			}
			
			System.out.println(fullText);				
			reader.close();				
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
}
