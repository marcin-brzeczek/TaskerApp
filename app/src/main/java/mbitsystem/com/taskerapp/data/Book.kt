package mbitsystem.com.taskerapp.data

import java.util.UUID

data class Book(
    val id:String  = UUID.randomUUID().toString(),
    val title:String?,
    val description:String?,
    val completed :Boolean = false
){

}