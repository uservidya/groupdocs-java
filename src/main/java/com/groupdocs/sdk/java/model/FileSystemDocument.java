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

import java.util.List;
import java.util.ArrayList;


/**
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 * @author ramesh
 *
 */
public class FileSystemDocument extends Object {


    /**
     * 
     */
	 private List<UserInfo> sharers  =  new ArrayList<UserInfo>();

    /**
     * 
     */
	 private Long modified_on ;

    /**
     * 
     */
	 private Long created_on ;

    /**
     * 
     */
	 private String type ;

    /**
     * 
     */
	 private String access ;

    /**
     * 
     */
	 private List<String> supported_types  =  new ArrayList<String>();

    /**
     * 
     */
	 private String url ;

    /**
     * 
     */
	 private Integer version ;

    /**
     * 
     */
	 private String file_type ;

    /**
     * 
     */
	 private Long size ;

    /**
     * 
     */
	 private Double id ;

    /**
     * 
     */
	 private String guid ;

    /**
     * 
     */
	 private String thumbnail;

    /**
     * 
     */
	 private Boolean dir ;

    /**
     * 
     */
	 private String name ;

    /**
     * 
     */
	 private UserInfo owner ;


	/**
	 * 
	 * 
	 * 
	 */
	 public List<UserInfo> getSharers() {
	 	return sharers;
	 }  
	 
	 public void setSharers(List<UserInfo>  sharers) {
	 	this.sharers = sharers;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Long getModified_on() {
	 	return modified_on;
	 }  
	 
	 public void setModified_on(Long  modified_on) {
	 	this.modified_on = modified_on;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Long getCreated_on() {
	 	return created_on;
	 }  
	 
	 public void setCreated_on(Long  created_on) {
	 	this.created_on = created_on;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getType() {
	 	return type;
	 }  
	 
	 public void setType(String  type) {
	 	this.type = type;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getAccess() {
	 	return access;
	 }  
	 
	 public void setAccess(String  access) {
	 	this.access = access;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public List<String> getSupported_types() {
	 	return supported_types;
	 }  
	 
	 public void setSupported_types(List<String>  supported_types) {
	 	this.supported_types = supported_types;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getUrl() {
	 	return url;
	 }  
	 
	 public void setUrl(String  url) {
	 	this.url = url;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Integer getVersion() {
	 	return version;
	 }  
	 
	 public void setVersion(Integer  version) {
	 	this.version = version;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getFile_type() {
	 	return file_type;
	 }  
	 
	 public void setFile_type(String  file_type) {
	 	this.file_type = file_type;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Long getSize() {
	 	return size;
	 }  
	 
	 public void setSize(Long  size) {
	 	this.size = size;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Double getId() {
	 	return id;
	 }  
	 
	 public void setId(Double  id) {
	 	this.id = id;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getGuid() {
	 	return guid;
	 }  
	 
	 public void setGuid(String  guid) {
	 	this.guid = guid;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getThumbnail() {
	 	return thumbnail;
	 }  
	 
	 public void setThumbnail(String  thumbnail) {
	 	this.thumbnail = thumbnail;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Boolean getDir() {
	 	return dir;
	 }  
	 
	 public void setDir(Boolean  dir) {
	 	this.dir = dir;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getName() {
	 	return name;
	 }  
	 
	 public void setName(String  name) {
	 	this.name = name;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public UserInfo getOwner() {
	 	return owner;
	 }  
	 
	 public void setOwner(UserInfo  owner) {
	 	this.owner = owner;
	 }


}
