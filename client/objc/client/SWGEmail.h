#import <Foundation/Foundation.h>
#import "SWGObject.h"

@interface SWGEmail : SWGObject

@property(nonatomic) NSString* EmplID;  

@property(nonatomic) NSString* EmailType;  

@property(nonatomic) NSString* EmailAddress;  

@property(nonatomic) NSString* PrefEmailFlag;  

- (id) EmplID: (NSString*) EmplID
     EmailType: (NSString*) EmailType
     EmailAddress: (NSString*) EmailAddress
     PrefEmailFlag: (NSString*) PrefEmailFlag;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

