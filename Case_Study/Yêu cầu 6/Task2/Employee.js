 // let Employee = function () {
 //     this.getName = function () {
 //         return this.name;
 //     };
 //    this.getBirthDay = function () {
 //        return this.birthday ;
 //    };
 //    this.getPhone = function () {
 //        return this.phone ;
 //    };
 //    this.getEmail = function () {
 //        return this.email ;
 //    };
 //    this.getCmnd = function () {
 //        return this.cmnd ;
 //    };
 //    this.getLevel = function () {
 //        return this.level ;
 //    };
 //    this.getLocation = function () {
 //        return this.location ;
 //    };
 //    this.getSalary = function () {
 //        if (this.getLocation() === "Manager"){
 //            this.salary = 500 ;
 //        } else if (this.getLocation() === "Sale") {
 //            this.salary = 300 ;
 //        } else if (this.getLocation() === "Marketing"){
 //            this.salary = 200 ;
 //        }
 //        return this.salary ;
 //    };
 //    this.setName = function (name) {
 //         this.name = name ;
 //     };
 //    this.setCmnd = function (cmnd) {
 //        this.cmnd = cmnd ;
 //    };
 //    this.setBirthday = function (birthDay) {
 //        this.birthday = birthDay ;
 //    };
 //    this.setPhone = function (phone) {
 //        this.phone = phone ;
 //    };
 //    this.setEmail = function (email) {
 //        this.email = email ;
 //    };
 //    this.setLevel = function (level) {
 //        this.level = level ;
 //    };
 //    this.setLocation = function (location) {
 //        this.location = location ;
 //    }
 //
 // };
 class Employee {
     constructor(name, cmnd, birthDay, phone, email, level, location, salary) {
         this.name = name;
         this.cmnd = cmnd;
         this.birthDay = birthDay;
         this.phone = phone;
         this.email = email;
         this.level = level;
         this.location = location;
         this.salary = salary ;
     }
     setName (name){
          this.name = name;
     };
     setCmnd (cmnd){
          this.cmnd = cmnd;
     };
     setBirthDay (birthDay){
          this.birthDay = birthDay;
     };
     setPhone (phone){
          this.phone = phone;
     };
     setEmail (email){
          this.email = email;
     };
     setLevel (level){
          this.level = level;
     };
     setLocation (location){
          this.location = location;
     };
     setSalary (salary) {
         this.salary = salary;
     }

     getName (){
         return this.name;
     };
     getCmnd (){
         return this.cmnd;
     };
     getBirthDay (){
         return this.birthDay;
     };
     getPhone (){
         return this.phone;
     };
     getEmail (){
         return this.email;
     };
     getLevel (){
         return this.level;
     };
     getLocation (){
         return this.location;
     };
     getSalary(){
         if (this.getLocation() === "Manager"){
                        this.salary = 500 ;
                    } else if (this.getLocation() === "Sale") {
                        this.salary = 300 ;
                    } else if (this.getLocation() === "Marketing"){
                        this.salary = 200 ;
                    }
                    return this.salary ;
     }
 }
 // let Employee1 = new Employee() ;