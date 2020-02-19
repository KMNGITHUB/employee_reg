/**
 * 
 */
package com.heidelsoft.attendance.pojo;

/**
 * @author lenovo
 *
 */
public class Greeting {
	
	private long id;
	
	private String content;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + "]";
	}
	
	
}
