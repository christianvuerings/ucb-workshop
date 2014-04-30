#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGRate.h"

@interface SWGPay : SWGObject

@property(nonatomic) NSString* EmplRecord;  

@property(nonatomic) NSArray* Rate;  

@property(nonatomic) NSString* EmplID;  

- (id) EmplRecord: (NSString*) EmplRecord
     Rate: (NSArray*) Rate
     EmplID: (NSString*) EmplID;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

