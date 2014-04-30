#import "SWGDate.h"
#import "SWGPOI.h"

@implementation SWGPOI

-(id)Description: (NSString*) Description
    EffectiveDate: (SWGDate*) EffectiveDate
    EmplID: (NSString*) EmplID
    EffectiveStatus: (NSString*) EffectiveStatus
    ExpectedEndDate: (SWGDate*) ExpectedEndDate
    pOIType: (NSString*) pOIType
{
  _Description = Description;
  _EffectiveDate = EffectiveDate;
  _EmplID = EmplID;
  _EffectiveStatus = EffectiveStatus;
  _ExpectedEndDate = ExpectedEndDate;
  _pOIType = pOIType;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _Description = dict[@"Description"]; 
        id EffectiveDate_dict = dict[@"EffectiveDate"];
        if(EffectiveDate_dict != nil)
            _EffectiveDate = [[SWGDate alloc]initWithValues:EffectiveDate_dict];
        _EmplID = dict[@"EmplID"]; 
        _EffectiveStatus = dict[@"EffectiveStatus"]; 
        id ExpectedEndDate_dict = dict[@"ExpectedEndDate"];
        if(ExpectedEndDate_dict != nil)
            _ExpectedEndDate = [[SWGDate alloc]initWithValues:ExpectedEndDate_dict];
        _pOIType = dict[@"pOIType"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_Description != nil) dict[@"Description"] = _Description ;
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
        if(_EffectiveStatus != nil) dict[@"EffectiveStatus"] = _EffectiveStatus ;
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
    if(_pOIType != nil) dict[@"pOIType"] = _pOIType ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

