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
import com.groupdocs.sdk.model.QuestionnaireExecutionInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetQuestionnaireExecutionsResult {
  private List<QuestionnaireExecutionInfo> executions = new ArrayList<QuestionnaireExecutionInfo>();
  private String questionnaire_guid = null;
  public List<QuestionnaireExecutionInfo> getExecutions() {
    return executions;
  }
  public void setExecutions(List<QuestionnaireExecutionInfo> executions) {
    this.executions = executions;
  }

  public String getQuestionnaire_guid() {
    return questionnaire_guid;
  }
  public void setQuestionnaire_guid(String questionnaire_guid) {
    this.questionnaire_guid = questionnaire_guid;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQuestionnaireExecutionsResult {\n");
    sb.append("  executions: ").append(executions).append("\n");
    sb.append("  questionnaire_guid: ").append(questionnaire_guid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
