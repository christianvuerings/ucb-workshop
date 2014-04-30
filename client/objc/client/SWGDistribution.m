#import "SWGDate.h"
#import "SWGDistribution.h"

@implementation SWGDistribution

-(id)EffectiveDate: (SWGDate*) EffectiveDate
    EmplRecord: (NSString*) EmplRecord
    Amount: (NSString*) Amount
    EmplID: (NSString*) EmplID
    DeptId: (NSString*) DeptId
    DeptDesc: (NSString*) DeptDesc
    PayBeginDate: (SWGDate*) PayBeginDate
    PayEndDate: (SWGDate*) PayEndDate
    DistPct: (NSString*) DistPct
    BusinessUnit: (NSString*) BusinessUnit
    Account: (NSString*) Account
    FundCode: (NSString*) FundCode
    ProgramCode: (NSString*) ProgramCode
    CharField1: (NSString*) CharField1
    CharField2: (NSString*) CharField2
    EarningCode: (NSString*) EarningCode
    WorkStudyCode: (NSString*) WorkStudyCode
    BudgetedFte: (NSString*) BudgetedFte
{
  _EffectiveDate = EffectiveDate;
  _EmplRecord = EmplRecord;
  _Amount = Amount;
  _EmplID = EmplID;
  _DeptId = DeptId;
  _DeptDesc = DeptDesc;
  _PayBeginDate = PayBeginDate;
  _PayEndDate = PayEndDate;
  _DistPct = DistPct;
  _BusinessUnit = BusinessUnit;
  _Account = Account;
  _FundCode = FundCode;
  _ProgramCode = ProgramCode;
  _CharField1 = CharField1;
  _CharField2 = CharField2;
  _EarningCode = EarningCode;
  _WorkStudyCode = WorkStudyCode;
  _BudgetedFte = BudgetedFte;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        id EffectiveDate_dict = dict[@"EffectiveDate"];
        if(EffectiveDate_dict != nil)
            _EffectiveDate = [[SWGDate alloc]initWithValues:EffectiveDate_dict];
        _EmplRecord = dict[@"EmplRecord"]; 
        _Amount = dict[@"Amount"]; 
        _EmplID = dict[@"EmplID"]; 
        _DeptId = dict[@"DeptId"]; 
        _DeptDesc = dict[@"DeptDesc"]; 
        id PayBeginDate_dict = dict[@"PayBeginDate"];
        if(PayBeginDate_dict != nil)
            _PayBeginDate = [[SWGDate alloc]initWithValues:PayBeginDate_dict];
        id PayEndDate_dict = dict[@"PayEndDate"];
        if(PayEndDate_dict != nil)
            _PayEndDate = [[SWGDate alloc]initWithValues:PayEndDate_dict];
        _DistPct = dict[@"DistPct"]; 
        _BusinessUnit = dict[@"BusinessUnit"]; 
        _Account = dict[@"Account"]; 
        _FundCode = dict[@"FundCode"]; 
        _ProgramCode = dict[@"ProgramCode"]; 
        _CharField1 = dict[@"CharField1"]; 
        _CharField2 = dict[@"CharField2"]; 
        _EarningCode = dict[@"EarningCode"]; 
        _WorkStudyCode = dict[@"WorkStudyCode"]; 
        _BudgetedFte = dict[@"BudgetedFte"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_EffectiveDate != nil){
        if([_EffectiveDate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *EffectiveDate in (NSArray*)_EffectiveDate) {
                [array addObject:[(SWGObject*)EffectiveDate asDictionary]];
            }
            dict[@"EffectiveDate"] = array;
        }
        else if(_EffectiveDate && [_EffectiveDate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_EffectiveDate toString];
            if(dateString){
                dict[@"EffectiveDate"] = dateString;
            }
        }
        else {
        if(_EffectiveDate != nil) dict[@"EffectiveDate"] = [(SWGObject*)_EffectiveDate asDictionary];
        }
    }
    if(_EmplRecord != nil) dict[@"EmplRecord"] = _EmplRecord ;
        if(_Amount != nil) dict[@"Amount"] = _Amount ;
        if(_EmplID != nil) dict[@"EmplID"] = _EmplID ;
        if(_DeptId != nil) dict[@"DeptId"] = _DeptId ;
        if(_DeptDesc != nil) dict[@"DeptDesc"] = _DeptDesc ;
        if(_PayBeginDate != nil){
        if([_PayBeginDate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *PayBeginDate in (NSArray*)_PayBeginDate) {
                [array addObject:[(SWGObject*)PayBeginDate asDictionary]];
            }
            dict[@"PayBeginDate"] = array;
        }
        else if(_PayBeginDate && [_PayBeginDate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_PayBeginDate toString];
            if(dateString){
                dict[@"PayBeginDate"] = dateString;
            }
        }
        else {
        if(_PayBeginDate != nil) dict[@"PayBeginDate"] = [(SWGObject*)_PayBeginDate asDictionary];
        }
    }
    if(_PayEndDate != nil){
        if([_PayEndDate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *PayEndDate in (NSArray*)_PayEndDate) {
                [array addObject:[(SWGObject*)PayEndDate asDictionary]];
            }
            dict[@"PayEndDate"] = array;
        }
        else if(_PayEndDate && [_PayEndDate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_PayEndDate toString];
            if(dateString){
                dict[@"PayEndDate"] = dateString;
            }
        }
        else {
        if(_PayEndDate != nil) dict[@"PayEndDate"] = [(SWGObject*)_PayEndDate asDictionary];
        }
    }
    if(_DistPct != nil) dict[@"DistPct"] = _DistPct ;
        if(_BusinessUnit != nil) dict[@"BusinessUnit"] = _BusinessUnit ;
        if(_Account != nil) dict[@"Account"] = _Account ;
        if(_FundCode != nil) dict[@"FundCode"] = _FundCode ;
        if(_ProgramCode != nil) dict[@"ProgramCode"] = _ProgramCode ;
        if(_CharField1 != nil) dict[@"CharField1"] = _CharField1 ;
        if(_CharField2 != nil) dict[@"CharField2"] = _CharField2 ;
        if(_EarningCode != nil) dict[@"EarningCode"] = _EarningCode ;
        if(_WorkStudyCode != nil) dict[@"WorkStudyCode"] = _WorkStudyCode ;
        if(_BudgetedFte != nil) dict[@"BudgetedFte"] = _BudgetedFte ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

