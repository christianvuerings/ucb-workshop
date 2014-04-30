#import "SWGDate.h"
#import "SWGCompensation.h"

@implementation SWGCompensation

-(id)HourlyRate: (NSString*) HourlyRate
    MonthlyRate: (NSString*) MonthlyRate
    AnnualRate: (NSString*) AnnualRate
    Pay: (SWGPay*) Pay
    EmplID: (NSString*) EmplID
{
  _HourlyRate = HourlyRate;
  _MonthlyRate = MonthlyRate;
  _AnnualRate = AnnualRate;
  _Pay = Pay;
  _EmplID = EmplID;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _HourlyRate = dict[@"HourlyRate"]; 
        _MonthlyRate = dict[@"MonthlyRate"]; 
        _AnnualRate = dict[@"AnnualRate"]; 
        id Pay_dict = dict[@"Pay"];
        if(Pay_dict != nil)
            _Pay = [[SWGPay alloc]initWithValues:Pay_dict];
        _EmplID = dict[@"EmplID"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_HourlyRate != nil) dict[@"HourlyRate"] = _HourlyRate ;
        if(_MonthlyRate != nil) dict[@"MonthlyRate"] = _MonthlyRate ;
        if(_AnnualRate != nil) dict[@"AnnualRate"] = _AnnualRate ;
        if(_Pay != nil){
        if([_Pay isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGPay *Pay in (NSArray*)_Pay) {
                [array addObject:[(SWGObject*)Pay asDictionary]];
            }
            dict[@"Pay"] = array;
        }
        else if(_Pay && [_Pay isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Pay toString];
            if(dateString){
                dict[@"Pay"] = dateString;
            }
        }
        else {
        if(_Pay != nil) dict[@"Pay"] = [(SWGObject*)_Pay asDictionary];
        }
    }
    if(_EmplID != nil) dict[@"EmplID"] = _EmplID ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

