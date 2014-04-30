#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGPerson.h"

@interface SWGPersonList : SWGObject

@property(nonatomic) NSArray* Person;  

- (id) Person: (NSArray*) Person;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

