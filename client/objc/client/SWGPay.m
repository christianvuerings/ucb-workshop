#import "SWGDate.h"
#import "SWGPay.h"

@implementation SWGPay

-(id)EmplRecord: (NSString*) EmplRecord
    Rate: (NSArray*) Rate
    EmplID: (NSString*) EmplID
{
  _EmplRecord = EmplRecord;
  _Rate = Rate;
  _EmplID = EmplID;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _EmplRecord = dict[@"EmplRecord"]; 
        id Rate_dict = dict[@"Rate"];
        if([Rate_dict isKindOfClass:[NSArray class]]) {

            NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[(NSArray*)Rate_dict count]];

            if([(NSArray*)Rate_dict count] > 0) {
                for (NSDictionary* dict in (NSArray*)Rate_dict) {
                    SWGRate* d = [[SWGRate alloc] initWithValues:dict];
                    [objs addObject:d];
                }
                
                _Rate = [[NSArray alloc] initWithArray:objs];
            }
            else {
                _Rate = [[NSArray alloc] init];
            }
        }
        else {
            _Rate = [[NSArray alloc] init];
        }
        _EmplID = dict[@"EmplID"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_EmplRecord != nil) dict[@"EmplRecord"] = _EmplRecord ;
        if(_Rate != nil){
        if([_Rate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGRate *Rate in (NSArray*)_Rate) {
                [array addObject:[(SWGObject*)Rate asDictionary]];
            }
            dict[@"Rate"] = array;
        }
        else if(_Rate && [_Rate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Rate toString];
            if(dateString){
                dict[@"Rate"] = dateString;
            }
        }
        else {
        if(_Rate != nil) dict[@"Rate"] = [(SWGObject*)_Rate asDictionary];
        }
    }
    if(_EmplID != nil) dict[@"EmplID"] = _EmplID ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

