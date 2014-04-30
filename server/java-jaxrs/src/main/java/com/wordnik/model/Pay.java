package com.wordnik.model;

import java.util.*;
import com.wordnik.model.Rate;
import com.wordnik.swagger.annotations.ApiModelProperty;

public class Pay {
  private String EmplRecord = null;
  private List<Rate> Rate = new ArrayList<Rate>();
  private String EmplID = null;
  @ApiModelProperty(value="", required=true)
  public String getEmplRecord() {
    return EmplRecord;
  }
  public void setEmplRecord(String EmplRecord) {
    this.EmplRecord = EmplRecord;
  }

  @ApiModelProperty(value="", required=true)
  public List<Rate> getRate() {
    return Rate;
  }
  public void setRate(List<Rate> Rate) {
    this.Rate = Rate;
  }

  @ApiModelProperty(value="", required=true)
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

