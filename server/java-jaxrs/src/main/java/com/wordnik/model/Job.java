package com.wordnik.model;

import java.util.Date;
import java.util.*;
import com.wordnik.model.Position;
import com.wordnik.model.Compensation;
import com.wordnik.model.Department;
import com.wordnik.model.Distribution;
import com.wordnik.swagger.annotations.ApiModelProperty;

public class Job {
  private String Location = null;
  private String Type = null;
  private List<Position> Position = new ArrayList<Position>();
  private String Action = null;
  private List<Distribution> Distribution = new ArrayList<Distribution>();
  private Date EffectiveDate = null;
  private String EmplRecord = null;
  private String AnnualRate = null;
  private String Amount = null;
  private String EmplID = null;
  private String BusinessUnit = null;
  private List<Department> Department = new ArrayList<Department>();
  private String EmplClass = null;
  private String EmplClassDesc = null;
  private String EffectiveSequence = null;
  private Date ApptEndDate = null;
  private String SupervisorId = null;
  private String PersonOrg = null;
  private String JobCode = null;
  private String JobCodeDesc = null;
  private String PayFreq = null;
  private String hRStatus = null;
  private String EmplStatus = null;
  private Date ActionDate = null;
  private String ActionReason = null;
  private String fTE = null;
  private Date HireDate = null;
  private Date TerminationDate = null;
  private Date ExpectedReturnDate = null;
  private Date ExpectedEndDate = null;
  private String Step = null;
  private List<Compensation> Compensation = new ArrayList<Compensation>();
  @ApiModelProperty(value="", required=true)
  public String getLocation() {
    return Location;
  }
  public void setLocation(String Location) {
    this.Location = Location;
  }

  @ApiModelProperty(value="", required=true)
  public String getType() {
    return Type;
  }
  public void setType(String Type) {
    this.Type = Type;
  }

  @ApiModelProperty(value="", required=true)
  public List<Position> getPosition() {
    return Position;
  }
  public void setPosition(List<Position> Position) {
    this.Position = Position;
  }

  @ApiModelProperty(value="", required=true)
  public String getAction() {
    return Action;
  }
  public void setAction(String Action) {
    this.Action = Action;
  }

  @ApiModelProperty(value="", required=true)
  public List<Distribution> getDistribution() {
    return Distribution;
  }
  public void setDistribution(List<Distribution> Distribution) {
    this.Distribution = Distribution;
  }

  @ApiModelProperty(value="", required=true)
  public Date getEffectiveDate() {
    return EffectiveDate;
  }
  public void setEffectiveDate(Date EffectiveDate) {
    this.EffectiveDate = EffectiveDate;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmplRecord() {
    return EmplRecord;
  }
  public void setEmplRecord(String EmplRecord) {
    this.EmplRecord = EmplRecord;
  }

  @ApiModelProperty(value="", required=true)
  public String getAnnualRate() {
    return AnnualRate;
  }
  public void setAnnualRate(String AnnualRate) {
    this.AnnualRate = AnnualRate;
  }

  @ApiModelProperty(value="", required=true)
  public String getAmount() {
    return Amount;
  }
  public void setAmount(String Amount) {
    this.Amount = Amount;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  @ApiModelProperty(value="", required=true)
  public String getBusinessUnit() {
    return BusinessUnit;
  }
  public void setBusinessUnit(String BusinessUnit) {
    this.BusinessUnit = BusinessUnit;
  }

  @ApiModelProperty(value="", required=true)
  public List<Department> getDepartment() {
    return Department;
  }
  public void setDepartment(List<Department> Department) {
    this.Department = Department;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmplClass() {
    return EmplClass;
  }
  public void setEmplClass(String EmplClass) {
    this.EmplClass = EmplClass;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmplClassDesc() {
    return EmplClassDesc;
  }
  public void setEmplClassDesc(String EmplClassDesc) {
    this.EmplClassDesc = EmplClassDesc;
  }

  @ApiModelProperty(value="", required=true)
  public String getEffectiveSequence() {
    return EffectiveSequence;
  }
  public void setEffectiveSequence(String EffectiveSequence) {
    this.EffectiveSequence = EffectiveSequence;
  }

  @ApiModelProperty(value="", required=true)
  public Date getApptEndDate() {
    return ApptEndDate;
  }
  public void setApptEndDate(Date ApptEndDate) {
    this.ApptEndDate = ApptEndDate;
  }

  @ApiModelProperty(value="", required=true)
  public String getSupervisorId() {
    return SupervisorId;
  }
  public void setSupervisorId(String SupervisorId) {
    this.SupervisorId = SupervisorId;
  }

  @ApiModelProperty(value="", required=true)
  public String getPersonOrg() {
    return PersonOrg;
  }
  public void setPersonOrg(String PersonOrg) {
    this.PersonOrg = PersonOrg;
  }

  @ApiModelProperty(value="", required=true)
  public String getJobCode() {
    return JobCode;
  }
  public void setJobCode(String JobCode) {
    this.JobCode = JobCode;
  }

  @ApiModelProperty(value="", required=true)
  public String getJobCodeDesc() {
    return JobCodeDesc;
  }
  public void setJobCodeDesc(String JobCodeDesc) {
    this.JobCodeDesc = JobCodeDesc;
  }

  @ApiModelProperty(value="", required=true)
  public String getPayFreq() {
    return PayFreq;
  }
  public void setPayFreq(String PayFreq) {
    this.PayFreq = PayFreq;
  }

  @ApiModelProperty(value="")
  public String getHRStatus() {
    return hRStatus;
  }
  public void setHRStatus(String hRStatus) {
    this.hRStatus = hRStatus;
  }

  @ApiModelProperty(value="", required=true)
  public String getEmplStatus() {
    return EmplStatus;
  }
  public void setEmplStatus(String EmplStatus) {
    this.EmplStatus = EmplStatus;
  }

  @ApiModelProperty(value="", required=true)
  public Date getActionDate() {
    return ActionDate;
  }
  public void setActionDate(Date ActionDate) {
    this.ActionDate = ActionDate;
  }

  @ApiModelProperty(value="", required=true)
  public String getActionReason() {
    return ActionReason;
  }
  public void setActionReason(String ActionReason) {
    this.ActionReason = ActionReason;
  }

  @ApiModelProperty(value="")
  public String getFTE() {
    return fTE;
  }
  public void setFTE(String fTE) {
    this.fTE = fTE;
  }

  @ApiModelProperty(value="", required=true)
  public Date getHireDate() {
    return HireDate;
  }
  public void setHireDate(Date HireDate) {
    this.HireDate = HireDate;
  }

  @ApiModelProperty(value="", required=true)
  public Date getTerminationDate() {
    return TerminationDate;
  }
  public void setTerminationDate(Date TerminationDate) {
    this.TerminationDate = TerminationDate;
  }

  @ApiModelProperty(value="", required=true)
  public Date getExpectedReturnDate() {
    return ExpectedReturnDate;
  }
  public void setExpectedReturnDate(Date ExpectedReturnDate) {
    this.ExpectedReturnDate = ExpectedReturnDate;
  }

  @ApiModelProperty(value="", required=true)
  public Date getExpectedEndDate() {
    return ExpectedEndDate;
  }
  public void setExpectedEndDate(Date ExpectedEndDate) {
    this.ExpectedEndDate = ExpectedEndDate;
  }

  @ApiModelProperty(value="", required=true)
  public String getStep() {
    return Step;
  }
  public void setStep(String Step) {
    this.Step = Step;
  }

  @ApiModelProperty(value="", required=true)
  public List<Compensation> getCompensation() {
    return Compensation;
  }
  public void setCompensation(List<Compensation> Compensation) {
    this.Compensation = Compensation;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    sb.append("  Location: ").append(Location).append("\n");
    sb.append("  Type: ").append(Type).append("\n");
    sb.append("  Position: ").append(Position).append("\n");
    sb.append("  Action: ").append(Action).append("\n");
    sb.append("  Distribution: ").append(Distribution).append("\n");
    sb.append("  EffectiveDate: ").append(EffectiveDate).append("\n");
    sb.append("  EmplRecord: ").append(EmplRecord).append("\n");
    sb.append("  AnnualRate: ").append(AnnualRate).append("\n");
    sb.append("  Amount: ").append(Amount).append("\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("  BusinessUnit: ").append(BusinessUnit).append("\n");
    sb.append("  Department: ").append(Department).append("\n");
    sb.append("  EmplClass: ").append(EmplClass).append("\n");
    sb.append("  EmplClassDesc: ").append(EmplClassDesc).append("\n");
    sb.append("  EffectiveSequence: ").append(EffectiveSequence).append("\n");
    sb.append("  ApptEndDate: ").append(ApptEndDate).append("\n");
    sb.append("  SupervisorId: ").append(SupervisorId).append("\n");
    sb.append("  PersonOrg: ").append(PersonOrg).append("\n");
    sb.append("  JobCode: ").append(JobCode).append("\n");
    sb.append("  JobCodeDesc: ").append(JobCodeDesc).append("\n");
    sb.append("  PayFreq: ").append(PayFreq).append("\n");
    sb.append("  hRStatus: ").append(hRStatus).append("\n");
    sb.append("  EmplStatus: ").append(EmplStatus).append("\n");
    sb.append("  ActionDate: ").append(ActionDate).append("\n");
    sb.append("  ActionReason: ").append(ActionReason).append("\n");
    sb.append("  fTE: ").append(fTE).append("\n");
    sb.append("  HireDate: ").append(HireDate).append("\n");
    sb.append("  TerminationDate: ").append(TerminationDate).append("\n");
    sb.append("  ExpectedReturnDate: ").append(ExpectedReturnDate).append("\n");
    sb.append("  ExpectedEndDate: ").append(ExpectedEndDate).append("\n");
    sb.append("  Step: ").append(Step).append("\n");
    sb.append("  Compensation: ").append(Compensation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

