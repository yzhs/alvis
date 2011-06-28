package de.unisiegen.informatik.bs.alvis.tools;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import de.unisiegen.informatik.bs.alvis.Activator;

public class IO {
	
	public static String pathToAlvisWorkspace() {
		return Platform.getInstanceLocation().getURL().getPath();
	}
	
	/**
	 * Write a text into a file
	 * @param fileName The file
	 * @param text The text
	 * @throws IOException I/O error
	 */
	public static void write(String fileName, String text) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		fos.write(text.getBytes());
		fos.close();
	}
	
	/**
	 * Append text to existing file
	 * @param fileName The file
	 * @param text The text
	 * @throws IOException I/O error
	 */
	public static void append(String fileName, String text) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName, true);
		fos.write(text.getBytes());
		fos.close();
	}

	/**
	 * Read data from file
	 * @param fileName The file
	 * @return file's data as byte[]
	 * @throws IOException I/O error
	 */
	public static byte[] read(String fileName) throws IOException {
		File f = new File(fileName);
		FileInputStream fis = new FileInputStream(f);
		long fileSize = f.length();
		byte[] res = new byte[(int)fileSize];
		int offset = 0;
		int numRead = 0;
		while (offset < res.length && (numRead = fis.read(res, offset, res.length-offset)) >= 0) {
			offset += numRead;
		}
		if (offset < res.length) {
			throw new IOException();
		}
		fis.close();
		return res;
	 }
	
	/**
	 * This converts a byte[] to a String
	 * @param toConvert the byte[] to convert
	 * @return a String
	 */
	public static String byteToString(byte[] toConvert) {
		String erg = "";
		for(byte b : toConvert) {
			char tmp = (char) b;
			erg += tmp;
		}
		return erg;
	}
	
	/**
	 * This loads an image from the workspace and creates an ImageData
	 * without the absolute path to the project in the workspace.
	 * Warning, this works only in the main plugin.
	 * @param filename e.g. "icons/alg_about.gif"
	 * @return ImageData from image
	 * @throws IOException if file not found
	 */
	public static ImageData loadImageFromWorkspace(String filename) throws IOException {
		InputStream f = FileLocator.find(Activator.getDefault().getBundle(), 
				new Path(filename), null).openStream();
		ImageData imageData = new ImageData(f);
		return imageData;
	}
	
	/**
	 * This loads an image from the workspace and creates an ImageData
	 * with the absolute path to the plug-in in the workspace.
	 * @param filename the filename
	 * @param path the path
	 * @return ImageData from image
	 * @throws IOException
	 */
	public static ImageData loadImageFromWorkspace(String path, String filename) throws IOException {
		return new ImageData(path + System.getProperty("file.separator") + filename);
	}
	
	/**
	 * Loads an image
	 * @param filename relative to the workspace
	 * @return
	 */
	public static Image loadImage(String filename) {
		   ClassLoader classLoader = IO.class.getClassLoader();
		    InputStream is = classLoader.getResourceAsStream(filename);
		    if (is == null) {
		        // the old way didn't have leading slash, so if we can't find the image stream,
		    // let's see if the old way works.
		    is = classLoader.getResourceAsStream(filename.substring(1));
		
		    if (is == null) {
		        is = classLoader.getResourceAsStream(filename);
		        if (is == null) {
		            is = classLoader.getResourceAsStream(filename.substring(1));
		            if (is == null) { return null; }
		        }
		    }
		}
		
		Image img = new Image(Display.getDefault(), is);
		try {
		    is.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		return img;		
	}
	
	public static Object deserialize(String filename) {
		long filesize = new File(filename).length();
		Object seri = null;
		if(filesize > 7) {// TODO this is not so cool check it (SIMON)
		
			BufferedInputStream fis = null;
			XStream xstream = new XStream(new DomDriver());
		
			try {
				fis = new BufferedInputStream(new FileInputStream(filename));
							
				seri = xstream.fromXML(new BufferedInputStream(
							new FileInputStream(filename)));
				fis.close();
								
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		return seri;
	}
}
