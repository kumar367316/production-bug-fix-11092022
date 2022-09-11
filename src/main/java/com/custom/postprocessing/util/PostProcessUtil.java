package com.custom.postprocessing.util;

import org.springframework.stereotype.Component;

/**
 * @author kumar.charanswain
 *
 */

@Component
public class PostProcessUtil {
	
	public String getFileType(String fileType) {
		if (fileType.matches(".*[0-9].*")) {
			fileType = "page" + fileType;
		}
		return fileType;
	}
}
