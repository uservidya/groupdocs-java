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
public class SignatureEnvelopeFieldSettings {
  private Double locationHeight = null;
  private String fontName = null;
  private String fontColor = null;
  private Boolean forceNewField = null;
  private String regularExpression = null;
  private Boolean mandatory = null;
  private Double locationX = null;
  private Boolean fontBold = null;
  private Double fontSize = null;
  private Double locationY = null;
  private String acceptableValues = null;
  private Boolean fontItalic = null;
  private Boolean fontUnderline = null;
  private Integer order = null;
  private Integer page = null;
  private String name = null;
  private Double locationWidth = null;
  private String defaultValue = null;
  private String tooltip = null;
  public Double getLocationHeight() {
    return locationHeight;
  }
  public void setLocationHeight(Double locationHeight) {
    this.locationHeight = locationHeight;
  }

  public String getFontName() {
    return fontName;
  }
  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  public String getFontColor() {
    return fontColor;
  }
  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public Boolean getForceNewField() {
    return forceNewField;
  }
  public void setForceNewField(Boolean forceNewField) {
    this.forceNewField = forceNewField;
  }

  public String getRegularExpression() {
    return regularExpression;
  }
  public void setRegularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
  }

  public Boolean getMandatory() {
    return mandatory;
  }
  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public Double getLocationX() {
    return locationX;
  }
  public void setLocationX(Double locationX) {
    this.locationX = locationX;
  }

  public Boolean getFontBold() {
    return fontBold;
  }
  public void setFontBold(Boolean fontBold) {
    this.fontBold = fontBold;
  }

  public Double getFontSize() {
    return fontSize;
  }
  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public Double getLocationY() {
    return locationY;
  }
  public void setLocationY(Double locationY) {
    this.locationY = locationY;
  }

  public String getAcceptableValues() {
    return acceptableValues;
  }
  public void setAcceptableValues(String acceptableValues) {
    this.acceptableValues = acceptableValues;
  }

  public Boolean getFontItalic() {
    return fontItalic;
  }
  public void setFontItalic(Boolean fontItalic) {
    this.fontItalic = fontItalic;
  }

  public Boolean getFontUnderline() {
    return fontUnderline;
  }
  public void setFontUnderline(Boolean fontUnderline) {
    this.fontUnderline = fontUnderline;
  }

  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  public Integer getPage() {
    return page;
  }
  public void setPage(Integer page) {
    this.page = page;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Double getLocationWidth() {
    return locationWidth;
  }
  public void setLocationWidth(Double locationWidth) {
    this.locationWidth = locationWidth;
  }

  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public String getTooltip() {
    return tooltip;
  }
  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureEnvelopeFieldSettings {\n");
    sb.append("  locationHeight: ").append(locationHeight).append("\n");
    sb.append("  fontName: ").append(fontName).append("\n");
    sb.append("  fontColor: ").append(fontColor).append("\n");
    sb.append("  forceNewField: ").append(forceNewField).append("\n");
    sb.append("  regularExpression: ").append(regularExpression).append("\n");
    sb.append("  mandatory: ").append(mandatory).append("\n");
    sb.append("  locationX: ").append(locationX).append("\n");
    sb.append("  fontBold: ").append(fontBold).append("\n");
    sb.append("  fontSize: ").append(fontSize).append("\n");
    sb.append("  locationY: ").append(locationY).append("\n");
    sb.append("  acceptableValues: ").append(acceptableValues).append("\n");
    sb.append("  fontItalic: ").append(fontItalic).append("\n");
    sb.append("  fontUnderline: ").append(fontUnderline).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  locationWidth: ").append(locationWidth).append("\n");
    sb.append("  defaultValue: ").append(defaultValue).append("\n");
    sb.append("  tooltip: ").append(tooltip).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
