package com.wordnik.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.*;
import com.wordnik.model.Position;
import com.wordnik.model.Compensation;
import com.wordnik.model.Department;
import com.wordnik.model.Distribution;
public class Job {
  @JsonProperty("Location")
  private String Location = null;
  @JsonProperty("Type")
  private String Type = null;
  @JsonProperty("Position")
  private List<Position> Position = new ArrayList<Position>();
  @JsonProperty("Action")
  private String Action = null;
  @JsonProperty("Distribution")
  private List<Distribution> Distribution = new ArrayList<Distribution>();
  @JsonProperty("EffectiveDate")
  private Date EffectiveDate = null;
  @JsonProperty("EmplRecord")
  private String EmplRecord = null;
  @JsonProperty("AnnualRate")
  private String AnnualRate = null;
  @JsonProperty("Amount")
  private String Amount = null;
  @JsonProperty("EmplID")
  private String EmplID = null;
  @JsonProperty("BusinessUnit")
  private String BusinessUnit = null;
  @JsonProperty("Department")
  private List<Department> Department = new ArrayList<Department>();
  @JsonProperty("EmplClass")
  private String EmplClass = null;
  @JsonProperty("EmplClassDesc")
  private String EmplClassDesc = null;
  @JsonProperty("EffectiveSequence")
  private String EffectiveSequence = null;
  @JsonProperty("ApptEndDate")
  private Date ApptEndDate = null;
  @JsonProperty("SupervisorId")
  private String SupervisorId = null;
  @JsonProperty("PersonOrg")
  private String PersonOrg = null;
  @JsonProperty("JobCode")
  private String JobCode = null;
  @JsonProperty("JobCodeDesc")
  private String JobCodeDesc = null;
  @JsonProperty("PayFreq")
  private String PayFreq = null;
  @JsonProperty("hRStatus")
  private String hRStatus = null;
  @JsonProperty("EmplStatus")
  private String EmplStatus = null;
  @JsonProperty("ActionDate")
  private Date ActionDate = null;
  @JsonProperty("ActionReason")
  private String ActionReason = null;
  @JsonProperty("fTE")
  private String fTE = null;
  @JsonProperty("HireDate")
  private Date HireDate = null;
  @JsonProperty("TerminationDate")
  private Date TerminationDate = null;
  @JsonProperty("ExpectedReturnDate")
  private Date ExpectedReturnDate = null;
  @JsonProperty("ExpectedEndDate")
  private Date ExpectedEndDate = null;
  @JsonProperty("Step")
  private String Step = null;
  @JsonProperty("Compensation")
  private List<Compensation> Compensation = new ArrayList<Compensation>();
  public String getLocation() {
    return Location;
  }
  public void setLocation(String Location) {
    this.Location = Location;
  }

  public String getType() {
    return Type;
  }
  public void setType(String Type) {
    this.Type = Type;
  }

  public List<Position> getPosition() {
    return Position;
  }
  public void setPosition(List<Position> Position) {
    this.Position = Position;
  }

  public String getAction() {
    return Action;
  }
  public void setAction(String Action) {
    this.Action = Action;
  }

  public List<Distribution> getDistribution() {
    return Distribution;
  }
  public void setDistribution(List<Distribution> Distribution) {
    this.Distribution = Distribution;
  }

  public Date getEffectiveDate() {
    return EffectiveDate;
  }
  public void setEffectiveDate(Date EffectiveDate) {
    this.EffectiveDate = EffectiveDate;
  }

  public String getEmplRecord() {
    return EmplRecord;
  }
  public void setEmplRecord(String EmplRecord) {
    this.EmplRecord = EmplRecord;
  }

  public String getAnnualRate() {
    return AnnualRate;
  }
  public void setAnnualRate(String AnnualRate) {
    this.AnnualRate = AnnualRate;
  }

  public String getAmount() {
    return Amount;
  }
  public void setAmount(String Amount) {
    this.Amount = Amount;
  }

  public String getEmplID() {
    return EmplID;
  }
  public void setEmplID(String EmplID) {
    this.EmplID = EmplID;
  }

  public String getBusinessUnit() {
    return BusinessUnit;
  }
  public void setBusinessUnit(String BusinessUnit) {
    this.BusinessUnit = BusinessUnit;
  }

  public List<Department> getDepartment() {
    return Department;
  }
  public void setDepartment(List<Department> Department) {
    this.Department = Department;
  }

  public String getEmplClass() {
    return EmplClass;
  }
  public void setEmplClass(String EmplClass) {
    this.EmplClass = EmplClass;
  }

  public String getEmplClassDesc() {
    return EmplClassDesc;
  }
  public void setEmplClassDesc(String EmplClassDesc) {
    this.EmplClassDesc = EmplClassDesc;
  }

  public String getEffectiveSequence() {
    return EffectiveSequence;
  }
  public void setEffectiveSequence(String EffectiveSequence) {
    this.EffectiveSequence = EffectiveSequence;
  }

  public Date getApptEndDate() {
    return ApptEndDate;
  }
  public void setApptEndDate(Date ApptEndDate) {
    this.ApptEndDate = ApptEndDate;
  }

  public String getSupervisorId() {
    return SupervisorId;
  }
  public void setSupervisorId(String SupervisorId) {
    this.SupervisorId = SupervisorId;
  }

  public String getPersonOrg() {
    return PersonOrg;
  }
  public void setPersonOrg(String PersonOrg) {
    this.PersonOrg = PersonOrg;
  }

  public String getJobCode() {
    return JobCode;
  }
  public void setJobCode(String JobCode) {
    this.JobCode = JobCode;
  }

  public String getJobCodeDesc() {
    return JobCodeDesc;
  }
  public void setJobCodeDesc(String JobCodeDesc) {
    this.JobCodeDesc = JobCodeDesc;
  }

  public String getPayFreq() {
    return PayFreq;
  }
  public void setPayFreq(String PayFreq) {
    this.PayFreq = PayFreq;
  }

  public String getHRStatus() {
    return hRStatus;
  }
  public void setHRStatus(String hRStatus) {
    this.hRStatus = hRStatus;
  }

  public String getEmplStatus() {
    return EmplStatus;
  }
  public void setEmplStatus(String EmplStatus) {
    this.EmplStatus = EmplStatus;
  }

  public Date getActionDate() {
    return ActionDate;
  }
  public void setActionDate(Date ActionDate) {
    this.ActionDate = ActionDate;
  }

  public String getActionReason() {
    return ActionReason;
  }
  public void setActionReason(String ActionReason) {
    this.ActionReason = ActionReason;
  }

  public String getFTE() {
    return fTE;
  }
  public void setFTE(String fTE) {
    this.fTE = fTE;
  }

  public Date getHireDate() {
    return HireDate;
  }
  public void setHireDate(Date HireDate) {
    this.HireDate = HireDate;
  }

  public Date getTerminationDate() {
    return TerminationDate;
  }
  public void setTerminationDate(Date TerminationDate) {
    this.TerminationDate = TerminationDate;
  }

  public Date getExpectedReturnDate() {
    return ExpectedReturnDate;
  }
  public void setExpectedReturnDate(Date ExpectedReturnDate) {
    this.ExpectedReturnDate = ExpectedReturnDate;
  }

  public Date getExpectedEndDate() {
    return ExpectedEndDate;
  }
  public void setExpectedEndDate(Date ExpectedEndDate) {
    this.ExpectedEndDate = ExpectedEndDate;
  }

  public String getStep() {
    return Step;
  }
  public void setStep(String Step) {
    this.Step = Step;
  }

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

