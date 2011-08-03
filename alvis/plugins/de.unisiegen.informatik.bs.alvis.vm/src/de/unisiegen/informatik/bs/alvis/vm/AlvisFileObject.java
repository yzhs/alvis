package de.unisiegen.informatik.bs.alvis.vm;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.tools.SimpleJavaFileObject;

class AlvisFileObject extends SimpleJavaFileObject {

	private final CharSequence sourceCode;

	public AlvisFileObject(String pathToFile, CharSequence source)
			throws URISyntaxException {
		super(new URI(pathToFile), Kind.SOURCE);
		this.sourceCode = source;

	}
	@Override
	public CharSequence getCharContent(boolean ignoreEncodingErrors)
			throws IOException {
		return sourceCode;
	}
}