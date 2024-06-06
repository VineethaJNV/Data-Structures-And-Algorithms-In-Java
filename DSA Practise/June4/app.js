let a = 32
let b = 47852


let lastDigitOfA = a % 10
let lastDigitOfB = b% 10

// if (lastDigitOfA === lastDigitOfB){
//     console.log("last digits are not same")
// }else{
//     console.log("Lat digits are not same")
// }

function haveSameLastDigit(num1, num2) {
    let lastDigitOfNum1 = num1.toString().slice(-1);
    let lastDigitOfNum2 = num2.toString().slice(-1);
    if(lastDigitOfNum1 === lastDigitOfNum2){
        console.log("last digits are same")
    }else{
        console.log("Last digits are not same")

    }
  } 

haveSameLastDigit(32, 342)