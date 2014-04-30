#import "SWGDate.h"
#import "SWGName.h"

@implementation SWGName

-(id)PrefFirstName: (NSString*) PrefFirstName
    EffectiveDate: (SWGDate*) EffectiveDate
    EmplID: (NSString*) EmplID
    FirstName: (NSString*) FirstName
    LastName: (NSString*) LastName
    MiddleName: (NSString*) MiddleName
    NamePrefix: (NSString*) NamePrefix
    NameSuffix: (NSString*) NameSuffix
    NameType: (NSString*) NameType
{
  _PrefFirstName = PrefFirstName;
  _EffectiveDate = EffectiveDate;
  _EmplID = EmplID;
  _FirstName = FirstName;
  _LastName = LastName;
  _MiddleName = MiddleName;
  _NamePrefix = NamePrefix;
  _NameSuffix = NameSuffix;
  _NameType = NameType;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _PrefFirstName = dict[@"PrefFirstName"]; 
        id EffectiveDate_dict = dict[@"EffectiveDate"];
        if(EffectiveDate_dict != nil)
            _EffectiveDate = [[SWGDate alloc]initWithValues:EffectiveDate_dict];
        _EmplID = dict[@"EmplID"]; 
        _FirstName = dict[@"FirstName"]; 
        _LastName = dict[@"LastName"]; 
        _MiddleName = dict[@"MiddleName"]; 
        _NamePrefix = dict[@"NamePrefix"]; 
        _NameSuffix = dict[@"NameSuffix"]; 
        _NameType = dict[@"NameType"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_PrefFirstName != nil) dict[@"PrefFirstName"] = _PrefFirstName ;
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
        if(_FirstName != nil) dict[@"FirstName"] = _FirstName ;
        if(_LastName != nil) dict[@"LastName"] = _LastName ;
        if(_MiddleName != nil) dict[@"MiddleName"] = _MiddleName ;
        if(_NamePrefix != nil) dict[@"NamePrefix"] = _NamePrefix ;
        if(_NameSuffix != nil) dict[@"NameSuffix"] = _NameSuffix ;
        if(_NameType != nil) dict[@"NameType"] = _NameType ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

