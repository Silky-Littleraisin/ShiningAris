//
//  DetailViewController.h
//  ShiningAris
//
//  Created by Tian Zehan on 10/9/1 R.
//  Copyright © 1 Reiwa Tian Zehan. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface DetailViewController : UIViewController

@property (strong, nonatomic) NSDate *detailItem;
@property (weak, nonatomic) IBOutlet UILabel *detailDescriptionLabel;

@end

