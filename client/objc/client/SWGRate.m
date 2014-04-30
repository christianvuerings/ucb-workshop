#import "SWGDate.h"
#import "SWGRate.h"

@implementation SWGRate

-(id)code: (NSString*) code
    Amount: (NSString*) Amount
    OffAboveScale: (NSString*) OffAboveScale
{
  _code = code;
  _Amount = Amount;
  _OffAboveScale = OffAboveScale;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _code = dict[@"code"]; 
        _Amount = dict[@"Amount"]; 
        _OffAboveScale = dict[@"OffAboveScale"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_code != nil) dict[@"code"] = _code ;
        if(_Amount != nil) dict[@"Amount"] = _Amount ;
        if(_OffAboveScale != nil) dict[@"OffAboveScale"] = _OffAboveScale ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

