#import <Foundation/Foundation.h>
#import "SWGObject.h"

@interface SWGPhone : SWGObject

@property(nonatomic) NSString* Extension;  

@property(nonatomic) NSString* EmplID;  

@property(nonatomic) NSString* CountryCode;  

@property(nonatomic) NSString* PhoneType;  

@property(nonatomic) NSString* PhoneNumber;  

@property(nonatomic) NSString* PrefPhoneFlag;  

- (id) Extension: (NSString*) Extension
     EmplID: (NSString*) EmplID
     CountryCode: (NSString*) CountryCode
     PhoneType: (NSString*) PhoneType
     PhoneNumber: (NSString*) PhoneNumber
     PrefPhoneFlag: (NSString*) PrefPhoneFlag;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

