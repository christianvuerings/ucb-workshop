package com.wordnik.model;

import java.util.Date;
import com.wordnik.swagger.annotations.ApiModelProperty;

public class Position {
  private Date EffectiveDate = null;
  private String EmplID = null;
  private String PostionNumber = null;
  private String PostionDesc = null;
  private String ReportsTo = null;
  @ApiModelProperty(value="", required=true)
  public Date getEffectiveDate() {
    return EffectiveDate;
  }
  public void setEffectiveDate(Date EffectiveDate) {
    this.EffectiveDate = EffectiveDate;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  @ApiModelProperty(value="", required=true)
  public String getPostionNumber() {
    return PostionNumber;
  }
  public void setPostionNumber(String PostionNumber) {
    this.PostionNumber = PostionNumber;
  }

  @ApiModelProperty(value="", required=true)
  public String getPostionDesc() {
    return PostionDesc;
  }
  public void setPostionDesc(String PostionDesc) {
    this.PostionDesc = PostionDesc;
  }

  @ApiModelProperty(value="", required=true)
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

