#import "SWGDate.h"
#import "SWGPosition.h"

@implementation SWGPosition

-(id)EffectiveDate: (SWGDate*) EffectiveDate
    EmplID: (NSString*) EmplID
    PostionNumber: (NSString*) PostionNumber
    PostionDesc: (NSString*) PostionDesc
    ReportsTo: (NSString*) ReportsTo
{
  _EffectiveDate = EffectiveDate;
  _EmplID = EmplID;
  _PostionNumber = PostionNumber;
  _PostionDesc = PostionDesc;
  _ReportsTo = ReportsTo;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        id EffectiveDate_dict = dict[@"EffectiveDate"];
        if(EffectiveDate_dict != nil)
            _EffectiveDate = [[SWGDate alloc]initWithValues:EffectiveDate_dict];
        _EmplID = dict[@"EmplID"]; 
        _PostionNumber = dict[@"PostionNumber"]; 
        _PostionDesc = dict[@"PostionDesc"]; 
        _ReportsTo = dict[@"ReportsTo"]; 
        

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
    if(_EmplID != nil) dict[@"EmplID"] = _EmplID ;
        if(_PostionNumber != nil) dict[@"PostionNumber"] = _PostionNumber ;
        if(_PostionDesc != nil) dict[@"PostionDesc"] = _PostionDesc ;
        if(_ReportsTo != nil) dict[@"ReportsTo"] = _ReportsTo ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

