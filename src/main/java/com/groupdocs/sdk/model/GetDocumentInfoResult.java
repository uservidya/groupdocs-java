/**
 *  Copyright 2012 GroupDocs.
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
package com.groupdocs.sdk.model;

import com.groupdocs.sdk.model.DocumentViewInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetDocumentInfoResult {
  private String guid = null;
  private Double id = null;
  private Integer views_count = null;
  private DocumentViewInfo last_view = null;
  private Integer page_count = null;
  public String getGuid() {
    return guid;
  }
  public void setGuid(String guid) {
    this.guid = guid;
  }

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public Integer getViews_count() {
    return views_count;
  }
  public void setViews_count(Integer views_count) {
    this.views_count = views_count;
  }

  public DocumentViewInfo getLast_view() {
    return last_view;
  }
  public void setLast_view(DocumentViewInfo last_view) {
    this.last_view = last_view;
  }

  public Integer getPage_count() {
    return page_count;
  }
  public void setPage_count(Integer page_count) {
    this.page_count = page_count;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentInfoResult {\n");
    sb.append("  guid: ").append(guid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  views_count: ").append(views_count).append("\n");
    sb.append("  last_view: ").append(last_view).append("\n");
    sb.append("  page_count: ").append(page_count).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
