#import <Foundation/Foundation.h>
#import "SWGObject.h"

@interface SWGAddress : SWGObject

@property(nonatomic) NSString* AddressType;  

@property(nonatomic) NSString* State;  

@property(nonatomic) NSString* EmplID;  

@property(nonatomic) NSString* Address1;  

@property(nonatomic) NSString* Address2;  

@property(nonatomic) NSString* Address3;  

@property(nonatomic) NSString* City;  

@property(nonatomic) NSString* PostCode;  

@property(nonatomic) NSString* CountryCode;  

- (id) AddressType: (NSString*) AddressType
     State: (NSString*) State
     EmplID: (NSString*) EmplID
     Address1: (NSString*) Address1
     Address2: (NSString*) Address2
     Address3: (NSString*) Address3
     City: (NSString*) City
     PostCode: (NSString*) PostCode
     CountryCode: (NSString*) CountryCode;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

