#import "SWGDate.h"
#import "SWGPerson.h"

@implementation SWGPerson

-(id)Address: (NSArray*) Address
    Name: (NSArray*) Name
    Identifier: (SWGIdentifier*) Identifier
    Email: (NSArray*) Email
    EffectiveDate: (SWGDate*) EffectiveDate
    EmplID: (NSString*) EmplID
    EmplType: (NSString*) EmplType
    EffectiveStatus: (NSString*) EffectiveStatus
    BusinessTitle: (NSString*) BusinessTitle
    HomeDept: (NSString*) HomeDept
    Department: (NSArray*) Department
    Phone: (NSArray*) Phone
    Job: (NSArray*) Job
    pOI: (SWGPOI*) pOI
{
  _Address = Address;
  _Name = Name;
  _Identifier = Identifier;
  _Email = Email;
  _EffectiveDate = EffectiveDate;
  _EmplID = EmplID;
  _EmplType = EmplType;
  _EffectiveStatus = EffectiveStatus;
  _BusinessTitle = BusinessTitle;
  _HomeDept = HomeDept;
  _Department = Department;
  _Phone = Phone;
  _Job = Job;
  _pOI = pOI;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        id Address_dict = dict[@"Address"];
        if([Address_dict isKindOfClass:[NSArray class]]) {

            NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[(NSArray*)Address_dict count]];

            if([(NSArray*)Address_dict count] > 0) {
                for (NSDictionary* dict in (NSArray*)Address_dict) {
                    SWGAddress* d = [[SWGAddress alloc] initWithValues:dict];
                    [objs addObject:d];
                }
                
                _Address = [[NSArray alloc] initWithArray:objs];
            }
            else {
                _Address = [[NSArray alloc] init];
            }
        }
        else {
            _Address = [[NSArray alloc] init];
        }
        id Name_dict = dict[@"Name"];
        if([Name_dict isKindOfClass:[NSArray class]]) {

            NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[(NSArray*)Name_dict count]];

            if([(NSArray*)Name_dict count] > 0) {
                for (NSDictionary* dict in (NSArray*)Name_dict) {
                    SWGName* d = [[SWGName alloc] initWithValues:dict];
                    [objs addObject:d];
                }
                
                _Name = [[NSArray alloc] initWithArray:objs];
            }
            else {
                _Name = [[NSArray alloc] init];
            }
        }
        else {
            _Name = [[NSArray alloc] init];
        }
        id Identifier_dict = dict[@"Identifier"];
        if(Identifier_dict != nil)
            _Identifier = [[SWGIdentifier alloc]initWithValues:Identifier_dict];
        id Email_dict = dict[@"Email"];
        if([Email_dict isKindOfClass:[NSArray class]]) {

            NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[(NSArray*)Email_dict count]];

            if([(NSArray*)Email_dict count] > 0) {
                for (NSDictionary* dict in (NSArray*)Email_dict) {
                    SWGEmail* d = [[SWGEmail alloc] initWithValues:dict];
                    [objs addObject:d];
                }
                
                _Email = [[NSArray alloc] initWithArray:objs];
            }
            else {
                _Email = [[NSArray alloc] init];
            }
        }
        else {
            _Email = [[NSArray alloc] init];
        }
        id EffectiveDate_dict = dict[@"EffectiveDate"];
        if(EffectiveDate_dict != nil)
            _EffectiveDate = [[SWGDate alloc]initWithValues:EffectiveDate_dict];
        _EmplID = dict[@"EmplID"]; 
        _EmplType = dict[@"EmplType"]; 
        _EffectiveStatus = dict[@"EffectiveStatus"]; 
        _BusinessTitle = dict[@"BusinessTitle"]; 
        _HomeDept = dict[@"HomeDept"]; 
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
        id Phone_dict = dict[@"Phone"];
        if([Phone_dict isKindOfClass:[NSArray class]]) {

            NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[(NSArray*)Phone_dict count]];

            if([(NSArray*)Phone_dict count] > 0) {
                for (NSDictionary* dict in (NSArray*)Phone_dict) {
                    SWGPhone* d = [[SWGPhone alloc] initWithValues:dict];
                    [objs addObject:d];
                }
                
                _Phone = [[NSArray alloc] initWithArray:objs];
            }
            else {
                _Phone = [[NSArray alloc] init];
            }
        }
        else {
            _Phone = [[NSArray alloc] init];
        }
        id Job_dict = dict[@"Job"];
        if([Job_dict isKindOfClass:[NSArray class]]) {

            NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[(NSArray*)Job_dict count]];

            if([(NSArray*)Job_dict count] > 0) {
                for (NSDictionary* dict in (NSArray*)Job_dict) {
                    SWGJob* d = [[SWGJob alloc] initWithValues:dict];
                    [objs addObject:d];
                }
                
                _Job = [[NSArray alloc] initWithArray:objs];
            }
            else {
                _Job = [[NSArray alloc] init];
            }
        }
        else {
            _Job = [[NSArray alloc] init];
        }
        id pOI_dict = dict[@"pOI"];
        if(pOI_dict != nil)
            _pOI = [[SWGPOI alloc]initWithValues:pOI_dict];
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_Address != nil){
        if([_Address isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGAddress *Address in (NSArray*)_Address) {
                [array addObject:[(SWGObject*)Address asDictionary]];
            }
            dict[@"Address"] = array;
        }
        else if(_Address && [_Address isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Address toString];
            if(dateString){
                dict[@"Address"] = dateString;
            }
        }
        else {
        if(_Address != nil) dict[@"Address"] = [(SWGObject*)_Address asDictionary];
        }
    }
    if(_Name != nil){
        if([_Name isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGName *Name in (NSArray*)_Name) {
                [array addObject:[(SWGObject*)Name asDictionary]];
            }
            dict[@"Name"] = array;
        }
        else if(_Name && [_Name isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Name toString];
            if(dateString){
                dict[@"Name"] = dateString;
            }
        }
        else {
        if(_Name != nil) dict[@"Name"] = [(SWGObject*)_Name asDictionary];
        }
    }
    if(_Identifier != nil){
        if([_Identifier isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGIdentifier *Identifier in (NSArray*)_Identifier) {
                [array addObject:[(SWGObject*)Identifier asDictionary]];
            }
            dict[@"Identifier"] = array;
        }
        else if(_Identifier && [_Identifier isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Identifier toString];
            if(dateString){
                dict[@"Identifier"] = dateString;
            }
        }
        else {
        if(_Identifier != nil) dict[@"Identifier"] = [(SWGObject*)_Identifier asDictionary];
        }
    }
    if(_Email != nil){
        if([_Email isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGEmail *Email in (NSArray*)_Email) {
                [array addObject:[(SWGObject*)Email asDictionary]];
            }
            dict[@"Email"] = array;
        }
        else if(_Email && [_Email isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Email toString];
            if(dateString){
                dict[@"Email"] = dateString;
            }
        }
        else {
        if(_Email != nil) dict[@"Email"] = [(SWGObject*)_Email asDictionary];
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
    if(_EmplID != nil) dict[@"EmplID"] = _EmplID ;
        if(_EmplType != nil) dict[@"EmplType"] = _EmplType ;
        if(_EffectiveStatus != nil) dict[@"EffectiveStatus"] = _EffectiveStatus ;
        if(_BusinessTitle != nil) dict[@"BusinessTitle"] = _BusinessTitle ;
        if(_HomeDept != nil) dict[@"HomeDept"] = _HomeDept ;
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
    if(_Phone != nil){
        if([_Phone isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGPhone *Phone in (NSArray*)_Phone) {
                [array addObject:[(SWGObject*)Phone asDictionary]];
            }
            dict[@"Phone"] = array;
        }
        else if(_Phone && [_Phone isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Phone toString];
            if(dateString){
                dict[@"Phone"] = dateString;
            }
        }
        else {
        if(_Phone != nil) dict[@"Phone"] = [(SWGObject*)_Phone asDictionary];
        }
    }
    if(_Job != nil){
        if([_Job isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGJob *Job in (NSArray*)_Job) {
                [array addObject:[(SWGObject*)Job asDictionary]];
            }
            dict[@"Job"] = array;
        }
        else if(_Job && [_Job isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Job toString];
            if(dateString){
                dict[@"Job"] = dateString;
            }
        }
        else {
        if(_Job != nil) dict[@"Job"] = [(SWGObject*)_Job asDictionary];
        }
    }
    if(_pOI != nil){
        if([_pOI isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGPOI *pOI in (NSArray*)_pOI) {
                [array addObject:[(SWGObject*)pOI asDictionary]];
            }
            dict[@"pOI"] = array;
        }
        else if(_pOI && [_pOI isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_pOI toString];
            if(dateString){
                dict[@"pOI"] = dateString;
            }
        }
        else {
        if(_pOI != nil) dict[@"pOI"] = [(SWGObject*)_pOI asDictionary];
        }
    }
    NSDictionary* output = [dict copy];
    return output;
}

@end

