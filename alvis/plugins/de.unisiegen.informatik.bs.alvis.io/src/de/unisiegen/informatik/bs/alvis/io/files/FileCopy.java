package de.unisiegen.informatik.bs.alvis.io.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;

public class FileCopy {
	long chunckSizeInBytes;
	boolean verbose;

	public FileCopy() {
		this.chunckSizeInBytes = 1024 * 1024; // Standard: Buffer 1MB
		this.verbose = false; // Statistics about Copy Process
	}

	public FileCopy(boolean verbose) {
		this.chunckSizeInBytes = 1024 * 1024; // Standard: Buffer 1MB
		this.verbose = verbose; // Statistics about Copy Process
	}

	public FileCopy(long chunckSizeInBytes) {
		this.chunckSizeInBytes = chunckSizeInBytes; // Custom Buffer (Bytes)
		this.verbose = false; // Statistics about Copy Process
	}

	public FileCopy(long chunckSizeInBytes, boolean verbose) {
		this.chunckSizeInBytes = chunckSizeInBytes; // Custom Buffer (Bytes)
		this.verbose = verbose; // Statistics about Copy Process
	}

	public void copy(File source, File destination) {
		try {
			FileInputStream fileInputStream = new FileInputStream(source);
			FileOutputStream fileOutputStream = new FileOutputStream(
					destination);
			FileChannel inputChannel = fileInputStream.getChannel();
			FileChannel outputChannel = fileOutputStream.getChannel();
			transfer(inputChannel, outputChannel, source.length(), false);
			fileInputStream.close();
			fileOutputStream.close();
			destination.setLastModified(source.lastModified());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void transfer(FileChannel fileChannel, ByteChannel byteChannel,
			long lengthInBytes, boolean verbose) throws IOException {
		long overallBytesTransfered = 0L;
		long time = -System.currentTimeMillis();
		while (overallBytesTransfered < lengthInBytes) {
			long bytesTransfered = 0L;
			bytesTransfered = fileChannel.transferTo(
					overallBytesTransfered,
					Math.min(chunckSizeInBytes, lengthInBytes
							- overallBytesTransfered), byteChannel);
			overallBytesTransfered += bytesTransfered;
			if (verbose) {
				System.out.println("overall bytes transfered: "
						+ overallBytesTransfered
						+ " progress "
						+ (Math.round(overallBytesTransfered
								/ ((double) lengthInBytes) * 100.0)) + "%");
			}
		}
		time += System.currentTimeMillis();
		if (verbose) {
			System.out.println("Transfered: " + overallBytesTransfered
					+ " bytes in: " + (time / 1000) + " s -> "
					+ (overallBytesTransfered / 1024.0) / (time / 1000.0)
					+ " kbytes/s");
		}
	}
}