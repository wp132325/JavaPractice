package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "https://www.google.co.kr/images/nav_logo231.png";
				
				try{
					URL url = new URL(imageUrl);
					InputStream is = url.openStream();
						OutputStream os = new FileOutputStream("files/logo.png");
					
						int result;
						
						while((result = is.read()) != -1) {  
							os.write(result); 
						} 

				}catch (Exception e) {
					e.printStackTrace();
				}

	}
}
