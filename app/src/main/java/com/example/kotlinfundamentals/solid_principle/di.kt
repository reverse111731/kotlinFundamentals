package com.example.kotlinfundamentals.solid_principle

interface Repository {
    fun getData(): String
}

class DatabaseRepository : Repository {
    override fun getData() = "Data from database"
}

class NetworkRepository : Repository {
    override fun getData() = "Data from network"
}

class Service(private val repository: Repository) {

    // This is bad
//    private var newRepositoryInstance = NetworkRepository()

    fun serviceGetData(): String {
        return repository.getData()
    }
}


fun main(){
    val service = Service(DatabaseRepository())
    println(service.serviceGetData()) // prints "Data from database"

    val newService = Service(NetworkRepository())
    println(newService.serviceGetData()) // prints "Data from network"
}