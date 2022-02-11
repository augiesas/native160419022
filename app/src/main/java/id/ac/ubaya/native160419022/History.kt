package id.ac.ubaya.native160419022

import java.util.*

class History(var username:String, var date:Date, var description:String) {
    override fun toString(): String {
        return "Name: $username, Date: $date, Description: $description"
    }
}