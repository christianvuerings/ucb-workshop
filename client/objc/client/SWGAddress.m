#import "SWGDate.h"
#import "SWGAddress.h"

@implementation SWGAddress

-(id)AddressType: (NSString*) AddressType
    State: (NSString*) State
    EmplID: (NSString*) EmplID
    Address1: (NSString*) Address1
    Address2: (NSString*) Address2
    Address3: (NSString*) Address3
    City: (NSString*) City
    PostCode: (NSString*) PostCode
    CountryCode: (NSString*) CountryCode
{
  _AddressType = AddressType;
  _State = State;
  _EmplID = EmplID;
  _Address1 = Address1;
  _Address2 = Address2;
  _Address3 = Address3;
  _City = City;
  _PostCode = PostCode;
  _CountryCode = CountryCode;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _AddressType = dict[@"AddressType"]; 
        _State = dict[@"State"]; 
        _EmplID = dict[@"EmplID"]; 
        _Address1 = dict[@"Address1"]; 
        _Address2 = dict[@"Address2"]; 
        _Address3 = dict[@"Address3"]; 
        _City = dict[@"City"]; 
        _PostCode = dict[@"PostCode"]; 
        _CountryCode = dict[@"CountryCode"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_AddressType != nil) dict[@"AddressType"] = _AddressType ;
        if(_State != nil) dict[@"State"] = _State ;
        if(_EmplID != nil) dict[@"EmplID"] = _EmplID ;
        if(_Address1 != nil) dict[@"Address1"] = _Address1 ;
        if(_Address2 != nil) dict[@"Address2"] = _Address2 ;
        if(_Address3 != nil) dict[@"Address3"] = _Address3 ;
        if(_City != nil) dict[@"City"] = _City ;
        if(_PostCode != nil) dict[@"PostCode"] = _PostCode ;
        if(_CountryCode != nil) dict[@"CountryCode"] = _CountryCode ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

