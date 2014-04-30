#import "SWGDate.h"
#import "SWGJob.h"

@implementation SWGJob

-(id)Location: (NSString*) Location
    Type: (NSString*) Type
    Position: (NSArray*) Position
    Action: (NSString*) Action
    Distribution: (NSArray*) Distribution
    EffectiveDate: (SWGDate*) EffectiveDate
    EmplRecord: (NSString*) EmplRecord
    AnnualRate: (NSString*) AnnualRate
    Amount: (NSString*) Amount
    EmplID: (NSString*) EmplID
    BusinessUnit: (NSString*) BusinessUnit
    Department: (NSArray*) Department
    EmplClass: (NSString*) EmplClass
    EmplClassDesc: (NSString*) EmplClassDesc
    EffectiveSequence: (NSString*) EffectiveSequence
    ApptEndDate: (SWGDate*) ApptEndDate
    SupervisorId: (NSString*) SupervisorId
    PersonOrg: (NSString*) PersonOrg
    JobCode: (NSString*) JobCode
    JobCodeDesc: (NSString*) JobCodeDesc
    PayFreq: (NSString*) PayFreq
    hRStatus: (NSString*) hRStatus
    EmplStatus: (NSString*) EmplStatus
    ActionDate: (SWGDate*) ActionDate
    ActionReason: (NSString*) ActionReason
    fTE: (NSString*) fTE
    HireDate: (SWGDate*) HireDate
    TerminationDate: (SWGDate*) TerminationDate
    ExpectedReturnDate: (SWGDate*) ExpectedReturnDate
    ExpectedEndDate: (SWGDate*) ExpectedEndDate
    Step: (NSString*) Step
    Compensation: (NSArray*) Compensation
{
  _Location = Location;
  _Type = Type;
  _Position = Position;
  _Action = Action;
  _Distribution = Distribution;
  _EffectiveDate = EffectiveDate;
  _EmplRecord = EmplRecord;
  _AnnualRate = AnnualRate;
  _Amount = Amount;
  _EmplID = EmplID;
  _BusinessUnit = BusinessUnit;
  _Department = Department;
  _EmplClass = EmplClass;
  _EmplClassDesc = EmplClassDesc;
  _EffectiveSequence = EffectiveSequence;
  _ApptEndDate = ApptEndDate;
  _SupervisorId = SupervisorId;
  _PersonOrg = PersonOrg;
  _JobCode = JobCode;
  _JobCodeDesc = JobCodeDesc;
  _PayFreq = PayFreq;
  _hRStatus = hRStatus;
  _EmplStatus = EmplStatus;
  _ActionDate = ActionDate;
  _ActionReason = ActionReason;
  _fTE = fTE;
  _HireDate = HireDate;
  _TerminationDate = TerminationDate;
  _ExpectedReturnDate = ExpectedReturnDate;
  _ExpectedEndDate = ExpectedEndDate;
  _Step = Step;
  _Compensation = Compensation;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _Location = dict[@"Location"]; 
        _Type = dict[@"Type"]; 
        id Position_dict = dict[@"Position"];
        if([Position_dict isKindOfClass:[NSArray class]]) {

            NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[(NSArray*)Position_dict count]];

            if([(NSArray*)Position_dict count] > 0) {
                for (NSDictionary* dict in (NSArray*)Position_dict) {
                    SWGPosition* d = [[SWGPosition alloc] initWithValues:dict];
                    [objs addObject:d];
                }
                
                _Position = [[NSArray alloc] initWithArray:objs];
            }
            else {
                _Position = [[NSArray alloc] init];
            }
        }
        else {
            _Position = [[NSArray alloc] init];
        }
        _Action = dict[@"Action"]; 
        id Distribution_dict = dict[@"Distribution"];
        if([Distribution_dict isKindOfClass:[NSArray class]]) {

            NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[(NSArray*)Distribution_dict count]];

            if([(NSArray*)Distribution_dict count] > 0) {
                for (NSDictionary* dict in (NSArray*)Distribution_dict) {
                    SWGDistribution* d = [[SWGDistribution alloc] initWithValues:dict];
                    [objs addObject:d];
                }
                
                _Distribution = [[NSArray alloc] initWithArray:objs];
            }
            else {
                _Distribution = [[NSArray alloc] init];
            }
        }
        else {
            _Distribution = [[NSArray alloc] init];
        }
        id EffectiveDate_dict = dict[@"EffectiveDate"];
        if(EffectiveDate_dict != nil)
            _EffectiveDate = [[SWGDate alloc]initWithValues:EffectiveDate_dict];
        _EmplRecord = dict[@"EmplRecord"]; 
        _AnnualRate = dict[@"AnnualRate"]; 
        _Amount = dict[@"Amount"]; 
        _EmplID = dict[@"EmplID"]; 
        _BusinessUnit = dict[@"BusinessUnit"]; 
        id Department_dict = dict[@"Department"];
        if([Department_dict isKindOfClass:[NSArray class]]) {

            NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[(NSArray*)Department_dict count]];

            if([(NSArray*)Department_dict count] > 0) {
                for (NSDictionary* dict in (NSArray*)Department_dict) {
                    SWGDepartment* d = [[SWGDepartment alloc] initWithValues:dict];
                    [objs addObject:d];
                }
                
                _Department = [[NSArray alloc] initWithArray:objs];
            }
            else {
                _Department = [[NSArray alloc] init];
            }
        }
        else {
            _Department = [[NSArray alloc] init];
        }
        _EmplClass = dict[@"EmplClass"]; 
        _EmplClassDesc = dict[@"EmplClassDesc"]; 
        _EffectiveSequence = dict[@"EffectiveSequence"]; 
        id ApptEndDate_dict = dict[@"ApptEndDate"];
        if(ApptEndDate_dict != nil)
            _ApptEndDate = [[SWGDate alloc]initWithValues:ApptEndDate_dict];
        _SupervisorId = dict[@"SupervisorId"]; 
        _PersonOrg = dict[@"PersonOrg"]; 
        _JobCode = dict[@"JobCode"]; 
        _JobCodeDesc = dict[@"JobCodeDesc"]; 
        _PayFreq = dict[@"PayFreq"]; 
        _hRStatus = dict[@"hRStatus"]; 
        _EmplStatus = dict[@"EmplStatus"]; 
        id ActionDate_dict = dict[@"ActionDate"];
        if(ActionDate_dict != nil)
            _ActionDate = [[SWGDate alloc]initWithValues:ActionDate_dict];
        _ActionReason = dict[@"ActionReason"]; 
        _fTE = dict[@"fTE"]; 
        id HireDate_dict = dict[@"HireDate"];
        if(HireDate_dict != nil)
            _HireDate = [[SWGDate alloc]initWithValues:HireDate_dict];
        id TerminationDate_dict = dict[@"TerminationDate"];
        if(TerminationDate_dict != nil)
            _TerminationDate = [[SWGDate alloc]initWithValues:TerminationDate_dict];
        id ExpectedReturnDate_dict = dict[@"ExpectedReturnDate"];
        if(ExpectedReturnDate_dict != nil)
            _ExpectedReturnDate = [[SWGDate alloc]initWithValues:ExpectedReturnDate_dict];
        id ExpectedEndDate_dict = dict[@"ExpectedEndDate"];
        if(ExpectedEndDate_dict != nil)
            _ExpectedEndDate = [[SWGDate alloc]initWithValues:ExpectedEndDate_dict];
        _Step = dict[@"Step"]; 
        id Compensation_dict = dict[@"Compensation"];
        if([Compensation_dict isKindOfClass:[NSArray class]]) {

            NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[(NSArray*)Compensation_dict count]];

            if([(NSArray*)Compensation_dict count] > 0) {
                for (NSDictionary* dict in (NSArray*)Compensation_dict) {
                    SWGCompensation* d = [[SWGCompensation alloc] initWithValues:dict];
                    [objs addObject:d];
                }
                
                _Compensation = [[NSArray alloc] initWithArray:objs];
            }
            else {
                _Compensation = [[NSArray alloc] init];
            }
        }
        else {
            _Compensation = [[NSArray alloc] init];
        }
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_Location != nil) dict[@"Location"] = _Location ;
        if(_Type != nil) dict[@"Type"] = _Type ;
        if(_Position != nil){
        if([_Position isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGPosition *Position in (NSArray*)_Position) {
                [array addObject:[(SWGObject*)Position asDictionary]];
            }
            dict[@"Position"] = array;
        }
        else if(_Position && [_Position isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Position toString];
            if(dateString){
                dict[@"Position"] = dateString;
            }
        }
        else {
        if(_Position != nil) dict[@"Position"] = [(SWGObject*)_Position asDictionary];
        }
    }
    if(_Action != nil) dict[@"Action"] = _Action ;
        if(_Distribution != nil){
        if([_Distribution isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDistribution *Distribution in (NSArray*)_Distribution) {
                [array addObject:[(SWGObject*)Distribution asDictionary]];
            }
            dict[@"Distribution"] = array;
        }
        else if(_Distribution && [_Distribution isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Distribution toString];
            if(dateString){
                dict[@"Distribution"] = dateString;
            }
        }
        else {
        if(_Distribution != nil) dict[@"Distribution"] = [(SWGObject*)_Distribution asDictionary];
        }
    }
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
        if(_AnnualRate != nil) dict[@"AnnualRate"] = _AnnualRate ;
        if(_Amount != nil) dict[@"Amount"] = _Amount ;
        if(_EmplID != nil) dict[@"EmplID"] = _EmplID ;
        if(_BusinessUnit != nil) dict[@"BusinessUnit"] = _BusinessUnit ;
        if(_Department != nil){
        if([_Department isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDepartment *Department in (NSArray*)_Department) {
                [array addObject:[(SWGObject*)Department asDictionary]];
            }
            dict[@"Department"] = array;
        }
        else if(_Department && [_Department isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Department toString];
            if(dateString){
                dict[@"Department"] = dateString;
            }
        }
        else {
        if(_Department != nil) dict[@"Department"] = [(SWGObject*)_Department asDictionary];
        }
    }
    if(_EmplClass != nil) dict[@"EmplClass"] = _EmplClass ;
        if(_EmplClassDesc != nil) dict[@"EmplClassDesc"] = _EmplClassDesc ;
        if(_EffectiveSequence != nil) dict[@"EffectiveSequence"] = _EffectiveSequence ;
        if(_ApptEndDate != nil){
        if([_ApptEndDate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *ApptEndDate in (NSArray*)_ApptEndDate) {
                [array addObject:[(SWGObject*)ApptEndDate asDictionary]];
            }
            dict[@"ApptEndDate"] = array;
        }
        else if(_ApptEndDate && [_ApptEndDate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_ApptEndDate toString];
            if(dateString){
                dict[@"ApptEndDate"] = dateString;
            }
        }
        else {
        if(_ApptEndDate != nil) dict[@"ApptEndDate"] = [(SWGObject*)_ApptEndDate asDictionary];
        }
    }
    if(_SupervisorId != nil) dict[@"SupervisorId"] = _SupervisorId ;
        if(_PersonOrg != nil) dict[@"PersonOrg"] = _PersonOrg ;
        if(_JobCode != nil) dict[@"JobCode"] = _JobCode ;
        if(_JobCodeDesc != nil) dict[@"JobCodeDesc"] = _JobCodeDesc ;
        if(_PayFreq != nil) dict[@"PayFreq"] = _PayFreq ;
        if(_hRStatus != nil) dict[@"hRStatus"] = _hRStatus ;
        if(_EmplStatus != nil) dict[@"EmplStatus"] = _EmplStatus ;
        if(_ActionDate != nil){
        if([_ActionDate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *ActionDate in (NSArray*)_ActionDate) {
                [array addObject:[(SWGObject*)ActionDate asDictionary]];
            }
            dict[@"ActionDate"] = array;
        }
        else if(_ActionDate && [_ActionDate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_ActionDate toString];
            if(dateString){
                dict[@"ActionDate"] = dateString;
            }
        }
        else {
        if(_ActionDate != nil) dict[@"ActionDate"] = [(SWGObject*)_ActionDate asDictionary];
        }
    }
    if(_ActionReason != nil) dict[@"ActionReason"] = _ActionReason ;
        if(_fTE != nil) dict[@"fTE"] = _fTE ;
        if(_HireDate != nil){
        if([_HireDate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *HireDate in (NSArray*)_HireDate) {
                [array addObject:[(SWGObject*)HireDate asDictionary]];
            }
            dict[@"HireDate"] = array;
        }
        else if(_HireDate && [_HireDate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_HireDate toString];
            if(dateString){
                dict[@"HireDate"] = dateString;
            }
        }
        else {
        if(_HireDate != nil) dict[@"HireDate"] = [(SWGObject*)_HireDate asDictionary];
        }
    }
    if(_TerminationDate != nil){
        if([_TerminationDate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *TerminationDate in (NSArray*)_TerminationDate) {
                [array addObject:[(SWGObject*)TerminationDate asDictionary]];
            }
            dict[@"TerminationDate"] = array;
        }
        else if(_TerminationDate && [_TerminationDate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_TerminationDate toString];
            if(dateString){
                dict[@"TerminationDate"] = dateString;
            }
        }
        else {
        if(_TerminationDate != nil) dict[@"TerminationDate"] = [(SWGObject*)_TerminationDate asDictionary];
        }
    }
    if(_ExpectedReturnDate != nil){
        if([_ExpectedReturnDate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *ExpectedReturnDate in (NSArray*)_ExpectedReturnDate) {
                [array addObject:[(SWGObject*)ExpectedReturnDate asDictionary]];
            }
            dict[@"ExpectedReturnDate"] = array;
        }
        else if(_ExpectedReturnDate && [_ExpectedReturnDate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_ExpectedReturnDate toString];
            if(dateString){
                dict[@"ExpectedReturnDate"] = dateString;
            }
        }
        else {
        if(_ExpectedReturnDate != nil) dict[@"ExpectedReturnDate"] = [(SWGObject*)_ExpectedReturnDate asDictionary];
        }
    }
    if(_ExpectedEndDate != nil){
        if([_ExpectedEndDate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *ExpectedEndDate in (NSArray*)_ExpectedEndDate) {
                [array addObject:[(SWGObject*)ExpectedEndDate asDictionary]];
            }
            dict[@"ExpectedEndDate"] = array;
        }
        else if(_ExpectedEndDate && [_ExpectedEndDate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_ExpectedEndDate toString];
            if(dateString){
                dict[@"ExpectedEndDate"] = dateString;
            }
        }
        else {
        if(_ExpectedEndDate != nil) dict[@"ExpectedEndDate"] = [(SWGObject*)_ExpectedEndDate asDictionary];
        }
    }
    if(_Step != nil) dict[@"Step"] = _Step ;
        if(_Compensation != nil){
        if([_Compensation isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGCompensation *Compensation in (NSArray*)_Compensation) {
                [array addObject:[(SWGObject*)Compensation asDictionary]];
            }
            dict[@"Compensation"] = array;
        }
        else if(_Compensation && [_Compensation isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Compensation toString];
            if(dateString){
                dict[@"Compensation"] = dateString;
            }
        }
        else {
        if(_Compensation != nil) dict[@"Compensation"] = [(SWGObject*)_Compensation asDictionary];
        }
    }
    NSDictionary* output = [dict copy];
    return output;
}

@end

