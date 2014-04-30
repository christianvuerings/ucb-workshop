#import <Foundation/Foundation.h>
#import "SWGObject.h"

@interface SWGRate : SWGObject

@property(nonatomic) NSString* code;  

@property(nonatomic) NSString* Amount;  

@property(nonatomic) NSString* OffAboveScale;  

- (id) code: (NSString*) code
     Amount: (NSString*) Amount
     OffAboveScale: (NSString*) OffAboveScale;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

