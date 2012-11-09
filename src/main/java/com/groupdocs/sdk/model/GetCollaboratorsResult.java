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

import java.util.*;
import com.groupdocs.sdk.model.ReviewerInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetCollaboratorsResult {
  private String sessionGuid = null;
  private String documentGuid = null;
  private List<ReviewerInfo> collaborators = new ArrayList<ReviewerInfo>();
  private Integer shared_link_access_rights = null;
  private ReviewerInfo owner = null;
  public String getSessionGuid() {
    return sessionGuid;
  }
  public void setSessionGuid(String sessionGuid) {
    this.sessionGuid = sessionGuid;
  }

  public String getDocumentGuid() {
    return documentGuid;
  }
  public void setDocumentGuid(String documentGuid) {
    this.documentGuid = documentGuid;
  }

  public List<ReviewerInfo> getCollaborators() {
    return collaborators;
  }
  public void setCollaborators(List<ReviewerInfo> collaborators) {
    this.collaborators = collaborators;
  }

  public Integer getShared_link_access_rights() {
    return shared_link_access_rights;
  }
  public void setShared_link_access_rights(Integer shared_link_access_rights) {
    this.shared_link_access_rights = shared_link_access_rights;
  }

  public ReviewerInfo getOwner() {
    return owner;
  }
  public void setOwner(ReviewerInfo owner) {
    this.owner = owner;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCollaboratorsResult {\n");
    sb.append("  sessionGuid: ").append(sessionGuid).append("\n");
    sb.append("  documentGuid: ").append(documentGuid).append("\n");
    sb.append("  collaborators: ").append(collaborators).append("\n");
    sb.append("  shared_link_access_rights: ").append(shared_link_access_rights).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
