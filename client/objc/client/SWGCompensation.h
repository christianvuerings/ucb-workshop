#import <Foundation/Foundation.h>
#import "SWGObject.h"
#import "SWGPay.h"

@interface SWGCompensation : SWGObject

@property(nonatomic) NSString* HourlyRate;  

@property(nonatomic) NSString* MonthlyRate;  

@property(nonatomic) NSString* AnnualRate;  

@property(nonatomic) SWGPay* Pay;  

@property(nonatomic) NSString* EmplID;  

- (id) HourlyRate: (NSString*) HourlyRate
     MonthlyRate: (NSString*) MonthlyRate
     AnnualRate: (NSString*) AnnualRate
     Pay: (SWGPay*) Pay
     EmplID: (NSString*) EmplID;

- (id) initWithValues: (NSDictionary*)dict;
- (NSDictionary*) asDictionary;


@end

