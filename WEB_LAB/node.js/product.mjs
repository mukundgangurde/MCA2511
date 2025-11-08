export let numberSale = 0;
export let totalSale = 0;

export function buy(buyer, item)
{
    buyer.total = buyer.total+item.price;
}

export function sell(item)
{
    totalSale = totalSale+item.price;
    numberSale = numberSale + 1;
    item.quantity = item.quantity-1;
    return 0;
}
