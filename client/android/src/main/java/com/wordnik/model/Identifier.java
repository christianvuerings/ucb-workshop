package com.wordnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Identifier {
  @JsonProperty("EmplID")
  private String EmplID = null;
  @JsonProperty("BirthDate")
  private Date BirthDate = null;
  @JsonProperty("Gender")
  private String Gender = null;
  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  public Date getBirthDate() {
    return BirthDate;
  }
  public void setBirthDate(Date BirthDate) {
    this.BirthDate = BirthDate;
  }

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

