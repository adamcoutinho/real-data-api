package com.main.real.data.service.account.integration.registercustomer.dto

enum class AccountStatusEnum(private val id:Int, private val label:String) {

    BLOCKED(1,"BLOCKED"),
    UNLOCKED(2,"UNLOCKED"),
    CANCELD(3,"CANCELED");

    companion object {

        fun of(label:String): AccountStatusEnum? = AccountStatusEnum.values().filter {
            it.label.equals(label)
        }.firstOrNull()

        fun of(id:Int): AccountStatusEnum? = AccountStatusEnum.values().filter {
            it.id.compareTo(id)==0
        }.firstOrNull()

    }

}