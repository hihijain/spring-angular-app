import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'finalprice'
})
export class FinalpricePipe implements PipeTransform {

  transform(others: any, arg1: any, arg2: any): any {
    let finalPrice:number = arg1 * arg2 ;
    return finalPrice;
  }

}
