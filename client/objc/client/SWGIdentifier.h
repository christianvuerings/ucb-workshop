#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"

@interface SWGIdentifier : SWGObject

@property(nonatomic) NSString* EmplID;  

@property(nonatomic) SWGDate* BirthDate;  

@property(nonatomic) NSString* Gender;  

- (id) EmplID: (NSString*) EmplID
     BirthDate: (SWGDate*) BirthDate
     Gender: (NSString*) Gender;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

