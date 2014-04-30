package com.wordnik.model;

import java.util.Date;
import com.wordnik.model.PersonList;
import com.wordnik.swagger.annotations.ApiModelProperty;

public class PersonResponse {
  private Date Timestamp = null;
  private String Source = null;
  private String CorrelationId = null;
  private PersonList PersonList = null;
  @ApiModelProperty(value="", required=true)
  public Date getTimestamp() {
    return Timestamp;
  }
  public void setTimestamp(Date Timestamp) {
    this.Timestamp = Timestamp;
  }

  @ApiModelProperty(value="", required=true)
  public String getSource() {
    return Source;
  }
  public void setSource(String Source) {
    this.Source = Source;
  }

  @ApiModelProperty(value="", required=true)
  public String getCorrelationId() {
    return CorrelationId;
  }
  public void setCorrelationId(String CorrelationId) {
    this.CorrelationId = CorrelationId;
  }

  @ApiModelProperty(value="", required=true)
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

