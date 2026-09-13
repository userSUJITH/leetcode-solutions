/**
 * @param {number[]} order
 * @param {number[]} friends
 * @return {number[]}
 */
var recoverOrder = function(order, friends) {
     let arr = order.filter((x)=>{
        if(friends.includes(x)){
            return x;
        }
     })
     return arr;
};