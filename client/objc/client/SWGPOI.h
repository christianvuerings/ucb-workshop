#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"

@interface SWGPOI : SWGObject

@property(nonatomic) NSString* Description;  

@property(nonatomic) SWGDate* EffectiveDate;  

@property(nonatomic) NSString* EmplID;  

@property(nonatomic) NSString* EffectiveStatus;  

@property(nonatomic) SWGDate* ExpectedEndDate;  

@property(nonatomic) NSString* pOIType;  

- (id) Description: (NSString*) Description
     EffectiveDate: (SWGDate*) EffectiveDate
     EmplID: (NSString*) EmplID
     EffectiveStatus: (NSString*) EffectiveStatus
     ExpectedEndDate: (SWGDate*) ExpectedEndDate
     pOIType: (NSString*) pOIType;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

