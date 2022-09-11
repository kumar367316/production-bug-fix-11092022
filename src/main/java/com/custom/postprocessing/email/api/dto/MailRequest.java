package com.custom.postprocessing.email.api.dto;

import java.util.List;

import lombok.Data;

/**
 * @author kumar.charanswain
 *
 */

@Data
public class MailRequest {

	private String to;
	private String from;
	private String mailStatusMessage;
	private List<String> pclFileNames;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getMailStatusMessage() {
		return mailStatusMessage;
	}

	public void setMailStatusMessage(String mailStatusMessage) {
		this.mailStatusMessage = mailStatusMessage;
	}

	public List<String> getPclFileNames() {
		return pclFileNames;
	}

	public void setPclFileNames(List<String> pclFileNames) {
		this.pclFileNames = pclFileNames;
	}
}
