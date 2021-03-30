import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'discount'
})
export class DiscountPipe implements PipeTransform {

  //How to generate custom pipe ->  ng g p pipes\discount
  transform(value: any, ...args: any[]): any {
    let originalPrice = value;
    let afterDiscount = originalPrice - (originalPrice*0.05);
    return afterDiscount;
  }

}
