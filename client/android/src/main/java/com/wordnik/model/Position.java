package com.wordnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Position {
  @JsonProperty("EffectiveDate")
  private Date EffectiveDate = null;
  @JsonProperty("EmplID")
  private String EmplID = null;
  @JsonProperty("PostionNumber")
  private String PostionNumber = null;
  @JsonProperty("PostionDesc")
  private String PostionDesc = null;
  @JsonProperty("ReportsTo")
  private String ReportsTo = null;
  public Date getEffectiveDate() {
    return EffectiveDate;
  }
  public void setEffectiveDate(Date EffectiveDate) {
    this.EffectiveDate = EffectiveDate;
  }

  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  public String getPostionNumber() {
    return PostionNumber;
  }
  public void setPostionNumber(String PostionNumber) {
    this.PostionNumber = PostionNumber;
  }

  public String getPostionDesc() {
    return PostionDesc;
  }
  public void setPostionDesc(String PostionDesc) {
    this.PostionDesc = PostionDesc;
  }

  public String getReportsTo() {
    return ReportsTo;
  }
  public void setReportsTo(String ReportsTo) {
    this.ReportsTo = ReportsTo;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    sb.append("  EffectiveDate: ").append(EffectiveDate).append("\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("  PostionNumber: ").append(PostionNumber).append("\n");
    sb.append("  PostionDesc: ").append(PostionDesc).append("\n");
    sb.append("  ReportsTo: ").append(ReportsTo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

