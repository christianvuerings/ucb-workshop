package edu.berkeley.model;

import java.util.Date;
public class Distribution {
  private Date EffectiveDate = null;
  private String EmplRecord = null;
  private String Amount = null;
  private String EmplID = null;
  private String DeptId = null;
  private String DeptDesc = null;
  private Date PayBeginDate = null;
  private Date PayEndDate = null;
  private String DistPct = null;
  private String BusinessUnit = null;
  private String Account = null;
  private String FundCode = null;
  private String ProgramCode = null;
  private String CharField1 = null;
  private String CharField2 = null;
  private String EarningCode = null;
  private String WorkStudyCode = null;
  private String BudgetedFte = null;
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

  public String getDeptId() {
    return DeptId;
  }
  public void setDeptId(String DeptId) {
    this.DeptId = DeptId;
  }

  public String getDeptDesc() {
    return DeptDesc;
  }
  public void setDeptDesc(String DeptDesc) {
    this.DeptDesc = DeptDesc;
  }

  public Date getPayBeginDate() {
    return PayBeginDate;
  }
  public void setPayBeginDate(Date PayBeginDate) {
    this.PayBeginDate = PayBeginDate;
  }

  public Date getPayEndDate() {
    return PayEndDate;
  }
  public void setPayEndDate(Date PayEndDate) {
    this.PayEndDate = PayEndDate;
  }

  public String getDistPct() {
    return DistPct;
  }
  public void setDistPct(String DistPct) {
    this.DistPct = DistPct;
  }

  public String getBusinessUnit() {
    return BusinessUnit;
  }
  public void setBusinessUnit(String BusinessUnit) {
    this.BusinessUnit = BusinessUnit;
  }

  public String getAccount() {
    return Account;
  }
  public void setAccount(String Account) {
    this.Account = Account;
  }

  public String getFundCode() {
    return FundCode;
  }
  public void setFundCode(String FundCode) {
    this.FundCode = FundCode;
  }

  public String getProgramCode() {
    return ProgramCode;
  }
  public void setProgramCode(String ProgramCode) {
    this.ProgramCode = ProgramCode;
  }

  public String getCharField1() {
    return CharField1;
  }
  public void setCharField1(String CharField1) {
    this.CharField1 = CharField1;
  }

  public String getCharField2() {
    return CharField2;
  }
  public void setCharField2(String CharField2) {
    this.CharField2 = CharField2;
  }

  public String getEarningCode() {
    return EarningCode;
  }
  public void setEarningCode(String EarningCode) {
    this.EarningCode = EarningCode;
  }

  public String getWorkStudyCode() {
    return WorkStudyCode;
  }
  public void setWorkStudyCode(String WorkStudyCode) {
    this.WorkStudyCode = WorkStudyCode;
  }

  public String getBudgetedFte() {
    return BudgetedFte;
  }
  public void setBudgetedFte(String BudgetedFte) {
    this.BudgetedFte = BudgetedFte;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distribution {\n");
    sb.append("  EffectiveDate: ").append(EffectiveDate).append("\n");
    sb.append("  EmplRecord: ").append(EmplRecord).append("\n");
    sb.append("  Amount: ").append(Amount).append("\n");
    sb.append("  EmplID: ").append(EmplID).append("\n");
    sb.append("  DeptId: ").append(DeptId).append("\n");
    sb.append("  DeptDesc: ").append(DeptDesc).append("\n");
    sb.append("  PayBeginDate: ").append(PayBeginDate).append("\n");
    sb.append("  PayEndDate: ").append(PayEndDate).append("\n");
    sb.append("  DistPct: ").append(DistPct).append("\n");
    sb.append("  BusinessUnit: ").append(BusinessUnit).append("\n");
    sb.append("  Account: ").append(Account).append("\n");
    sb.append("  FundCode: ").append(FundCode).append("\n");
    sb.append("  ProgramCode: ").append(ProgramCode).append("\n");
    sb.append("  CharField1: ").append(CharField1).append("\n");
    sb.append("  CharField2: ").append(CharField2).append("\n");
    sb.append("  EarningCode: ").append(EarningCode).append("\n");
    sb.append("  WorkStudyCode: ").append(WorkStudyCode).append("\n");
    sb.append("  BudgetedFte: ").append(BudgetedFte).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

