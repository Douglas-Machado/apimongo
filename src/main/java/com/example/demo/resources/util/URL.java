package com.example.demo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

	public static String decodedParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
}
