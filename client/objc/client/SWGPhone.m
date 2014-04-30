#import "SWGDate.h"
#import "SWGPhone.h"

@implementation SWGPhone

-(id)Extension: (NSString*) Extension
    EmplID: (NSString*) EmplID
    CountryCode: (NSString*) CountryCode
    PhoneType: (NSString*) PhoneType
    PhoneNumber: (NSString*) PhoneNumber
    PrefPhoneFlag: (NSString*) PrefPhoneFlag
{
  _Extension = Extension;
  _EmplID = EmplID;
  _CountryCode = CountryCode;
  _PhoneType = PhoneType;
  _PhoneNumber = PhoneNumber;
  _PrefPhoneFlag = PrefPhoneFlag;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _Extension = dict[@"Extension"]; 
        _EmplID = dict[@"EmplID"]; 
        _CountryCode = dict[@"CountryCode"]; 
        _PhoneType = dict[@"PhoneType"]; 
        _PhoneNumber = dict[@"PhoneNumber"]; 
        _PrefPhoneFlag = dict[@"PrefPhoneFlag"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_Extension != nil) dict[@"Extension"] = _Extension ;
        if(_EmplID != nil) dict[@"EmplID"] = _EmplID ;
        if(_CountryCode != nil) dict[@"CountryCode"] = _CountryCode ;
        if(_PhoneType != nil) dict[@"PhoneType"] = _PhoneType ;
        if(_PhoneNumber != nil) dict[@"PhoneNumber"] = _PhoneNumber ;
        if(_PrefPhoneFlag != nil) dict[@"PrefPhoneFlag"] = _PrefPhoneFlag ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

