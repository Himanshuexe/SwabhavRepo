function makeCustomer() {
    let _id, _name;
    let customer = {};

    customer.setId = function (id) {
        _id = id;
    }

    customer.setName = function (name) {
        _name = name;
    }

    customer.getDetails = function () {
        return `Customer name: ${_name} and Id: ${_id}`;
    }

    return customer;
}

let cust = makeCustomer();
console.log(cust);
cust.setId(101);
cust.setName("Himanshu");
console.log(cust.getDetails());