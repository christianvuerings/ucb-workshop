package com.wordnik.model;

import java.util.Date;
import com.wordnik.swagger.annotations.ApiModelProperty;

public class Identifier {
  private String EmplID = null;
  private Date BirthDate = null;
  private String Gender = null;
  @ApiModelProperty(value="", required=true)
  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  @ApiModelProperty(value="", required=true)
  public Date getBirthDate() {
    return BirthDate;
  }
  public void setBirthDate(Date BirthDate) {
    this.BirthDate = BirthDate;
  }

  @ApiModelProperty(value="", required=true)
  public String getGender() {
    return Gender;
  }
  public void setGender(String Gender) {
    this.Gender = Gender;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identifier {\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("  BirthDate: ").append(BirthDate).append("\n");
    sb.append("  Gender: ").append(Gender).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

