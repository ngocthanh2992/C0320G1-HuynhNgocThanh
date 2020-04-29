class Customer {
    constructor(name,cmnd,birthday,email,address,typeCustomer,typeRoom,discount,quantityIncluded,rentDay,typeService) {
        this.name = name;
        this.cmnd = cmnd;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.typeCustomer = typeCustomer;
        this.typeRoom = typeRoom;
        this.discount = discount;
        this.quantityIncluded = quantityIncluded;
        this.rentDay = rentDay;
        this.typeService = typeService;
    }
    getName(){
        return this.name;
    }
    getCmnd(){
        return this.cmnd;
    }
    getBirthday(){
        return this.birthday;
    }
    getEmail(){
        return this.email;
    }
    getAddress(){
        return this.address;
    }
    geTypeCustomer(){
        return this.typeCustomer;
    }
    getTypeRoom(){
        return this.typeRoom;
    }
    getDiscount(){
        return this.discount;
    }
    getQuantityIncluded(){
        return this.quantityIncluded;
    }
    getRentDay(){
        return this.rentDay;
    }
    getTypeService(){
        return this.typeService;
    }
    setName(name){
         this.name = name;
    }
    setCmnd(cmnd){
         this.cmnd = cmnd;
    }
    setBirthday(birthday){
         this.birthday = birthday;
    }
    setEmail(email){
         this.email = email;
    }
    setAddress(address){
        this.address = address;
    }
    setTypeCustomer(typecustomer){
        this.typeCustomer = typecustomer;
    }
    setTypeRoom(typeroom){
        this.typeRoom = typeroom;
    }
    setDiscount(discount){
        this.discount = discount;
    }
    setQuantityIncluded(quantityincluded){
        this.quantityIncluded = quantityincluded;
    }
    setRentDay(rentday){
        this.rentDay = rentday;
    }
    setTypeService(typeservice){
        this.typeService = typeservice;
    }
    totalPay(){
        let money = 0;
        if (this.getTypeService() === "Villa"){
            money = 500;
        } else if (this.getTypeService() === "House"){
            money = 300;
        }else if (this.getTypeService() === "Room"){
            money = 200;
        }
        return this.getRentDay()*money*(1-this.getDiscount()/100);
    }
}