import {numberSale, totalSale, buy, sell} from './product.mjs';
import defval from './secretindegrient.mjs';
let buyer = {
    name : "MG",
    total : 0
};

let item = {
    price : 120,
    quantity : 100
};

console.log("Total expense till now = ", totalSale);
buy(buyer,item);
sell(item);
console.log("Total expense of buyer = ", buyer.total);
console.log("Quantity of item left = ", item.quantity);
console.log("Total Sale tell now = ", totalSale);
console.log("Number of items sold", numberSale);
console.log(defval);