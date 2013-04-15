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

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureContactIntegrationSettings {
  private String provider = null;
  private String refreshToken = null;
  private String accessToken = null;
  private String accessTokenExpiration = null;
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public String getAccessTokenExpiration() {
    return accessTokenExpiration;
  }
  public void setAccessTokenExpiration(String accessTokenExpiration) {
    this.accessTokenExpiration = accessTokenExpiration;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureContactIntegrationSettings {\n");
    sb.append("  provider: ").append(provider).append("\n");
    sb.append("  refreshToken: ").append(refreshToken).append("\n");
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("  accessTokenExpiration: ").append(accessTokenExpiration).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

