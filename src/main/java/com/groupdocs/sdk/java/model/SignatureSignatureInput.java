/**
 *  Copyright 2011 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
 
package com.groupdocs.sdk.java.model;

import com.wordnik.swagger.runtime.annotations.*;
import java.util.List;


/**
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 * @author ramesh
 *
 */
public class SignatureSignatureInput extends Object {


    /**
     * User GUID
     */
	 private String userId ;

    /**
     * Page number
     */
	 private String page ;

    /**
     * Filter by firstName
     */
	 private String firstName ;

    /**
     * Filter by lastName
     */
	 private String lastName ;

    /**
     * Filter by email
     */
	 private String email ;


	/**
	 * User GUID
	 * 
	 * 
	 */
	 public String getUserId() {
	 	return userId;
	 }  
	 
	 public void setUserId(String  userId) {
	 	this.userId = userId;
	 }

	/**
	 * Page number
	 * 
	 * 
	 */
	 public String getPage() {
	 	return page;
	 }  
	 
	 public void setPage(String  page) {
	 	this.page = page;
	 }

	/**
	 * Filter by firstName
	 * 
	 * 
	 */
	 public String getFirstName() {
	 	return firstName;
	 }  
	 
	 public void setFirstName(String  firstName) {
	 	this.firstName = firstName;
	 }

	/**
	 * Filter by lastName
	 * 
	 * 
	 */
	 public String getLastName() {
	 	return lastName;
	 }  
	 
	 public void setLastName(String  lastName) {
	 	this.lastName = lastName;
	 }

	/**
	 * Filter by email
	 * 
	 * 
	 */
	 public String getEmail() {
	 	return email;
	 }  
	 
	 public void setEmail(String  email) {
	 	this.email = email;
	 }


}