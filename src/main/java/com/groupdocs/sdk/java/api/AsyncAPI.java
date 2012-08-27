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

 package com.groupdocs.sdk.java.api;


import com.groupdocs.sdk.java.model.*;

import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.wordnik.swagger.runtime.annotations.*;
import com.wordnik.swagger.runtime.common.*;
import com.wordnik.swagger.runtime.exception.*;

import java.util.*;
import java.lang.Long;
import java.io.IOException;


/**
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 * @author ramesh
 *
 */
public class AsyncAPI extends Object {

    private static APIInvoker apiInvoker = null;

	/**
	 * Get job
	 *
	 * 
	 * 
     * @param userId  User GUID
     *  @param jobId  Job id
     *  
	 * @return GetJobResponse {@link GetJobResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="userId, jobId")
	 public static GetJobResponse GetJob(String userId, String jobId) throws APIException {

		//parse inputs
		String  resourcePath = "/async/{userId}/jobs/{jobId}?format=xml";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( userId != null) {
			resourcePath = resourcePath.replace("{userId}", userId);
		}
		if( jobId != null) {
			resourcePath = resourcePath.replace("{jobId}", jobId);
		}


		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		GetJobResponse responseObject = (GetJobResponse) getApiInvoker().deserialize(response, GetJobResponse.class);
		return responseObject;
	}

	/**
	 * Get job json
	 *
	 * 
	 * 
     * @param userId  User GUID
     *  @param jobId  Job id
     *  
	 * @return GetJobResponse {@link GetJobResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="userId, jobId")
	 public static GetJobResponse GetJobJson(String userId, String jobId) throws APIException {

		//parse inputs
		String  resourcePath = "/async/{userId}/jobs/{jobId}?format=json";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( userId != null) {
			resourcePath = resourcePath.replace("{userId}", userId);
		}
		if( jobId != null) {
			resourcePath = resourcePath.replace("{jobId}", jobId);
		}


		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		GetJobResponse responseObject = (GetJobResponse) getApiInvoker().deserialize(response, GetJobResponse.class);
		return responseObject;
	}

	/**
	 * Get job documents
	 *
	 * 
	 * 
     * @param userId  User GUID
     *  @param jobId  Job id
     *  
	 * @return GetJobDocumentsResponse {@link GetJobDocumentsResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="userId, jobId")
	 public static GetJobDocumentsResponse GetJobDocuments(String userId, String jobId) throws APIException {

		//parse inputs
		String  resourcePath = "/async/{userId}/jobs/{jobId}/documents?format={format}";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( userId != null) {
			resourcePath = resourcePath.replace("{userId}", userId);
		}
		if( jobId != null) {
			resourcePath = resourcePath.replace("{jobId}", jobId);
		}


		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		GetJobDocumentsResponse responseObject = (GetJobDocumentsResponse) getApiInvoker().deserialize(response, GetJobDocumentsResponse.class);
		return responseObject;
	}

	/**
	 * Create job
	 *
	 * 
	 * 
     * @param userId  User GUID
     *  @param postData  Job
     *  
	 * @return CreateJobResponse {@link CreateJobResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="userId, postData")
	 public static CreateJobResponse CreateJob(String userId, JobInfo postData) throws APIException {

		//parse inputs
		String  resourcePath = "/async/{userId}/jobs";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "POST";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( userId != null) {
			resourcePath = resourcePath.replace("{userId}", userId);
		}


		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, postData, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		CreateJobResponse responseObject = (CreateJobResponse) getApiInvoker().deserialize(response, CreateJobResponse.class);
		return responseObject;
	}

	/**
	 * Add job document
	 *
	 * 
	 * 
     * @param userId  User GUID
     *  @param jobId  Job id
     *  @param fileId  File GUID
     *  @param formats  Formats
     *  
	 * @return AddJobDocumentResponse {@link AddJobDocumentResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="userId, jobId, fileId, formats")
	 public static AddJobDocumentResponse AddJobDocument(String userId, String jobId, String fileId, String formats) throws APIException {

		//parse inputs
		String  resourcePath = "/async/{userId}/jobs/{jobId}/files/{fileId}?out_formats={formats}";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "PUT";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( userId != null) {
			resourcePath = resourcePath.replace("{userId}", userId);
		}
		if( jobId != null) {
			resourcePath = resourcePath.replace("{jobId}", jobId);
		}
		if( fileId != null) {
			resourcePath = resourcePath.replace("{fileId}", fileId);
		}
		if( formats != null) {
			resourcePath = resourcePath.replace("{formats}", formats);
		}


		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		AddJobDocumentResponse responseObject = (AddJobDocumentResponse) getApiInvoker().deserialize(response, AddJobDocumentResponse.class);
		return responseObject;
	}

	/**
	 * Add job document url
	 *
	 * 
	 * 
     * @param userId  User GUID
     *  @param jobId  Job id
     *  @param absoluteUrl  Absolute Url
     *  @param formats  Formats
     *  
	 * @return AddJobDocumentResponse {@link AddJobDocumentResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="userId, jobId, absoluteUrl, formats")
	 public static AddJobDocumentResponse AddJobDocumentUrl(String userId, String jobId, String absoluteUrl, String formats) throws APIException {

		//parse inputs
		String  resourcePath = "/async/{userId}/jobs/{jobId}/urls?absolute_url={absoluteUrl}&out_formats={formats}";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "PUT";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( userId != null) {
			resourcePath = resourcePath.replace("{userId}", userId);
		}
		if( jobId != null) {
			resourcePath = resourcePath.replace("{jobId}", jobId);
		}
		if( absoluteUrl != null) {
			resourcePath = resourcePath.replace("{absoluteUrl}", absoluteUrl);
		}
		if( formats != null) {
			resourcePath = resourcePath.replace("{formats}", formats);
		}


		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		AddJobDocumentResponse responseObject = (AddJobDocumentResponse) getApiInvoker().deserialize(response, AddJobDocumentResponse.class);
		return responseObject;
	}

	/**
	 * Update job
	 *
	 * 
	 * 
     * @param userId  User GUID
     *  @param jobId  Job id
     *  @param postData  Job
     *  
	 * @return UpdateJobResponse {@link UpdateJobResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="userId, jobId, postData")
	 public static UpdateJobResponse UpdateJob(String userId, String jobId, JobInfo postData) throws APIException {

		//parse inputs
		String  resourcePath = "/async/{userId}/jobs/{jobId}";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "PUT";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( userId != null) {
			resourcePath = resourcePath.replace("{userId}", userId);
		}
		if( jobId != null) {
			resourcePath = resourcePath.replace("{jobId}", jobId);
		}


		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, postData, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		UpdateJobResponse responseObject = (UpdateJobResponse) getApiInvoker().deserialize(response, UpdateJobResponse.class);
		return responseObject;
	}

	/**
	 * Get jobs
	 *
	 * 
	 * 
     * @param asyncAsyncInput  
     *  
	 * @return GetJobsResponse {@link GetJobsResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="asyncAsyncInput")
	 public static GetJobsResponse GetJobs(AsyncAsyncInput asyncAsyncInput) throws APIException {

		//parse inputs
		String  resourcePath = "/async/{userId}/jobs?page={pageIndex}&count={pageSize}&actions={actions}&excluded_actions={excludedActions}";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( asyncAsyncInput != null && asyncAsyncInput.getUserId() != null) {
		 	resourcePath = resourcePath.replace("{userId}", asyncAsyncInput.getUserId());
		}
		if( asyncAsyncInput != null && asyncAsyncInput.getPageIndex() != null) {
		 	resourcePath = resourcePath.replace("{pageIndex}", asyncAsyncInput.getPageIndex());
		}
		if( asyncAsyncInput != null && asyncAsyncInput.getPageSize() != null) {
		 	resourcePath = resourcePath.replace("{pageSize}", asyncAsyncInput.getPageSize());
		}
		if( asyncAsyncInput != null && asyncAsyncInput.getActions() != null) {
		 	resourcePath = resourcePath.replace("{actions}", asyncAsyncInput.getActions());
		}
		if( asyncAsyncInput != null && asyncAsyncInput.getExcludedActions() != null) {
		 	resourcePath = resourcePath.replace("{excludedActions}", asyncAsyncInput.getExcludedActions());
		}


		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		GetJobsResponse responseObject = (GetJobsResponse) getApiInvoker().deserialize(response, GetJobsResponse.class);
		return responseObject;
	}

	/**
	 * Get job documents
	 *
	 * 
	 * 
     * @param asyncAsyncInputJobsInput  
     *  
	 * @return GetJobsDocumentsResponse {@link GetJobsDocumentsResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="asyncAsyncInputJobsInput")
	 public static GetJobsDocumentsResponse GetJobsDocuments(AsyncAsyncInputJobsInput asyncAsyncInputJobsInput) throws APIException {

		//parse inputs
		String  resourcePath = "/async/{userId}/jobs/documents?page={pageIndex}&count={pageSize}&actions={actions}&excluded_actions={excludedActions}&order_by={orderBy}&order_asc={orderAsc}";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( asyncAsyncInputJobsInput != null && asyncAsyncInputJobsInput.getUserId() != null) {
		 	resourcePath = resourcePath.replace("{userId}", asyncAsyncInputJobsInput.getUserId());
		}
		if( asyncAsyncInputJobsInput != null && asyncAsyncInputJobsInput.getPageIndex() != null) {
		 	resourcePath = resourcePath.replace("{pageIndex}", asyncAsyncInputJobsInput.getPageIndex());
		}
		if( asyncAsyncInputJobsInput != null && asyncAsyncInputJobsInput.getPageSize() != null) {
		 	resourcePath = resourcePath.replace("{pageSize}", asyncAsyncInputJobsInput.getPageSize());
		}
		if( asyncAsyncInputJobsInput != null && asyncAsyncInputJobsInput.getActions() != null) {
		 	resourcePath = resourcePath.replace("{actions}", asyncAsyncInputJobsInput.getActions());
		}
		if( asyncAsyncInputJobsInput != null && asyncAsyncInputJobsInput.getExcludedActions() != null) {
		 	resourcePath = resourcePath.replace("{excludedActions}", asyncAsyncInputJobsInput.getExcludedActions());
		}
		if( asyncAsyncInputJobsInput != null && asyncAsyncInputJobsInput.getOrderBy() != null) {
		 	resourcePath = resourcePath.replace("{orderBy}", asyncAsyncInputJobsInput.getOrderBy());
		}
		if( asyncAsyncInputJobsInput != null && asyncAsyncInputJobsInput.getOrderAsc() != null) {
		 	resourcePath = resourcePath.replace("{orderAsc}", asyncAsyncInputJobsInput.getOrderAsc());
		}


		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		GetJobsDocumentsResponse responseObject = (GetJobsDocumentsResponse) getApiInvoker().deserialize(response, GetJobsDocumentsResponse.class);
		return responseObject;
	}

	/**
	 * Convert
	 *
	 * 
	 * 
     * @param asyncAsyncInputFilesInput  
     *  
	 * @return ConvertResponse {@link ConvertResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="asyncAsyncInputFilesInput")
	 public static ConvertResponse Convert(AsyncAsyncInputFilesInput asyncAsyncInputFilesInput) throws APIException {

		//parse inputs
		String  resourcePath = "/async/{userId}/files/{fileId}?new_type={targetType}&email_results={emailResults}&new_description={description}&print_script={printScript}";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "POST";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( asyncAsyncInputFilesInput != null && asyncAsyncInputFilesInput.getUserId() != null) {
		 	resourcePath = resourcePath.replace("{userId}", asyncAsyncInputFilesInput.getUserId());
		}
		if( asyncAsyncInputFilesInput != null && asyncAsyncInputFilesInput.getFileId() != null) {
		 	resourcePath = resourcePath.replace("{fileId}", asyncAsyncInputFilesInput.getFileId());
		}
		if( asyncAsyncInputFilesInput != null && asyncAsyncInputFilesInput.getTargetType() != null) {
		 	resourcePath = resourcePath.replace("{targetType}", asyncAsyncInputFilesInput.getTargetType());
		}
		if( asyncAsyncInputFilesInput != null && asyncAsyncInputFilesInput.getEmailResults() != null) {
		 	resourcePath = resourcePath.replace("{emailResults}", asyncAsyncInputFilesInput.getEmailResults());
		}
		if( asyncAsyncInputFilesInput != null && asyncAsyncInputFilesInput.getDescription() != null) {
		 	resourcePath = resourcePath.replace("{description}", asyncAsyncInputFilesInput.getDescription());
		}
		if( asyncAsyncInputFilesInput != null && asyncAsyncInputFilesInput.getPrintScript() != null) {
		 	resourcePath = resourcePath.replace("{printScript}", asyncAsyncInputFilesInput.getPrintScript());
		}


		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		ConvertResponse responseObject = (ConvertResponse) getApiInvoker().deserialize(response, ConvertResponse.class);
		return responseObject;
	}



    public static APIInvoker getApiInvoker() {
        if(apiInvoker == null){
            apiInvoker = APIInvoker.getApiInvoker();
        }
        return apiInvoker;
    }

    public static void setApiInvoker(APIInvoker invoker) {
        apiInvoker = invoker;
    }

}