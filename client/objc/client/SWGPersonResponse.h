#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGDate.h"
#import "SWGPersonList.h"

@interface SWGPersonResponse : SWGObject

@property(nonatomic) SWGDate* Timestamp;  

@property(nonatomic) NSString* Source;  

@property(nonatomic) NSString* CorrelationId;  

@property(nonatomic) SWGPersonList* PersonList;  

- (id) Timestamp: (SWGDate*) Timestamp
     Source: (NSString*) Source
     CorrelationId: (NSString*) CorrelationId
     PersonList: (SWGPersonList*) PersonList;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

