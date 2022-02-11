package id.ac.ubaya.native160419022

class Profile(var username:String, var email:String, var address:String) {
    override fun toString(): String {
        return "$username, $email, $address"
    }
}