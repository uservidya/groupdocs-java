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

import com.groupdocs.sdk.model.Rectangle;
import com.groupdocs.sdk.model.Page;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class ChangeInfo {
  private Double id = null;
  private String type = null;
  private String action = null;
  private Page page = null;
  private Rectangle box = null;
  private String text = null;
  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  public Page getPage() {
    return page;
  }
  public void setPage(Page page) {
    this.page = page;
  }

  public Rectangle getBox() {
    return box;
  }
  public void setBox(Rectangle box) {
    this.box = box;
  }

  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeInfo {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  box: ").append(box).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

