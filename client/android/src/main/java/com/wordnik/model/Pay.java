package com.wordnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import com.wordnik.model.Rate;
public class Pay {
  @JsonProperty("EmplRecord")
  private String EmplRecord = null;
  @JsonProperty("Rate")
  private List<Rate> Rate = new ArrayList<Rate>();
  @JsonProperty("EmplID")
  private String EmplID = null;
  public String getEmplRecord() {
    return EmplRecord;
  }
  public void setEmplRecord(String EmplRecord) {
    this.EmplRecord = EmplRecord;
  }

  public List<Rate> getRate() {
    return Rate;
  }
  public void setRate(List<Rate> Rate) {
    this.Rate = Rate;
  }

  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pay {\n");
    sb.append("  EmplRecord: ").append(EmplRecord).append("\n");
    sb.append("  Rate: ").append(Rate).append("\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

