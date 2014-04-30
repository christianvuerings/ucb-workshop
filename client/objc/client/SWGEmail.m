#import "SWGDate.h"
#import "SWGEmail.h"

@implementation SWGEmail

-(id)EmplID: (NSString*) EmplID
    EmailType: (NSString*) EmailType
    EmailAddress: (NSString*) EmailAddress
    PrefEmailFlag: (NSString*) PrefEmailFlag
{
  _EmplID = EmplID;
  _EmailType = EmailType;
  _EmailAddress = EmailAddress;
  _PrefEmailFlag = PrefEmailFlag;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _EmplID = dict[@"EmplID"]; 
        _EmailType = dict[@"EmailType"]; 
        _EmailAddress = dict[@"EmailAddress"]; 
        _PrefEmailFlag = dict[@"PrefEmailFlag"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_EmplID != nil) dict[@"EmplID"] = _EmplID ;
        if(_EmailType != nil) dict[@"EmailType"] = _EmailType ;
        if(_EmailAddress != nil) dict[@"EmailAddress"] = _EmailAddress ;
        if(_PrefEmailFlag != nil) dict[@"PrefEmailFlag"] = _PrefEmailFlag ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

