#import "SWGDate.h"
#import "SWGPersonResponse.h"

@implementation SWGPersonResponse

-(id)Timestamp: (SWGDate*) Timestamp
    Source: (NSString*) Source
    CorrelationId: (NSString*) CorrelationId
    PersonList: (SWGPersonList*) PersonList
{
  _Timestamp = Timestamp;
  _Source = Source;
  _CorrelationId = CorrelationId;
  _PersonList = PersonList;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        id Timestamp_dict = dict[@"Timestamp"];
        if(Timestamp_dict != nil)
            _Timestamp = [[SWGDate alloc]initWithValues:Timestamp_dict];
        _Source = dict[@"Source"]; 
        _CorrelationId = dict[@"CorrelationId"]; 
        id PersonList_dict = dict[@"PersonList"];
        if(PersonList_dict != nil)
            _PersonList = [[SWGPersonList alloc]initWithValues:PersonList_dict];
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_Timestamp != nil){
        if([_Timestamp isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *Timestamp in (NSArray*)_Timestamp) {
                [array addObject:[(SWGObject*)Timestamp asDictionary]];
            }
            dict[@"Timestamp"] = array;
        }
        else if(_Timestamp && [_Timestamp isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Timestamp toString];
            if(dateString){
                dict[@"Timestamp"] = dateString;
            }
        }
        else {
        if(_Timestamp != nil) dict[@"Timestamp"] = [(SWGObject*)_Timestamp asDictionary];
        }
    }
    if(_Source != nil) dict[@"Source"] = _Source ;
        if(_CorrelationId != nil) dict[@"CorrelationId"] = _CorrelationId ;
        if(_PersonList != nil){
        if([_PersonList isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGPersonList *PersonList in (NSArray*)_PersonList) {
                [array addObject:[(SWGObject*)PersonList asDictionary]];
            }
            dict[@"PersonList"] = array;
        }
        else if(_PersonList && [_PersonList isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_PersonList toString];
            if(dateString){
                dict[@"PersonList"] = dateString;
            }
        }
        else {
        if(_PersonList != nil) dict[@"PersonList"] = [(SWGObject*)_PersonList asDictionary];
        }
    }
    NSDictionary* output = [dict copy];
    return output;
}

@end

