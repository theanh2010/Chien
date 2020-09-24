let name = document.getElementById('name');
let cmnd = document.getElementById('cmnd');
let email = document.getElementById('email');
let birthDate = document.getElementById('birthDate');
let address = document.getElementById('address');
let customer = document.getElementById('customer');
let discount = document.getElementById('discount');
let amount = document.getElementById('amount');
let rentDays = document.getElementById('rentDays');
let sevice = document.getElementById('sevice');
let room = document.getElementById('room');

//Hàm lấy thông tin.
function input() {
    document.getElementById('displayName').innerText = name.value;
    document.getElementById('displayCmnd').innerText = cmnd.value;
    document.getElementById('displayemail').innerText = email.value;
    document.getElementById('displayBirthDate').innerText = birthDate.value;
    document.getElementById('displayAddress').innerText = address.value;
    document.getElementById('displayCustomer').innerText = customer.value;
    document.getElementById('displayDiscount').innerText = discount.value;
    document.getElementById('displayAmount').innerText = amount.value;
    document.getElementById('displayRentDays').innerText = rentDays.value;
    document.getElementById('displaySevice').innerText = sevice.value;
    document.getElementById('displayRoom1').innerText = room.value;
    let saleUp = parseInt(discount.value);
    let rentDay = parseInt(rentDays.value);
    let cost;
    switch (sevice.value) {
        case "Villa" :
            cost = 500 * rentDay * ( 1 - saleUp/100);
            break;
        case "House" :
            cost = 300 * rentDay * ( 1 - saleUp/100);
            break;
        case "Room" :
            cost = 100 * rentDay * ( 1 - saleUp/100);
            break;
}
    document.getElementById('displayCost').innerHTML = cost;
}

