#import "SWGDate.h"
#import "SWGPersonList.h"

@implementation SWGPersonList

-(id)Person: (NSArray*) Person
{
  _Person = Person;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        id Person_dict = dict[@"Person"];
        if([Person_dict isKindOfClass:[NSArray class]]) {

            NSMutableArray * objs = [[NSMutableArray alloc] initWithCapacity:[(NSArray*)Person_dict count]];

            if([(NSArray*)Person_dict count] > 0) {
                for (NSDictionary* dict in (NSArray*)Person_dict) {
                    SWGPerson* d = [[SWGPerson alloc] initWithValues:dict];
                    [objs addObject:d];
                }
                
                _Person = [[NSArray alloc] initWithArray:objs];
            }
            else {
                _Person = [[NSArray alloc] init];
            }
        }
        else {
            _Person = [[NSArray alloc] init];
        }
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_Person != nil){
        if([_Person isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGPerson *Person in (NSArray*)_Person) {
                [array addObject:[(SWGObject*)Person asDictionary]];
            }
            dict[@"Person"] = array;
        }
        else if(_Person && [_Person isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_Person toString];
            if(dateString){
                dict[@"Person"] = dateString;
            }
        }
        else {
        if(_Person != nil) dict[@"Person"] = [(SWGObject*)_Person asDictionary];
        }
    }
    NSDictionary* output = [dict copy];
    return output;
}

@end

