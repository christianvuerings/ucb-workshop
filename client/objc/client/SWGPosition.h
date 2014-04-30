#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"

@interface SWGPosition : SWGObject

@property(nonatomic) SWGDate* EffectiveDate;  

@property(nonatomic) NSString* EmplID;  

@property(nonatomic) NSString* PostionNumber;  

@property(nonatomic) NSString* PostionDesc;  

@property(nonatomic) NSString* ReportsTo;  

- (id) EffectiveDate: (SWGDate*) EffectiveDate
     EmplID: (NSString*) EmplID
     PostionNumber: (NSString*) PostionNumber
     PostionDesc: (NSString*) PostionDesc
     ReportsTo: (NSString*) ReportsTo;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

