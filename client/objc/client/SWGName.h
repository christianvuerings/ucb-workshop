#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"

@interface SWGName : SWGObject

@property(nonatomic) NSString* PrefFirstName;  

@property(nonatomic) SWGDate* EffectiveDate;  

@property(nonatomic) NSString* EmplID;  

@property(nonatomic) NSString* FirstName;  

@property(nonatomic) NSString* LastName;  

@property(nonatomic) NSString* MiddleName;  

@property(nonatomic) NSString* NamePrefix;  

@property(nonatomic) NSString* NameSuffix;  

@property(nonatomic) NSString* NameType;  

- (id) PrefFirstName: (NSString*) PrefFirstName
     EffectiveDate: (SWGDate*) EffectiveDate
     EmplID: (NSString*) EmplID
     FirstName: (NSString*) FirstName
     LastName: (NSString*) LastName
     MiddleName: (NSString*) MiddleName
     NamePrefix: (NSString*) NamePrefix
     NameSuffix: (NSString*) NameSuffix
     NameType: (NSString*) NameType;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

