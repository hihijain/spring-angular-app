/**
 * 
 */
package com.spring.angular.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author HJain
 *
 */
@Data
@AllArgsConstructor
public class Books {
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private int bookPrice;	
}
