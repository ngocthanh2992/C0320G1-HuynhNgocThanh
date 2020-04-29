class Employee {
    constructor(name,birthday,phone,email,cmnd,level,location) {
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.cmnd = cmnd;
        this.level = level;
        this.location = location;
    }
    getName(){
        return this.name
    }
    getBirthday(){
        return this.birthday;
    }
    getPhone(){
        return this.phone;
    }
    getEmail(){
        return this.email;
    }
    getCmnd(){
        return this.cmnd;
    }
    getLevel(){
        return this.level;
    }
    getLocation(){
        return this.location;
    }
    getSalary(){
        if (this.getLocation() ==="Manager"){
            this.salary = 500;
        } else if (this.getLocation() === "Sale"){
            this.salary = 300;
        } else if (this.getLocation() === "Marketing"){
            this.salary = 200;
        }
        return this.salary;
    }
    setName(name){
        this.name = name;
    }
    setBirthday(birthday){
        this.birthday = birthday;
    }
    setPhone(phone){
        this.phone= phone;
    }
    setEmail(email){
        this.email = email;
    }
    setCmnd(cmnd){
        this.cmnd = cmnd;
    }
    setLevel(level){
        this.level = level;
    }
    setLocation(location){
        this.location = location;
    }
}