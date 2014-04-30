#import "SWGDate.h"
#import "SWGIdentifier.h"

@implementation SWGIdentifier

-(id)EmplID: (NSString*) EmplID
    BirthDate: (SWGDate*) BirthDate
    Gender: (NSString*) Gender
{
  _EmplID = EmplID;
  _BirthDate = BirthDate;
  _Gender = Gender;
  return self;
}

-(id) initWithValues:(NSDictionary*)dict
{
    self = [super init];
    if(self) {
        _EmplID = dict[@"EmplID"]; 
        id BirthDate_dict = dict[@"BirthDate"];
        if(BirthDate_dict != nil)
            _BirthDate = [[SWGDate alloc]initWithValues:BirthDate_dict];
        _Gender = dict[@"Gender"]; 
        

    }
    return self;
}

-(NSDictionary*) asDictionary {
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(_EmplID != nil) dict[@"EmplID"] = _EmplID ;
        if(_BirthDate != nil){
        if([_BirthDate isKindOfClass:[NSArray class]]){
            NSMutableArray * array = [[NSMutableArray alloc] init];
            for( SWGDate *BirthDate in (NSArray*)_BirthDate) {
                [array addObject:[(SWGObject*)BirthDate asDictionary]];
            }
            dict[@"BirthDate"] = array;
        }
        else if(_BirthDate && [_BirthDate isKindOfClass:[SWGDate class]]) {
            NSString * dateString = [(SWGDate*)_BirthDate toString];
            if(dateString){
                dict[@"BirthDate"] = dateString;
            }
        }
        else {
        if(_BirthDate != nil) dict[@"BirthDate"] = [(SWGObject*)_BirthDate asDictionary];
        }
    }
    if(_Gender != nil) dict[@"Gender"] = _Gender ;
        NSDictionary* output = [dict copy];
    return output;
}

@end

