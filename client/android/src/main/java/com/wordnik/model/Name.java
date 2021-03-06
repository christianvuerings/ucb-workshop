package com.wordnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Name {
  @JsonProperty("PrefFirstName")
  private String PrefFirstName = null;
  @JsonProperty("EffectiveDate")
  private Date EffectiveDate = null;
  @JsonProperty("EmplID")
  private String EmplID = null;
  @JsonProperty("FirstName")
  private String FirstName = null;
  @JsonProperty("LastName")
  private String LastName = null;
  @JsonProperty("MiddleName")
  private String MiddleName = null;
  @JsonProperty("NamePrefix")
  private String NamePrefix = null;
  @JsonProperty("NameSuffix")
  private String NameSuffix = null;
  @JsonProperty("NameType")
  private String NameType = null;
  public String getPrefFirstName() {
    return PrefFirstName;
  }
  public void setPrefFirstName(String PrefFirstName) {
    this.PrefFirstName = PrefFirstName;
  }

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

  public String getFirstName() {
    return FirstName;
  }
  public void setFirstName(String FirstName) {
    this.FirstName = FirstName;
  }

  public String getLastName() {
    return LastName;
  }
  public void setLastName(String LastName) {
    this.LastName = LastName;
  }

  public String getMiddleName() {
    return MiddleName;
  }
  public void setMiddleName(String MiddleName) {
    this.MiddleName = MiddleName;
  }

  public String getNamePrefix() {
    return NamePrefix;
  }
  public void setNamePrefix(String NamePrefix) {
    this.NamePrefix = NamePrefix;
  }

  public String getNameSuffix() {
    return NameSuffix;
  }
  public void setNameSuffix(String NameSuffix) {
    this.NameSuffix = NameSuffix;
  }

  public String getNameType() {
    return NameType;
  }
  public void setNameType(String NameType) {
    this.NameType = NameType;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    sb.append("  PrefFirstName: ").append(PrefFirstName).append("\n");
    sb.append("  EffectiveDate: ").append(EffectiveDate).append("\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("  FirstName: ").append(FirstName).append("\n");
    sb.append("  LastName: ").append(LastName).append("\n");
    sb.append("  MiddleName: ").append(MiddleName).append("\n");
    sb.append("  NamePrefix: ").append(NamePrefix).append("\n");
    sb.append("  NameSuffix: ").append(NameSuffix).append("\n");
    sb.append("  NameType: ").append(NameType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

