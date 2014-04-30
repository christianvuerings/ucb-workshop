package com.wordnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import com.wordnik.model.PersonList;
public class PersonResponse {
  @JsonProperty("Timestamp")
  private Date Timestamp = null;
  @JsonProperty("Source")
  private String Source = null;
  @JsonProperty("CorrelationId")
  private String CorrelationId = null;
  @JsonProperty("PersonList")
  private PersonList PersonList = null;
  public Date getTimestamp() {
    return Timestamp;
  }
  public void setTimestamp(Date Timestamp) {
    this.Timestamp = Timestamp;
  }

  public String getSource() {
    return Source;
  }
  public void setSource(String Source) {
    this.Source = Source;
  }

  public String getCorrelationId() {
    return CorrelationId;
  }
  public void setCorrelationId(String CorrelationId) {
    this.CorrelationId = CorrelationId;
  }

  public PersonList getPersonList() {
    return PersonList;
  }
  public void setPersonList(PersonList PersonList) {
    this.PersonList = PersonList;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonResponse {\n");
    sb.append("  Timestamp: ").append(Timestamp).append("\n");
    sb.append("  Source: ").append(Source).append("\n");
    sb.append("  CorrelationId: ").append(CorrelationId).append("\n");
    sb.append("  PersonList: ").append(PersonList).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

